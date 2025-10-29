# published-document-v02

政治資金収支報告書・政党交付金使途報告書　公式XML対応を行う

- 現在対応中なのはV5(2019年-)
- 他プロジェクトに導入されることが前提のため、Viteライブラリ化がされている
- back側では公式XML読み取り／書き出しのためのXML構造定義とXMLで使用されている固定値を簡単に利用できる定数として定義を行う。
- front側では公式XMLで使用されている固定値を簡単に利用できるよう定数化する。定数の内容はback側と同一
- front側で、表示が簡単にできるよう、XML定義に基づいたdtoの提供をするかは未定
- 公式XMLについて、値の制限(ex.団体名は60文字以内)が発表された場合は、validationとして制限機能を追加する。

## 他プロジェクトへの導入

### front側への導入

- 導入先プロジェクト内に、任意のフォルダ(ex./lib)を作成し、このプロジェクトのルートに存在する`seijishikin-jp-normalize-x.y.z.tgz`をコピーする
- npm install `複写した.tgzの(相対)パス` とするとinstall完了。
- バージョンアップされ、更新するたびに行う必要がある

### back側への導入

- 導入先プロジェクト内に、任意のフォルダ(ex./lib)を作成し、このプロジェクトの/targetに存在する`published_document-x.x.x-SNAPSHOT.jar`をコピーする

- 導入先プロジェクトの`pom.xml`に下記を追加する

```
    <dependencies>
        ...
        <!--　政治資金関係XML読み書き -->
            <dependency>
                <groupId>net.seijishikin.jp.normalize.manage.kanrensha.lib</groupId>
                <version>0.0.1-SNAPSHOT</version>
                <artifactId>published_document</artifactId>
            </dependency>
        ...
    </dependencies>
```

```
<plugins>
    ...
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-install-plugin</artifactId>
        <inherited>false</inherited>
        <executions>
            <execution>
                <id>published_document</id>
                <phase>clean</phase>
                <goals>
                    <goal>install-file</goal>
                </goals>
                <configuration>
                    <file>
                    ${basedir}/lib/published_document-x.x.x-SNAPSHOT.jar</file>
                    <groupId>
                    net.seijishikin.jp.normalize.manage.kanrensha.lib</groupId>
                    <artifactId>published_document</artifactId>
                    <version>x.y.z-SNAPSHOT</version>
                    <packaging>jar</packaging>
                </configuration>
            </execution>
        </executions>
    </plugin>
    ...
</plugins>
```

- 起動`mvnw spring-boot:run`すれば展開される

## 開発

### front側での開発

環境を一から作成する場合の覚え書きは[develop.md](doc/develop.md)に記載

#### コンパイル(front)

- (必要な実装を行う)
- `index.ts`にexportしたい作成したtsを指定する。このプロジェクトには**表示するコンポーネントが存在しない**のでbuilderがexportの可否を判断できないため
- `npm run build`としてbuildする
- `npm pack`としてパッケージ化する

### back側での開発

環境を一から作成する場合の覚え書きは[develop.md](doc/develop.md)に記載

#### コンパイル(back)

- (必要な実装を行う)
- ビルド処理`mvnw clean install`を行う。このプロジェクトでは**boot起動できない**
