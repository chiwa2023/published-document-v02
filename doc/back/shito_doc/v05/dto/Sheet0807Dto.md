# Sheet0807Dto

## 概要

政党交付金使途報告書V5の様式8の7（添付書類報告兼宣誓書）のデータDto。

## プロパティ

|    プロパティ名     | XMLタグ名  | データ型  |                            説明                            |
| ------------------- | ---------- | --------- | ---------------------------------------------------------- |
| `copyRecipt`        | `TENPU1`   | `Integer` | 添付書類：領収書の写し                                     |
| `auditOption`       | `TENPU2`   | `Integer` | 添付書類：監査意見書                                       |
| `auditReport`       | `TENPU3`   | `Integer` | 添付書類：本部のみ監査報告書                               |
| `shibuDocument`     | `TENPU4`   | `Integer` | 添付書類：本部が支部から受け取りした支部報告書、監査意見書 |
| `governingDocument` | `TENPU5`   | `Integer` | 添付書類：統括文書または支部総括文書                       |
| `flgConfirm`        | `KAKUNIN1` | `Integer` | 相違がないか確認                                           |
| `accrualDate`       | `DT`       | `String`  | 宣誓日                                                     |
