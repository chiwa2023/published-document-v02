# Sheet071000SpecificPartyDto

## 概要

政治資金収支報告書V5の様式7の10（特定パーティの対価に係る収入）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

| プロパティ名 |  XMLタグ名   |             データ型              |    説明    |    値の制限    |
| :----------- | :----------- | :-------------------------------- | :--------- | :------------- |
| `kingakuGk`  | `KINGAKU_GK` | `Long`                            | 金額合計   | 未調査／未実装 |
| `list`       | `ROW`        | `List<Row071000SpecificPartyDto>` | 項目リスト | 未調査／未実装 |

## 子要素の詳細

### `Row071000SpecificPartyDto` の詳細

`list` 内に含まれる `Row071000SpecificPartyDto` の各項目は以下の構造を持ちます。

| プロパティ名  |   XMLタグ名    | データ型  |     説明     |    値の制限    |
| :------------ | :------------- | :-------- | :----------- | :------------- |
| `ichirenNo`   | `ICHIREN_NO`   | `Integer` | 連番         | 未調査／未実装 |
| `partyName`   | `PATYI_NM`     | `String`  | パーティ名称 | 未調査／未実装 |
| `kingaku`     | `KINGAKU`      | `Long`    | 金額         | 未調査／未実装 |
| `shiharaisu`  | `SHIHARAI_SU`  | `Integer` | 支払い数     | 未調査／未実装 |
| `accrualDate` | `KAISAI_DT`    | `String`  | 開催日       | 未調査／未実装 |
| `kaisaiBasho` | `KAISAI_BASYO` | `String`  | 開催場所     | 未調査／未実装 |
| `bikou`       | `BIKOU`        | `String`  | 備考         | 未調査／未実装 |
