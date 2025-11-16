# github actions 設定

## 1. GitHub Appの作成
GitHub App `Publish Dcocument Gemini Bot` を作成する。

## 2. Google Cloud Platform (GCP) の設定

### 2.1. 新しいGCPプロジェクトの作成
```
gcloud projects create gemini-api-publish-document
```

### 2.2. 必要なAPIを有効化する
```
gcloud services enable aiplatform.googleapis.com iamcredentials.googleapis.com --project gemini-api-publish-document
```

### 2.3. サービスアカウントの作成
```
gcloud iam service-accounts create PublishDocumentAccount \
    --display-name "PublishDocumentAccount" \
    --project gemini-api-publish-document
```

### 2.4. サービスアカウントへの権限付与
```
gcloud projects add-iam-policy-binding gemini-api-publish-document \
    --member "serviceAccount:PublishDocumentAccount@gemini-api-publish-document.iam.gserviceaccount.com" \
    --role "roles/editor"

gcloud projects add-iam-policy-binding gemini-api-publish-document \
    --member "serviceAccount:PublishDocumentAccount@gemini-api-publish-document.iam.gserviceaccount.com" \
    --role "roles/aiplatform.user"
```

### 2.5. Workload Identity Federation の設定

**注意:** Providerの作成で `INVALID_ARGUMENT` エラーが続く場合、一度Poolを削除して再作成することで解決する場合があります。
```
# エラーが発生した場合のみ実行
gcloud iam workload-identity-pools delete "github-pool" --project="gemini-api-publish-document" --location="global"
```

#### 2.5.1. Workload Identity Pool の作成
```
gcloud iam workload-identity-pools create "github-pool" \
    --project="gemini-api-publish-document" \
    --location="global" \
    --display-name="GitHub Actions Pool"
```

#### 2.5.2. Workload Identity Provider の作成
まず、必須の属性マッピングのみでProviderを作成し、その後で追加の属性を更新する。

**ステップ1: 最小限のProviderを作成**
```
gcloud iam workload-identity-pools providers create-oidc "github-provider" \
    --project="gemini-api-publish-document" \
    --location="global" \
    --workload-identity-pool="github-pool" \
    --display-name="GitHub Actions Provider" \
    --attribute-mapping="google.subject=assertion.sub" \
    --issuer-uri="https://token.actions.githubusercontent.com"
```

**ステップ2: 属性マッピングを更新**
```
gcloud iam workload-identity-pools providers update-oidc "github-provider" \
    --project="gemini-api-publish-document" \
    --location="global" \
    --workload-identity-pool="github-pool" \
    --attribute-mapping="google.subject=assertion.sub,attribute.repository=assertion.repository,attribute.actor=assertion.actor"
```

#### 2.5.3. サービスアカウントの権限設定
```
gcloud iam service-accounts add-iam-policy-binding "PublishDocumentAccount@gemini-api-publish-document.iam.gserviceaccount.com" \
    --project="gemini-api-publish-document" \
    --role="roles/iam.workloadIdentityUser" \
    --member="principalSet://iam.googleapis.com/projects/$(gcloud projects describe gemini-api-publish-document --format='value(projectNumber)')/locations/global/workloadIdentityPools/github-pool/attribute.repository/chiwa2023/published-document-v02"
```
```
gcloud iam service-accounts keys create [KEY_FILE_PATH] \
    --iam-account "PublishDocumentAccount@gemini-api-publish-document.iam.gserviceaccount.com" \
    --project gemini-api-publish-document
```
**重要**: このキーファイルは非常に機密性が高いため、安全な場所に保管し、Gitリポジトリにはコミットしないこと。

## 3. GitHubリポジトリの設定
### 3.1. GitHub Appのインストール
作成したGitHub App `Publish Document Gemini Bot` を、このリポジリにインストールする。

### 3.2. GitHub Appの秘密鍵の生成
GitHub Appの設定ページから秘密鍵を生成し、`.pem` ファイルをダウンロードする。
**重要**: このキーファイルは非常に機密性が高いため、安全な場所に保管し、Gitリポジトリにはコミットしないこと。

### 3.3. リポジトリSecretsの設定
(中略)
```

### 3.4. GitHub Appの権限設定
GitHub Appの `Permissions & events` 設定ページで、以下のリポジトリ権限を `Read and write` に設定する。
- Actions
- Contents
- Issues
- Pull requests
- Workflows