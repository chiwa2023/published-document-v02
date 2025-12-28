# Sheet0805Dto

## 概要

政党交付金使途報告書V5の様式8の5（支部交付金の内訳）のデータDto。

## プロパティ

| プロパティ名 |  XMLタグ名   |        データ型         |    説明    |
| ------------ | ------------ | ----------------------- | ---------- |
| `sumAmount`  | `KINGAKU_GK` | `Long`                  | 合計金額   |
| `list`       | `ROW`        | `List<RowShito0805Dto>` | 項目リスト |

## `RowShito0805Dto` (`ROW`) の詳細

`list` 内に含まれる `ROW` タグの各項目は、以下の構造を持つ `RowShito0805Dto` で表現されます。

| プロパティ名  |  XMLタグ名   | データ型  |   説明   |
| ------------- | ------------ | --------- | -------- |
| `rowNo`       | `ICHIREN_NO` | `Integer` | 行番号   |
| `sibuName`    | `SIBU_NM`    | `String`  | 支部名称 |
| `amount`      | `KINGAKU`    | `Long`    | 金額     |
| `accrualDate` | `DT`         | `String`  | 発生日   |
| `purpose`     | `MOKUTEKI`   | `String`  | 目的     |
| `bikou`       | `BIKOU`      | `String`  | 備考     |
| `rowKbn`      | `ROWKBN`     | `Integer` | 行区分   |
