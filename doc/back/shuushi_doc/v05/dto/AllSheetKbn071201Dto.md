# AllSheetKbn071201Dto

## 概要

政治資金収支報告書V5の様式7の12の1（政治資金パーティの対価に係る個人からのあっせんによる収入）の全体データDtoです。

## XML要素

このDtoは、`AllSheet0712PartyMediationDto` の子要素として `KUBUN1` タグで表現され、様式7の12の1の情報を代表（統合）する要素です。内部のシートデータは `SHEET` タグで表現されます。

## プロパティ

| プロパティ名 | XMLタグ名 |                   データ型                   |            説明            |    値の制限    |
| :----------- | :-------- | :------------------------------------------- | :------------------------- | :------------- |
| `list`       | `SHEET`   | `List<Sheet071201MediationPartyPersonalDto>` | 様式7の12の1のシートリスト | 未調査／未実装 |

## 子要素の詳細

### `Sheet071201MediationPartyPersonalDto` の詳細

`sheet071201MediationPartyPersonalDto` は `Template0712SheetDto` を継承し、以下のフィールドを含みます。

| プロパティ名 |  XMLタグ名   |           データ型            |     説明     |    値の制限    |
| :----------- | :----------- | :---------------------------- | :----------- | :------------- |
| `partyName`  | `PATYI_NM`   | `String`                      | パーティ名称 | 未調査／未実装 |
| `sortNo`     | `SORT_NO`    | `String`                      | 通し番号     | 未調査／未実装 |
| `kingakuGk`  | `KINGAKU_GK` | `Long`                        | 金額合計     | 未調査／未実装 |
| `list`       | `ROW`        | `List<Row070812MediationDto>` | 項目リスト   | 未調査／未実装 |

### `Row070812MediationDto` の詳細

`list` 内に含まれる `Row070812MediationDto` の各項目は以下の構造を持ちます。

|  プロパティ名   |  XMLタグ名   | データ型  |      説明      |    値の制限    |
| :-------------- | :----------- | :-------- | :------------- | :------------- |
| `ichirenNo`     | `ICHIREN_NO` | `Integer` | 連番           | 未調査／未実装 |
| `name`          | `NM`         | `String`  | 名前           | 未調査／未実装 |
| `kingaku`       | `KINGAKU`    | `Long`    | 金額           | 未調査／未実装 |
| `accrualDate`   | `DT`         | `String`  | 発生日         | 未調査／未実装 |
| `periodMediate` | `KIKAN`      | `String`  | あっせんの期間 | 未調査／未実装 |
| `juusho`        | `ADR`        | `String`  | 住所           | 未調査／未実装 |
| `shokugyou`     | `SYOKUGYO`   | `String`  | 職業           | 未調査／未実装 |
| `bikou`         | `BIKOU`      | `String`  | 備考           | 未調査／未実装 |
| `tohshibangou`  | `SEQ_NO`     | `Integer` | 通し番号       | 未調査／未実装 |
| `gyoukubun`     | `ROWKBN`     | `Short`   | 行区分         | 未調査／未実装 |
