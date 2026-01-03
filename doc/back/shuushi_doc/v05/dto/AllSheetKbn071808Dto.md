# AllSheetKbn071808Dto

## 概要

政治資金収支報告書V5の様式7の18の8（資産の内訳 - 出資金）の全体データDtoです。

## XML要素

このDtoは、`AllSheet0718AssetsDto` の子要素として `KUBUN8` タグで表現され、様式7の18の8の情報を代表（統合）する要素です。内部のシートデータは `SHEET` タグで表現されます。

## プロパティ

|             プロパティ名              | XMLタグ名 |               データ型                |         説明         |    値の制限    |
| :------------------------------------ | :-------- | :------------------------------------ | :------------------- | :------------- |
| `sheet071808InvestmentAmongAssetsDto` | `SHEET`   | `Sheet071808InvestmentAmongAssetsDto` | 様式7の18の8のシート | 未調査／未実装 |

## 子要素の詳細

### `Sheet071808InvestmentAmongAssetsDto` の詳細

`sheet071808InvestmentAmongAssetsDto` は `Template0718SheetDto` を継承し、以下のフィールドを含みます。

| プロパティ名 | XMLタグ名 |                 データ型                 |    説明    |    値の制限    |
| :----------- | :-------- | :--------------------------------------- | :--------- | :------------- |
| `list`       | `ROW`     | `List<Row071800ClassificationAssetsDto>` | 項目リスト | 未調査／未実装 |

### `Row071800ClassificationAssetsDto` の詳細

`list` 内に含まれる `Row071800ClassificationAssetsDto` の各項目は以下の構造を持ちます。

| プロパティ名  |  XMLタグ名   | データ型  |  説明  |    値の制限    |
| :------------ | :----------- | :-------- | :----- | :------------- |
| `ichirenNo`   | `ICHIREN_NO` | `Integer` | 連番   | 未調査／未実装 |
| `tekiyou`     | `TEKIYOU`    | `String`  | 摘要   | 未調査／未実装 |
| `kingaku`     | `KINGAKU`    | `Long`    | 金額   | 未調査／未実装 |
| `accrualDate` | `DT`         | `String`  | 発生日 | 未調査／未実装 |
| `biko`        | `BIKOU`      | `String`  | 備考   | 未調査／未実装 |
