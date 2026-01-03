# Sheet070200SummaryIncomeDto

## 概要

政治資金収支報告書V5の様式7の2（収入一覧表）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

|      プロパティ名       |      XMLタグ名       | データ型 |                 説明                 |    値の制限    |
| :---------------------- | :------------------- | :------- | :----------------------------------- | :------------- |
| `shunyuGokei`           | `SYUNYU_SGK`         | `Long`   | 収入総額                             | 未調査／未実装 |
| `zennenKurikoshi`       | `ZENNEN_KKS_GK`      | `Long`   | 前年からの繰越額                     | 未調査／未実装 |
| `honnenShunyu`          | `HONNEN_SYUNYU_GK`   | `Long`   | 本年の収入額                         | 未調査／未実装 |
| `shishutsuGoukei`       | `SISYUTU_SGK`        | `Long`   | 支出総額                             | 未調査／未実装 |
| `yokunenKurikoshi`      | `YOKUNEN_KKS_GK`     | `Long`   | 翌年への繰越額                       | 未調査／未実装 |
| `kojiFutanGoukei`       | `KOJIN_FUTAN_KGK`    | `String` | 個人の党費または会費を納入金額       | 未調査／未実装 |
| `kojiFutanSuu`          | `KOJIN_FUTAN_SU`     | `String` | 党費または会費を納入した員数         | 未調査／未実装 |
| `kojinKifuGoukei`       | `KOJIN_KIFU_GK`      | `Long`   | 個人寄付の合計                       | 未調査／未実装 |
| `kojinKifuBikou`        | `KOJIN_KIFU_BIKOU`   | `String` | 個人寄付備考                         | 未調査／未実装 |
| `tokuteiKifuGoukei`     | `TOKUTEI_KIFU_GK`    | `Long`   | 特定寄付合計                         | 未調査／未実装 |
| `tokuteiKifuBikou`      | `TOKUTEI_KIFU_BIKOU` | `String` | うち特定寄付備考                     | 未調査／未実装 |
| `houjinKifuGoukei`      | `HOJIN_KIFU_GK`      | `Long`   | 法人寄付合計                         | 未調査／未実装 |
| `houjinKifuBiko`        | `HOJIN_KIFU_BIKOU`   | `String` | 法人寄付備考                         | 未調査／未実装 |
| `seijiDantaiKifuGoukei` | `SEIJI_KIFU_GK`      | `Long`   | 政治団体寄付合計                     | 未調査／未実装 |
| `seijiDantaiKifuBikou`  | `SEIJI_KIFU_BIKOU`   | `String` | 政治団体寄付備考                     | 未調査／未実装 |
| `kifuShoukeiGoukei`     | `KIFU_SKEI_GK`       | `Long`   | 寄付小計合計                         | 未調査／未実装 |
| `kifuShoukeiBikou`      | `KIFU_SKEI_BIKOU`    | `String` | 寄付小計合計備考                     | 未調査／未実装 |
| `assenGoukei`           | `ATUSEN_GK`          | `Long`   | 寄付のうちあっせんによるもの合計     | 未調査／未実装 |
| `assenBikou`            | `ATUSEN_BIKOU`       | `String` | 寄付のうちあっせんによるもの合計備考 | 未調査／未実装 |
| `tokumeiKifuGoukei`     | `TOKUMEI_KIFU_GK`    | `Long`   | 政党匿名寄付の合計                   | 未調査／未実装 |
| `tokumeiKifuBikou`      | `TOKUMEI_KIFU_BIKOU` | `String` | 政党匿名寄付の合計備考               | 未調査／未実装 |
| `kifuSoGoukei`          | `KIFU_GKEI_GK`       | `Long`   | 寄付総合計                           | 未調査／未実装 |
| `kifuSoGoukeiBikou`     | `KIFU_GKEI_BIKOU`    | `String` | 寄付総合計備考                       | 未調査／未実装 |
