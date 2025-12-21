# AllSheetKbn070703Dto

## 概要

政治資金収支報告書V5の様式7の7の3（政治団体からの寄付収入）の全体データDtoです。

## XML要素

このDtoは、`AllSheet0707DonateDto` の子要素として `KUBUN3` タグで表現され、様式7の7の3の情報を代表（統合）する要素です。内部のシートデータは `SHEET` タグで表現されます。

## プロパティ

|           プロパティ名           | XMLタグ名 |             データ型             |       説明        |
| -------------------------------- | --------- | -------------------------------- | ----------------- |
| `sheet070703DonatePoliticOrgDto` | `SHEET`   | `Sheet070703DonatePoliticOrgDto` | 様式7の7の3データ |

## `Sheet070703DonatePoliticOrgDto` およびその子要素

`Sheet070703DonatePoliticOrgDto` は `Template0707SheetDto` を継承し、以下のフィールドを含みます。

| プロパティ名  |  XMLタグ名  |          データ型          |     説明     |
| ------------- | ----------- | -------------------------- | ------------ |
| `sonotaTotal` | `SONOTA_GK` | `String`                   | その他の合計 |
| `list`        | `ROW`       | `List<Row070711DonateDto>` | 項目リスト   |

### `Row070711DonateDto` の詳細

`list` 内に含まれる `Row070711DonateDto` の各項目は以下の構造を持ちます。

|   プロパティ名    |    XMLタグ名    | データ型  |      説明      |    値の制限    |
| ----------------- | --------------- | --------- | -------------- | -------------- |
| `ichirenNo`       | `ICHIREN_NO`    | `Integer` | 連番           | 未調査／未実装 |
| `kifusha`         | `KIFUSYA_NM`    | `String`  | 寄付者の名前   | 未調査／未実装 |
| `kingaku`         | `KINGAKU`       | `Long`    | 金額           | 未調査／未実装 |
| `accrualDate`     | `DT`            | `String`  | 発生日         | 未調査／未実装 |
| `jusho`           | `ADR`           | `String`  | 住所           | 未調査／未実装 |
| `shokugyou`       | `SYOKUGYO`      | `String`  | 職業           | 未調査／未実装 |
| `bikou`           | `BIKOU`         | `String`  | 備考           | 未調査／未実装 |
| `tohshibangou`    | `SEQ_NO`        | `Integer` | 通し番号       | 未調査／未実装 |
| `flgZeigakuKohjo` | `ZEIGAKUKOUJYO` | `Short`   | 税額控除フラグ | 未調査／未実装 |
| `gyoukubun`       | `ROWKBN`        | `Short`   | 行区分         | 未調査／未実装 |
