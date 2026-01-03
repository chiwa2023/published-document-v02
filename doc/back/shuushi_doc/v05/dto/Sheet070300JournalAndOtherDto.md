# Sheet070300JournalAndOtherDto

## 概要

政治資金収支報告書V5の様式7の3（機関誌発行等の事業収入）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

| プロパティ名 |  XMLタグ名   |              データ型               |    説明    |    値の制限    |
| :----------- | :----------- | :---------------------------------- | :--------- | :------------- |
| `kingakuGk`  | `KINGAKU_GK` | `Long`                              | 金額合計   | 未調査／未実装 |
| `list`       | `ROW`        | `List<Row070300JournalAndOtherDto>` | 項目リスト | 未調査／未実装 |

## 子要素の詳細

### `Row070300JournalAndOtherDto` の詳細

`list` 内に含まれる `Row070300JournalAndOtherDto` の各項目は以下の構造を持ちます。

|  プロパティ名   |    XMLタグ名    | データ型  |    説明    |    値の制限    |
| :-------------- | :-------------- | :-------- | :--------- | :------------- |
| `ichirenNo`     | `ICHIREN_NO`    | `Integer` | 連番       | 未調査／未実装 |
| `jigyoNoShurui` | `GIGYOU_SYURUI` | `String`  | 事業の種類 | 未調査／未実装 |
| `kingaku`       | `KINGAKU`       | `Long`    | 金額       | 未調査／未実装 |
| `bikou`         | `BIKOU`         | `String`  | 備考       | 未調査／未実装 |
