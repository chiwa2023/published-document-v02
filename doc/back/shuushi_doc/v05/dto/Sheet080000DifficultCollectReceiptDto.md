# Sheet080000DifficultCollectReceiptDto

## 概要

政治資金収支報告書V5の様式8（領収書を徴し難かった支出項目一覧表）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

| プロパティ名 | XMLタグ名 |                  データ型                   |    説明    |    値の制限    |
| :----------- | :-------- | :------------------------------------------ | :--------- | :------------- |
| `list`       | `ROW`     | `List<Row080000DifficultCollectReceiptDto>` | 項目リスト | 未調査／未実装 |

## 子要素の詳細

### `Row080000DifficultCollectReceiptDto` の詳細

`list` 内に含まれる `Row080000DifficultCollectReceiptDto` の各項目は以下の構造を持ちます。

| プロパティ名  |  XMLタグ名   | データ型  |  説明  |    値の制限    |
| :------------ | :----------- | :-------- | :----- | :------------- |
| `ichirenNo`   | `ICHIREN_NO` | `Integer` | 連番   | 未調査／未実装 |
| `koumoku`     | `KOMOKU`     | `String`  | 項目   | 未調査／未実装 |
| `tekiyou`     | `TEKIYOU`    | `String`  | 摘要   | 未調査／未実装 |
| `kingaku`     | `KINGAKU`    | `Long`    | 金額   | 未調査／未実装 |
| `accrualDate` | `DT`         | `String`  | 発生日 | 未調査／未実装 |
| `jijyou`      | `JIJYOU`     | `String`  | 事情   | 未調査／未実装 |
