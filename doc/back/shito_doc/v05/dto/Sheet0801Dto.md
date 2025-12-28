# Sheet0801Dto

## 概要

政党交付金使途報告書V5の様式8の1（表紙）のデータDto。

## プロパティ

|     プロパティ名     |   XMLタグ名    | データ型  |       説明       |
| -------------------- | -------------- | --------- | ---------------- |
| `nendo`              | `NENDO`        | `Integer` | 報告年度         |
| `partyName`          | `SEITOU_SK_NM` | `String`  | 政党名称         |
| `partyNameKana`      | `SEITOU_KANA`  | `String`  | 政党名称かな     |
| `officeAddress`      | `JIMU_ADR`     | `String`  | 主たる事務所住所 |
| `delegateName`       | `DAI_NM`       | `String`  | 代表者姓名       |
| `accountManagerName` | `KAI_NM`       | `String`  | 会計責任者姓名   |
| `worker1Name`        | `TANTOU1_NM`   | `String`  | 担当者1姓名      |
| `worker1Tel`         | `TANTOU1_TEL`  | `String`  | 担当者1電話番号  |
| `worker2Name`        | `TANTOU2_NM`   | `String`  | 担当者2姓名      |
| `worker2Tel`         | `TANTOU2_TEL`  | `String`  | 担当者2電話番号  |
| `shibuKbn`           | `SIBU_KBN`     | `Integer` | 支部区分         |
| `kaisanKbn`          | `KAISAN_KBN`   | `Integer` | 解散区分         |
| `kaisanDate`         | `KAISAN_DT`    | `String`  | 解散報告日       |
| `seiriNo`            | `SEIRI_NO`     | `String`  | 整理番号         |
| `uketsukeNo`         | `UKETUKE_NO`   | `String`  | 受付番号         |
