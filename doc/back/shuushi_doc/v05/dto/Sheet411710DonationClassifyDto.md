# Sheet411710DonationClassifyDto

## 概要

政治資金収支報告書V5の様式411710（寄付控除を受ける団体の区分と補足情報）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

|                  プロパティ名                  |  XMLタグ名  |              データ型               |              説明               |    値の制限    |
| :--------------------------------------------- | :---------- | :---------------------------------- | :------------------------------ | :------------- |
| `kubun`                                        | `KUBUN`     | `Integer`                           | 団体区分                        | 未調査／未実装 |
| `rowSozei411713SupportingMembersParliamentDto` | `ZEI411713` | `RowSozei411713sParliamentDto`      | 区分3における国会議員情報       | 未調査／未実装 |
| `rowSozei411714SupportingLocalLegislatorsDto`  | `ZEI411714` | `RowSozei411714LocalLegislatorsDto` | 区分4における地方議員・首長情報 | 未調査／未実装 |

## 子要素の詳細

### `RowSozei411713sParliamentDto` の詳細

`rowSozei411713SupportingMembersParliamentDto` 内に含まれる `RowSozei411713sParliamentDto` の各項目は以下の構造を持ちます。

| プロパティ名 | XMLタグ名 | データ型 |    説明    |    値の制限    |
| :----------- | :-------- | :------- | :--------- | :------------- |
| `giinName`   | `GIIN_NM` | `String` | 国会議員名 | 未調査／未実装 |

### `RowSozei411714LocalLegislatorsDto` の詳細

`rowSozei411714SupportingLocalLegislatorsDto` 内に含まれる `RowSozei411714LocalLegislatorsDto` の各項目は以下の構造を持ちます。

| プロパティ名  | XMLタグ名 | データ型 |        説明        |    値の制限    |
| :------------ | :-------- | :------- | :----------------- | :------------- |
| `name`        | `NM`      | `String` | 議員・首長の名前   | 未調査／未実装 |
| `senkyo`      | `SENKYO`  | `String` | 立候補した選挙名称 | 未調査／未実装 |
| `accrualDate` | `DT`      | `String` | 立候補した日付     | 未調査／未実装 |
