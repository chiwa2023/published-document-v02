# Sheet0803Dto

## 概要

政党交付金使途報告書V5の様式8の3（支部交付金以外の経費の明細）のデータDto。

## プロパティ

|          プロパティ名           |      XMLタグ名       | データ型 |               説明               |
| ------------------------------- | -------------------- | -------- | -------------------------------- |
| `totalShibuKoufuAll`            | `KOUFU0_GK`          | `Long`   | 支部交付金全合計                 |
| `totalShibuKoufuJutoKoufukin`   | `KOUFU1_GK`          | `Long`   | 支部交付金合計充当交付金から     |
| `totalShibuKoufuJutoMyFunds`    | `KOUFU2_GK`          | `Long`   | 支部交付金合計充当政党基金から   |
| `totalShibuKoufuBikou`          | `KOUFU_BIKOU`        | `String` | 支部交付金合計備考               |
| `totalJinkenhiAll`              | `JINKENHI0_GK`       | `Long`   | 人件費全合計                     |
| `totalJinkenhiJutoKoufukin`     | `JINKENHI1_GK`       | `Long`   | 人件費合計充当交付金から         |
| `totalJinkenhiJutoMyFunds`      | `JINKENHI2_GK`       | `Long`   | 人件費合計充当政党基金から       |
| `totalJinkenhiBikou`            | `JINKENHI_BIKOU`     | `String` | 人件費備考                       |
| `totalKounetsuhiAll`            | `KOUNETU0_GK`        | `Long`   | 光熱費全合計                     |
| `totalKounetsuhiJutoKoufukin`   | `KOUNETU1_GK`        | `Long`   | 光熱費合計充当交付金から         |
| `totalKounetsuhiJutoMyFunds`    | `KOUNETU2_GK`        | `Long`   | 光熱費合計充当政党基金から       |
| `totalKounetsuhiBikou`          | `KOUNETU_BIKOU`      | `String` | 光熱費備考                       |
| `totalBihinAll`                 | `BIHIN0_GK`          | `Long`   | 備品全合計                       |
| `totalBihinJutoKoufukin`        | `BIHIN1_GK`          | `Long`   | 備品合計充当交付金から           |
| `totalBihinJutoMyFunds`         | `BIHIN2_GK`          | `Long`   | 備品合計充当政党基金から         |
| `totalBihinBikou`               | `BIHIN_BIKOU`        | `String` | 備品備考                         |
| `totalJimushoAll`               | `JIMUSYO0_GK`        | `Long`   | 事務所全合計                     |
| `totalJimushoJutoKoufukin`      | `JIMUSYO1_GK`        | `Long`   | 事務所合計充当交付金から         |
| `totalJimushoJutoMyFunds`       | `JIMUSYO2_GK`        | `Long`   | 事務所合計充当政党基金から       |
| `totalJimushoBikou`             | `JIMUSYO_BIKOU`      | `String` | 事務所備考                       |
| `totalKeihiAll`                 | `KEIHI_SKEI0_GK`     | `Long`   | 経費全合計                       |
| `totalKeihiJutoKoufukin`        | `KEIHI_SKEI1_GK`     | `Long`   | 経費合計充当交付金から           |
| `totalKeihiJutoMyFunds`         | `KEIHI_SKEI2_GK`     | `Long`   | 経費合計充当政党基金から         |
| `totalKeihiBikou`               | `KEIHI_SKEI_BIKOU`   | `String` | 経費備考                         |
| `totalSoshikiAll`               | `SOSIKI0_GK`         | `Long`   | 組織全合計                       |
| `totalSoshikiJutoKoufukin`      | `SOSIKI1_GK`         | `Long`   | 組織合計充当交付金から           |
| `totalSoshikiJutoMyFunds`       | `SOSIKI2_GK`         | `Long`   | 組織合計充当政党基金から         |
| `totalSoshikiBikou`             | `SOSIKI_BIKOU`       | `String` | 組織備考                         |
| `totalSenkyoAll`                | `SENKYO0_GK`         | `Long`   | 選挙全合計                       |
| `totalSenkyoJutoKoufukin`       | `SENKYO1_GK`         | `Long`   | 選挙合計充当交付金から           |
| `totalSenkyoJutoMyFunds`        | `SENKYO2_GK`         | `Long`   | 選挙合計充当政党基金から         |
| `totalSenkyoBikou`              | `SENKYO_BIKOU`       | `String` | 選挙備考                         |
| `totalAllJigyouAll`             | `SONOTA_JIGYO0_GK`   | `Long`   | 事業全般全合計                   |
| `totalAllJigyouJutoKoufukin`    | `SONOTA_JIGYO1_GK`   | `Long`   | 事業全般合計充当交付金から       |
| `totalAllJigyouJutoMyFunds`     | `SONOTA_JIGYO2_GK`   | `Long`   | 事業全般合計充当政党基金から     |
| `totalAllJigyouBikou`           | `SONOTA_JIGYO_BIKOU` | `String` | 事業全般備考                     |
| `totalKikanshiAll`              | `HAKKOU_JIGYO0_GK`   | `Long`   | 機関誌発行全合計                 |
| `totalKikanshiJutoKoufukin`     | `HAKKOU_JIGYO1_GK`   | `Long`   | 機関誌発行合計充当交付金から     |
| `totalKikanshiJutoMyFunds`      | `HAKKOU_JIGYO2_GK`   | `Long`   | 機関誌発行合計充当政党基金から   |
| `totalKikanshiBikou`            | `HAKKOU_JIGYO_BIKOU` | `String` | 機関誌発行備考                   |
| `totalSendenAll`                | `SENDEN0_GK`         | `Long`   | 宣伝全合計                       |
| `totalSendenJutoKoufukin`       | `SENDEN1_GK`         | `Long`   | 宣伝合計充当交付金から           |
| `totalSendenJutoMyFunds`        | `SENDEN2_GK`         | `Long`   | 宣伝金合計充当政党基金から       |
| `totalSendenBikou`              | `SENDEN_BIKOU`       | `String` | 宣伝備考                         |
| `totalPartyAll`                 | `KAISAI0_GK`         | `Long`   | パーティ全合計                   |
| `totalPartyJutoKoufukin`        | `KAISAI1_GK`         | `Long`   | パーティ合計充当交付金から       |
| `totalPartyJutoMyFunds`         | `KAISAI2_GK`         | `Long`   | パーティ合計充当政党基金から     |
| `totalPartyBikou`               | `KAISAI_BIKOU`       | `String` | パーティ備考                     |
| `totalSonotaJigyouAll`          | `SONOTA0_GK`         | `Long`   | その他事業全合計                 |
| `totalSonotaJigyouJutoKoufukin` | `SONOTA1_GK`         | `Long`   | その他事業合計充当交付金から     |
| `totalSonotaJigyouJutoMyFunds`  | `SONOTA2_GK`         | `Long`   | その他事業合計充当政党基金から   |
| `totalSonotaJigyouBikou`        | `SONOTA_BIKOU`       | `String` | その他事業備考                   |
| `totalChousaAll`                | `CYOUSA0_GK`         | `Long`   | 調査全合計                       |
| `totalChousaJutoKoufukin`       | `CYOUSA1_GK`         | `Long`   | 調査合計充当交付金から           |
| `totalChousaJutoMyFunds`        | `CYOUSA2_GK`         | `Long`   | 調査合計充当政党基金から         |
| `totalChousaBikou`              | `CYOUSA_BIKOU`       | `String` | 調査備考                         |
| `totalKifuAll`                  | `KIFU0_GK`           | `Long`   | 寄附全合計                       |
| `totalKifuJutoKoufukin`         | `KIFU1_GK`           | `Long`   | 寄附合計充当交付金から           |
| `totalKifuJutoMyFunds`          | `KIFU2_GK`           | `Long`   | 寄附合計充当政党基金から         |
| `totalKifuBikou`                | `KIFU_BIKOU`         | `String` | 寄附備考                         |
| `totalSonotaKeihiAll`           | `SONOTA_KEIHI0_GK`   | `Long`   | その他経費全合計                 |
| `totalSonotaKeihiJutoKoufukin`  | `SONOTA_KEIHI1_GK`   | `Long`   | その他経費合計充当交付金から     |
| `totalSonotaKeihiJutoMyFunds`   | `SONOTA_KEIHI2_GK`   | `Long`   | その他経費合計充当政党基金から   |
| `totalSonotaKeihiBikou`         | `SONOTA_KEIHI_BIKOU` | `String` | その他経費備考                   |
| `totalAllActionAll`             | `KATUDOU_SKEI0_GK`   | `Long`   | 活動カテゴリ全合計               |
| `totalAllActionJutoKoufukin`    | `KATUDOU_SKEI1_GK`   | `Long`   | 活動カテゴリ合計充当交付金から   |
| `totalAllActionJutoMyFunds`     | `KATUDOU_SKEI2_GK`   | `Long`   | 活動カテゴリ合計充当政党基金から |
| `totalAllActionBikou`           | `KATUDOU_SKEI_BIKOU` | `String` | 活動カテゴリ備考                 |
| `totalAllAmountAll`             | `GKEI0_GK`           | `Long`   | 全合計全合計                     |
| `totalAllAmountJutoKoufukin`    | `GKEI1_GK`           | `Long`   | 全合計充当交付金から             |
| `totalAllAmountJutoMyFunds`     | `GKEI2_GK`           | `Long`   | 全合計合計充当政党基金から       |
| `totalAllAmountBikou`           | `GKEI_BIKOU`         | `String` | 全合計備考                       |
