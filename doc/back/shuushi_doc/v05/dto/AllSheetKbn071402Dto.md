# AllSheetKbn071402Dto

## 概要

政治資金収支報告書V5の様式7の14の2（経常経費・政治活動費）の全体データDtoです。

## XML要素

このDtoは、`AllSheet0714ConstsDto` の子要素として `KUBUN2` タグで表現され、様式7の14の2の情報を代表（統合）する要素です。内部のシートデータは `SHEET` タグで表現されます。

## プロパティ

|          プロパティ名          | XMLタグ名 |            データ型            |        説明         |    値の制限    |
| :----------------------------- | :-------- | :----------------------------- | :------------------ | :------------- |
| `sheet071402EquipmentCostsDto` | `SHEET`   | `Sheet071402EquipmentCostsDto` | 14の2のシートデータ | 未調査／未実装 |

## 子要素の詳細

### `Sheet071402EquipmentCostsDto` の詳細

`sheet071402EquipmentCostsDto` は `Template0714SheetDto` を継承し、以下のフィールドを含みます。

| プロパティ名  |  XMLタグ名  |               データ型               |     説明     |    値の制限    |
| :------------ | :---------- | :----------------------------------- | :----------- | :------------- |
| `sonotaTotal` | `SONOTA_GK` | `String`                             | その他の合計 | 未調査／未実装 |
| `list`        | `ROW`       | `List<Row071415OrdinaryExpensesDto>` | 項目リスト   | 未調査／未実装 |

### `Row071415OrdinaryExpensesDto` の詳細

`list` 内に含まれる `Row071415OrdinaryExpensesDto` の各項目は以下の構造を持ちます。

|   プロパティ名   |  XMLタグ名   | データ型  |             説明             |    値の制限    |
| :--------------- | :----------- | :-------- | :--------------------------- | :------------- |
| `ichirenNo`      | `ICHIREN_NO` | `Integer` | 連番                         | 未調査／未実装 |
| `mokuteki`       | `MOKUTEKI`   | `String`  | 支出の目的                   | 未調査／未実装 |
| `kingaku`        | `KINGAKU`    | `Long`    | 金額                         | 未調査／未実装 |
| `accrualDate`    | `DT`         | `String`  | 発生日                       | 未調査／未実装 |
| `name`           | `NM`         | `String`  | 支出の相手先名称             | 未調査／未実装 |
| `jusho`          | `ADR`        | `String`  | 支出の相手先住所             | 未調査／未実装 |
| `bikou`          | `BIKOU`      | `String`  | 備考                         | 未調査／未実装 |
| `flgRyoushuusho` | `RYOUSYU`    | `Integer` | 領収書を徴しがたかったフラグ | 未調査／未実装 |
| `flgKouufukin`   | `KOUFUKIN`   | `Integer` | 交付金に係る支出フラグ       | 未調査／未実装 |
