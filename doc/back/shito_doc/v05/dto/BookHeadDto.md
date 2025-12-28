# BookHeadDto

## 概要

政党交付金使途報告書V5のヘッダ情報格納要素

## サンプルXML

```xml
<BookHeadDto>
  <VERSION>20191220</VERSION>
  <APP>使途等報告書作成ソフト</APP>
  <APP_FLG>0</APP_FLG>
  <HONBU_FLG>0</HONBU_FLG>
</BookHeadDto>
```

## プロパティと詳細

| プロパティ名 |  XMLタグ名  | データ型 |      説明      |
| ------------ | ----------- | -------- | -------------- |
| `version`    | `VERSION`   | `String` | バージョン番号 |
| `apliName`   | `APP`       | `String` | アプリ名称     |
| `flgApli`    | `APP_FLG`   | `String` | アプリフラグ   |
| `flgHonbu`   | `HONBU_FLG` | `String` | 本部フラグ     |
