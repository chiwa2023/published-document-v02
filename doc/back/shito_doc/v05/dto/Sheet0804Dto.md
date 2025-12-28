# Sheet0804Dto

## 概要

政党交付金使途報告書V5の様式8の4（経費の明細）のデータDto。

## プロパティ

|    プロパティ名     |      XMLタグ名       |        データ型         |        説明        |
| ------------------- | -------------------- | ----------------------- | ------------------ |
| `himoku`            | `HIMOKU`             | `String`                | 費目               |
| `sonotaAmount`      | `KINGAKU_SONOTA_GK`  | `Long`                  | その他合計金額     |
| `sonotaKoufukin`    | `KOUFU_SONOTA_GK`    | `String`                | その他交付金合計   |
| `sonotaMyFunds`     | `KIKIN_SONOTA_GK`    | `String`                | その他政党基金合計 |
| `amountAll`         | `KINGAKU_KINGAKU_GK` | `Long`                  | 全金額合計         |
| `amountAllKoufukin` | `KOUFU_KINGAKU_GK`   | `Long`                  | 交付金金額合計     |
| `amountAllMyFunds`  | `KIKIN_KINGAKU_GK`   | `Long`                  | 政党基金合計       |
| `list`              | `ROW`                | `List<RowShitoCoreDto>` | 項目リスト         |

## `RowShitoCoreDto` (`ROW`) の詳細

`list` 内に含まれる `ROW` タグの各項目は、以下の構造を持つ `RowShitoCoreDto` で表現されます。

|    プロパティ名    |     XMLタグ名      | データ型  |            説明            |
| ------------------ | ------------------ | --------- | -------------------------- |
| `rowNo`            | `ICHIREN_NO`       | `Integer` | 行番号                     |
| `usageItem`        | `MOKUTEKI`         | `String`  | 取引項目                   |
| `amountAll`        | `KINGAKU`          | `Long`    | 総支出額                   |
| `amountKoufukin`   | `KOUFU_JYUUTOU_GK` | `Long`    | 政党交付金空の支出（充当） |
| `amountMyFunds`    | `KIKIN_JYUUTOU_GK` | `Long`    | 政党基金からの支出（充当） |
| `accrualDate`      | `DT`               | `String`  | 発生日                     |
| `payeeName`        | `NM`               | `String`  | 取引相手名称               |
| `address`          | `ADR`              | `String`  | 取引相手住所               |
| `bikou`            | `BIKOU`            | `String`  | 備考                       |
| `flgCollectRecipt` | `RYOUSYU`          | `Integer` | 領収書を徴し難い区分       |
