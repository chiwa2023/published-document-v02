# Sheet071300xpenditureItemsDto

## 概要

政治資金収支報告書V5の様式7の13（支出項目別金額の内訳）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

|       プロパティ名        |      XMLタグ名       | データ型 |                      説明                      |    値の制限    |
| :------------------------ | :------------------- | :------- | :--------------------------------------------- | :------------- |
| `goukeiJinkenhi`          | `JINKENHI_GK`        | `String` | 人件費項目の合計                               | 未調査／未実装 |
| `kohfuJinkenhi`           | `JINKENHI_KOUFU`     | `String` | 人件費の供与した交付金に係る支出               | 未調査／未実装 |
| `bikouJinkenhi`           | `JINKENHI_BIKOU`     | `String` | 人件費の備考                                   | 未調査／未実装 |
| `goukeiKohnetsuhi`        | `KOUNETU_GK`         | `String` | 光熱費項目の合計                               | 未調査／未実装 |
| `kohfuKohnetsuhi`         | `KOUNETU_KOUFU`      | `String` | 光熱費の供与した交付金に係る支出               | 未調査／未実装 |
| `bikouKohnetsuhi`         | `KOUNETU_BIKOU`      | `String` | 光熱費の備考                                   | 未調査／未実装 |
| `goukeiBihinhi`           | `BIHIN_GK`           | `String` | 備品項目の合計                                 | 未調査／未実装 |
| `kohfuBihinhi`            | `BIHIN_KOUFU`        | `String` | 備品の供与した交付金に係る支出                 | 未調査／未実装 |
| `bikouBihinhi`            | `BIHIN_BIKOU`        | `String` | 備品の備考                                     | 未調査／未実装 |
| `goukeiJimushohi`         | `JIMUSYO_GK`         | `String` | 事務所項目の合計                               | 未調査／未実装 |
| `kohfuJimushohi`          | `JIMUSYO_KOUFU`      | `String` | 事務所の供与した交付金に係る支出               | 未調査／未実装 |
| `bikouJimushohi`          | `JIMUSYO_BIKOU`      | `String` | 事務所の備考                                   | 未調査／未実装 |
| `goukeiKeihiShoukei`      | `KEIHI_SKEI_GK`      | `Long`   | 経費項目の合計                                 | 未調査／未実装 |
| `kohfuKeihiShoukei`       | `KEIHI_SKEI_KOUFU`   | `Long`   | 経費の供与した交付金に係る支出                 | 未調査／未実装 |
| `bikouKeihiShoukei`       | `KEIHI_SKEI_BIKOU`   | `String` | 経費の備考                                     | 未調査／未実装 |
| `goukeiSoshikiKatsudouhi` | `SOSIKI_GK`          | `Long`   | 組織活動費項目の合計                           | 未調査／未実装 |
| `kohfuSoshikiKatsudouhi`  | `SOSIKI_KOUFU`       | `String` | 組織活動費の供与した交付金に係る支出           | 未調査／未実装 |
| `bikouSoshikiKatsudouhi`  | `SOSIKI_BIKOU`       | `String` | 組織活動費の備考                               | 未調査／未実装 |
| `goukeiSenkyoKatsudou`    | `SENKYO_GK`          | `Long`   | 選挙活動費項目の合計                           | 未調査／未実装 |
| `kohfuSenkyoKatsudou`     | `SENKYO_KOUFU`       | `String` | 選挙活動費の供与した交付金に係る支出           | 未調査／未実装 |
| `bikouSenkyoKatsudou`     | `SENKYO_BIKOU`       | `String` | 選挙活動費の備考                               | 未調査／未実装 |
| `goukeiSonota`            | `SONOTA_JIGYO_GK`    | `Long`   | その他項目の合計                               | 未調査／未実装 |
| `kohfuSonota`             | `SONOTA_JIGYO_KOUFU` | `Long`   | その他の供与した交付金に係る支出               | 未調査／未実装 |
| `bikouSonota`             | `SONOTA_JIGYO_BIKOU` | `String` | その他の備考                                   | 未調査／未実装 |
| `goukeiHakkou`            | `HAKKOU_JIGYO_GK`    | `Long`   | 機関誌発行項目の合計                           | 未調査／未実装 |
| `kohfuHakkou`             | `HAKKOU_JIGYO_KOUFU` | `String` | 機関誌発行の供与した交付金に係る支出           | 未調査／未実装 |
| `bikouHakkou`             | `HAKKOU_JIGYO_BIKOU` | `String` | 機関誌発行の備考                               | 未調査／未実装 |
| `goukeiSenden`            | `SENDEN_GK`          | `Long`   | 宣伝費項目の合計                               | 未調査／未実装 |
| `kohfuSenden`             | `SENDEN_KOUFU`       | `String` | 宣伝費の供与した交付金に係る支出               | 未調査／未実装 |
| `bikouSenden`             | `SENDEN_BIKOU`       | `String` | 宣伝費見書の備考                               | 未調査／未実装 |
| `goukeiKaisaiPty`         | `KAISAI_GK`          | `Long`   | 政治資金パーティ開催項目の合計                 | 未調査／未実装 |
| `kohfuKaisaiPty`          | `KAISAI_KOUFU`       | `String` | 政治資金パーティ開催の供与した交付金に係る支出 | 未調査／未実装 |
| `bikouKaisaiPty`          | `KAISAI_BIKOU`       | `String` | 政治資金パーティ開催の備考                     | 未調査／未実装 |
| `goukeiSonotaJigyou`      | `SONOTA_GK`          | `Long`   | その他事業費項目の合計                         | 未調査／未実装 |
| `kohfuSonotaJigyou`       | `SONOTA_KOUFU`       | `String` | その他事業費の供与した交付金に係る支出         | 未調査／未実装 |
| `bikouSonotaJigyou`       | `SONOTA_BIKOU`       | `String` | その他事業費の備考                             | 未調査／未実装 |
| `goukeiChousaKenkyu`      | `CYOUSA_GK`          | `Long`   | 調査研究費項目の合計                           | 未調査／未実装 |
| `kohfuChousaKenkyu`       | `CYOUSA_KOUFU`       | `String` | 調査研究費の供与した交付金に係る支出           | 未調査／未実装 |
| `bikouChousaKenkyu`       | `CYOUSA_BIKOU`       | `String` | 調査研究費の備考                               | 未調査／未実装 |
| `goukeiKifukin`           | `KIFU_GK`            | `Long`   | 寄付金項目の合計                               | 未調査／未実装 |
| `kohfuKifukin`            | `KIFU_KOUFU`         | `String` | 寄付金の供与した交付金に係る支出               | 未調査／未実装 |
| `bikouKifukin`            | `KIFU_BIKOU`         | `String` | 寄付金の備考                                   | 未調査／未実装 |
| `goukeiSonotaKeihi`       | `SONOTA_KEIHI_GK`    | `Long`   | その他の経費項目の合計                         | 未調査／未実装 |
| `kohfuSonotaKeihi`        | `SONOTA_KEIHI_KOUFU` | `String` | その他の経費の供与した交付金に係る支出         | 未調査／未実装 |
| `bikouSonotaKeihi`        | `SONOTA_KEIHI_BIKOU` | `String` | その他の経費の備考                             | 未調査／未実装 |
| `goukeiKatsudouhi`        | `KATUDOU_SKEI_GK`    | `Long`   | 活動費小計の合計                               | 未調査／未実装 |
| `kohfuKatsudouhi`         | `KATUDOU_SKEI_KOUFU` | `Long`   | 活動費小計の供与した交付金に係る支出           | 未調査／未実装 |
| `bikouKatsudouhi`         | `KATUDOU_SKEI_BIKOU` | `String` | 活動費小計の備考                               | 未調査／未実装 |
| `goukeiZenGohkei`         | `GKEI_GK`            | `Long`   | 現計合計                                       | 未調査／未実装 |
