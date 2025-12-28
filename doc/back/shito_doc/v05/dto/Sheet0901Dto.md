# Sheet0901Dto

## 概要

政党交付金使途報告書V5の様式9の1（領収書等を徴し難かった支出の内訳）のデータDto。

## プロパティ

| プロパティ名 | XMLタグ名 |        データ型         |    説明    |
| ------------ | --------- | ----------------------- | ---------- |
| `list`       | `ROW`     | `List<RowShito0901Dto>` | 項目リスト |

## `RowShito0901Dto` (`ROW`) の詳細

`list` 内に含まれる `ROW` タグの各項目は、以下の構造を持つ `RowShito0901Dto` で表現されます。

| プロパティ名  |  XMLタグ名   | データ型  |            説明            |
| ------------- | ------------ | --------- | -------------------------- |
| `rowNo`       | `ICHIREN_NO` | `Integer` | 行番号                     |
| `itemName`    | `KOMOKU`     | `String`  | 項目                       |
| `digest`      | `TEKIYOU`    | `String`  | 摘要                       |
| `amount`      | `KINGAKU`    | `Long`    | 金額                       |
| `accrualDate` | `DT`         | `String`  | 発生日                     |
| `explainText` | `JIJYOU`     | `String`  | 領収書が徴しがたかった事情 |
