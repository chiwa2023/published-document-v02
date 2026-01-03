# AllBookHeaderDto

## 概要

政治資金収支報告書V5のヘッダ項目です。

## XML要素

このDtoは、`AllBookShushiV05Dto` の子要素として `HEAD` タグで表現され、文書ヘッダを構成する要素です。内部のシートデータはありません。

## プロパティ

|  プロパティ名  |    XMLタグ名     | データ型 |           説明           |    値の制限    |
| :------------- | :--------------- | :------- | :----------------------- | :------------- |
| `version`      | `VERSION`        | `String` | バージョン番号           | 未調査／未実装 |
| `appName`      | `APP`            | `String` | アプリ名称               | 未調査／未実装 |
| `fileFormatNo` | `FILE_FORMAT_NO` | `String` | ファイルフォーマット名称 | 未調査／未実装 |
| `flgKokuji`    | `KOKUJI_APP_FLG` | `String` | 告示フラグ               | 未調査／未実装 |
| `chouboAppVer` | `CHOUBO_APP_VER` | `String` | 帳簿アプリバージョン     | 未調査／未実装 |
