# Sheet0806Dto

## 概要

政党交付金使途報告書V5の様式8の6（基金等の明細）のデータDto。

## プロパティ

|     プロパティ名     |     XMLタグ名      |    データ型    |      説明       |
| -------------------- | ------------------ | -------------- | --------------- |
| `fundsName`          | `KIKIN_NM`         | `String`       | 基金名称        |
| `totalLastYear`      | `ZENNEN_ZAN_GK`    | `Long`         | 全年まで残合計  |
| `fundsPurpose`       | `MOKUTEKI`         | `String`       | 基金目的        |
| `total`              | `GOUKEI_GK`        | `Long`         | 本年合計        |
| `totalBikou`         | `GOUKEI_BIKOU`     | `String`       | 本年合計備考    |
| `totalThisYear`      | `HONNEN_ZAN_GK`    | `Long`         | 本年残合計      |
| `totalThisYearBikou` | `HONNEN_ZAN_BIKOU` | `String`       | 本年残合計備考  |
| `totalIncrease`      | `ZOUGEN_GK`        | `Long`         | 増減合計        |
| `totalIncreaseBikou` | `ZOUGEN_BIKOU`     | `String`       | 増減合計備考    |
| `kbn080601Dto`       | `KUBUN1`           | `Kbn080601Dto` | 区分1(積み立て) |
| `kbn080602Dto`       | `KUBUN2`           | `Kbn080602Dto` | 区分2(果実)     |
| `kbn080603Dto`       | `KUBUN3`           | `Kbn080603Dto` | 区分3(取り崩し) |

## `Kbn080601Dto` (`KUBUN1`) の詳細

|  プロパティ名   |    XMLタグ名    |        データ型         |   説明   |
| --------------- | --------------- | ----------------------- | -------- |
| `subTotal`      | `SYOUKEI_GK`    | `Long`                  | 金額小計 |
| `subTotalBikou` | `SYOUKEI_BIKOU` | `String`                | 小計備考 |
| `list`          | `ROW`           | `List<RowShito0806Dto>` | 行リスト |

## `Kbn080602Dto` (`KUBUN2`) の詳細

|  プロパティ名   |    XMLタグ名    |        データ型         |   説明   |
| --------------- | --------------- | ----------------------- | -------- |
| `subTotal`      | `SYOUKEI_GK`    | `Long`                  | 金額小計 |
| `subTotalBikou` | `SYOUKEI_BIKOU` | `String`                | 小計備考 |
| `list`          | `ROW`           | `List<RowShito0806Dto>` | 行リスト |

## `Kbn080603Dto` (`KUBUN3`) の詳細

|  プロパティ名   |    XMLタグ名    |        データ型         |   説明   |
| --------------- | --------------- | ----------------------- | -------- |
| `subTotal`      | `SYOUKEI_GK`    | `Long`                  | 金額小計 |
| `subTotalBikou` | `SYOUKEI_BIKOU` | `String`                | 小計備考 |
| `list`          | `ROW`           | `List<RowShito0806Dto>` | 行リスト |

## `RowShito0806Dto` (`ROW`) の詳細

`Kbn080601Dto`, `Kbn080602Dto`, `Kbn080603Dto` の `list` 内に含まれる `ROW` タグの各項目は、以下の構造を持つ `RowShito0806Dto` で表現されます。

| プロパティ名  |  XMLタグ名   | データ型  |  説明  |
| ------------- | ------------ | --------- | ------ |
| `rowNo`       | `ICHIREN_NO` | `Integer` | 行番号 |
| `accrualDate` | `DT`         | `String`  | 発生日 |
| `amount`      | `KINGAKU`    | `Long`    | 金額   |
| `bikou`       | `BIKOU`      | `String`  | 備考   |
