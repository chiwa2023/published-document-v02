# Sheet071600RelatedToGrantsDto

## 概要

政治資金収支報告書V5の様式7の16（交付金に係る支出）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

| プロパティ名 |  XMLタグ名   |                データ型                |    説明    |    値の制限    |
| :----------- | :----------- | :------------------------------------- | :--------- | :------------- |
| `kingakuGk`  | `KINGAKU_GK` | `Long`                                 | 金額合計   | 未調査／未実装 |
| `list`       | `ROW`        | `List<Row071600ExpendituresGrantsDto>` | 項目リスト | 未調査／未実装 |

## 子要素の詳細

### `Row071600ExpendituresGrantsDto` の詳細

`list` 内に含まれる `Row071600ExpendituresGrantsDto` の各項目は以下の構造を持ちます。

|    プロパティ名    |   XMLタグ名    | データ型  |                説明                |    値の制限    |
| :----------------- | :------------- | :-------- | :--------------------------------- | :------------- |
| `ichirenNo`        | `ICHIREN_NO`   | `Integer` | 連番                               | 未調査／未実装 |
| `shishutsuKoumoku` | `SHISYUTU_KMK` | `String`  | 支出項目                           | 未調査／未実装 |
| `kingaku`          | `KINGAKU`      | `Long`    | 金額                               | 未調査／未実装 |
| `accrualDate`      | `DT`           | `String`  | 発生日                             | 未調査／未実装 |
| `honShibuName`     | `HONSIBU_NM`   | `String`  | 本部支部への交付金支出の相手先名称 | 未調査／未実装 |
| `jusho`            | `JIMU_ADR`     | `String`  | 支出の相手先住所                   | 未調査／未実装 |
| `biko`             | `BIKOU`        | `String`  | 備考                               | 未調査／未実装 |
