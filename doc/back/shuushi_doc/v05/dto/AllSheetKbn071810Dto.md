# AllSheetKbn071810Dto

## 概要

政治資金収支報告書V5の様式7の18の10（資産の内訳 - 敷金）の全体データDtoです。

## XML要素

このDtoは、`AllSheet0718AssetsDto` の子要素として `KUBUN10` タグで表現され、様式7の18の10の情報を代表（統合）する要素です。内部のシートデータは `SHEET` タグで表現されます。

## プロパティ

|            プロパティ名            | XMLタグ名 |              データ型              |         説明          |    値の制限    |
| :--------------------------------- | :-------- | :--------------------------------- | :-------------------- | :------------- |
| `sheet071810DepositAmongAssetsDto` | `SHEET`   | `Sheet071810DepositAmongAssetsDto` | 様式7の18の10のシート | 未調査／未実装 |

## 子要素の詳細

### `Sheet071810DepositAmongAssetsDto` の詳細

`sheet071810DepositAmongAssetsDto` は `Template0718SheetDto` を継承し、以下のフィールドを含みます。

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
