# Sheet072000OathDto

## 概要

政治資金収支報告書V5の様式7の20（宣誓書）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

|        プロパティ名         |      XMLタグ名      | データ型  |        説明        |    値の制限    |
| :-------------------------- | :------------------ | :-------- | :----------------- | :------------- |
| `flgReciptCopy`             | `RYOUSYU_UMU`       | `Integer` | 領収書の写しの有無 | 未調査／未実装 |
| `flgKansaIkensho`           | `KANSA_IKEN_UMU`    | `Integer` | 監査意見書の有無   | 未調査／未実装 |
| `flgSeijishikinHohkokusho`  | `KANSA_HOUKOKU_UMU` | `Integer` | 政治資金監査報告書 | 未調査／未実装 |
| `dateOath`                  | `SENSEI_DT`         | `String`  | 宣誓日             | 未調査／未実装 |
| `dantaiName20`              | `DANTAI_NM`         | `String`  | 政治団体名称       | 未調査／未実装 |
| `kaikeiSekininshaNameLast`  | `KAI_NM1`           | `String`  | 会計責任者姓名の姓 | 未調査／未実装 |
| `kaikeiSekininshaNameFirst` | `KAI_NM2`           | `String`  | 会計責任者姓名の名 | 未調査／未実装 |
| `daihyoushaKaisanNameLast`  | `DAI_NM1`           | `String`  | 代表者姓名の姓     | 未調査／未実装 |
| `daihyoushaKaisanNameFirst` | `DAI_NM2`           | `String`  | 代表者姓名の名     | 未調査／未実装 |
