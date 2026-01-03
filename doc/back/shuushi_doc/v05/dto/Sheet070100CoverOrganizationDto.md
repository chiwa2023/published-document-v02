# Sheet070100CoverOrganizationDto

## 概要

政治資金収支報告書V5の様式7の1（収支報告書組織詳細）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

|           プロパティ名            |      XMLタグ名       | データ型  |                 説明                 |    値の制限    |
| :-------------------------------- | :------------------- | :-------- | :----------------------------------- | :------------- |
| `houkokuNen`                      | `HOUKOKU_NEN`        | `Integer` | 報告年                               | 未調査／未実装 |
| `dateKaisai`                      | `KAISAI_DT`          | `String`  | 開催年月日                           | 未調査／未実装 |
| `dantaiName01`                    | `DANTAI_NM`          | `String`  | 政治団体名称                         | 未調査／未実装 |
| `dantaiNameKana`                  | `DANTAI_KANA`        | `String`  | 政治団体名称かな                     | 未調査／未実装 |
| `jimushoJusho`                    | `JIM_ADR`            | `String`  | 事務所の住所                         | 未調査／未実装 |
| `jimushoJushoTatemono`            | `JIM_APA_ADR`        | `String`  | 事務所の住所建物                     | 未調査／未実装 |
| `daihyoushaNameLast`              | `DAI_NM1`            | `String`  | 代表者の姓                           | 未調査／未実装 |
| `daihyoushaNameFirst`             | `DAI_NM2`            | `String`  | 代表者の名                           | 未調査／未実装 |
| `kaikeiSekinnshaNameLast`         | `KAI_NM1`            | `String`  | 会計責任者の姓                       | 未調査／未実装 |
| `kaikeiSekinnshaNameFirst`        | `KAI_NM2`            | `String`  | 会計責任者の名                       | 未調査／未実装 |
| `jimuTantousha1NameLast`          | `TANTOU1_NM1`        | `String`  | 事務担当者1の姓                      | 未調査／未実装 |
| `jimuTantousha1NameFirst`         | `TANTOU1_NM2`        | `String`  | 事務担当者1の名                      | 未調査／未実装 |
| `jimuTantousha1Tel`               | `TANTOU1_TEL`        | `String`  | 事務担当者1の電話番号                | 未調査／未実装 |
| `jimuTantousha2NameLast`          | `TANTOU2_NM1`        | `String`  | 事務担当者2の姓                      | 未調査／未実装 |
| `jimuTantousha2NameFirst`         | `TANTOU2_NM2`        | `String`  | 事務担当者2の名                      | 未調査／未実装 |
| `jimuTantousha2Tel`               | `TANTOU2_TEL`        | `String`  | 事務担当者2の電話番号                | 未調査／未実装 |
| `jimuTantousha3NameLast`          | `TANTOU3_NM1`        | `String`  | 事務担当者3の姓                      | 未調査／未実装 |
| `jimuTantousha3NameFirst`         | `TANTOU3_NM2`        | `String`  | 事務担当者3の名                      | 未調査／未実装 |
| `jimuTantousha3Tel`               | `TANTOU3_TEL`        | `String`  | 事務担当者3の電話番号                | 未調査／未実装 |
| `dantaiKbn`                       | `DANTAI_KBN`         | `String`  | 団体区分                             | 未調査／未実装 |
| `katsudouKuikiKbn`                | `KATU_KUKI`          | `Integer` | 活動区域区分                         | 未調査／未実装 |
| `umuShikinKanrenDantai`           | `SIKIN_UMU`          | `Integer` | 資金管理団体の有無                   | 未調査／未実装 |
| `koushokuName`                    | `KOSYOKU_NM`         | `String`  | 公職の名称                           | 未調査／未実装 |
| `koushokuGenKouho`                | `KOSYOKU_KBN`        | `String`  | 現職候補者の別                       | 未調査／未実装 |
| `shikinDaihyouName1`              | `SIKIN_TODOKE_NM1`   | `String`  | 資金管理団体の設立者の姓             | 未調査／未実装 |
| `shikinDaihyouName2`              | `SIKIN_TODOKE_NM2`   | `String`  | 資金管理団体の設立者の名             | 未調査／未実装 |
| `kanriDantaiPeriodStart`          | `SIKIN_KIKAN1`       | `String`  | 資金管理団体の指定期間(開始)         | 未調査／未実装 |
| `kanriDantaiPeriodEnd`            | `SIKIN_KIKAN2`       | `String`  | 資金管理団体の指定期間(終了)         | 未調査／未実装 |
| `kanriDantaiPeriodRest`           | `SIKIN_KIKAN_FUKUSU` | `String`  | 資金管理団体の複数指定期間           | 未調査／未実装 |
| `kokkaiGiinDantaiKbn`             | `GIIN_DANTAI_KBN`    | `Integer` | 国会議員関連団体区分                 | 未調査／未実装 |
| `kokkaiGiin1NameLast`             | `GIIN1_KOSYOKU_NM_1` | `String`  | 国家議員1の姓                        | 未調査／未実装 |
| `kokkaiGiin1NameFirst`            | `GIIN1_KOSYOKU_NM_2` | `String`  | 国家議員1の名                        | 未調査／未実装 |
| `kokkaiGiin1ShuuSan`              | `GIIN1_KOSYOKU_NM`   | `String`  | 国家議員1の公職(衆参)                | 未調査／未実装 |
| `kokkaiGiin1GenKouho`             | `GIIN1_KOSYOKU_KBN`  | `String`  | 国家議員1現職と候補者の別            | 未調査／未実装 |
| `giinDantantaiTokureiPeriodStart` | `GIIN_KIKAN1`        | `String`  | 国会議員関係団体の特例適用期間(開始) | 未調査／未実装 |
| `giinDantantaiTokureiPeriodEnd`   | `GIIN_KIKAN2`        | `String`  | 国会議員関係団体の特例適用期間(終了) | 未調査／未実装 |
| `giinDantantaiTokureiPeriodRest`  | `GIIN_KIKAN_FUKUSU`  | `String`  | 国会議員関係団体の複数特例適用期間   | 未調査／未実装 |
| `kokkaiGiin2NameLast`             | `GIIN2_KOSYOKU_NM_1` | `String`  | 国家議員2の姓                        | 未調査／未実装 |
| `kokkaiGiin2NameFirst`            | `GIIN2_KOSYOKU_NM_2` | `String`  | 国家議員2の名                        | 未調査／未実装 |
| `kokkaiGiin2ShuuSan`              | `GIIN2_KOSYOKU_NM`   | `String`  | 国家議員2の公職(衆参)                | 未調査／未実装 |
| `kokkaiGiin2GenKouho`             | `GIIN2_KOSYOKU_KBN`  | `String`  | 国家議員2現職と候補者の別            | 未調査／未実装 |
| `kokkaiGiin3NameLast`             | `GIIN3_KOSYOKU_NM_1` | `String`  | 国家議員3の姓                        | 未調査／未実装 |
| `kokkaiGiin3NameFirst`            | `GIIN3_KOSYOKU_NM_2` | `String`  | 国家議員3の名                        | 未調査／未実装 |
| `kokkaiGiin3ShuuSan`              | `GIIN3_KOSYOKU_NM`   | `String`  | 国家議員3の公職(衆参)                | 未調査／未実装 |
| `kokkaiGiin3GenKouho`             | `GIIN3_KOSYOKU_KBN`  | `String`  | 国家議員3現職と候補者の別            | 未調査／未実装 |
