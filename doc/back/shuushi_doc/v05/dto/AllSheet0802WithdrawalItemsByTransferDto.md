# AllSheet0802WithdrawalItemsByTransferDto

## 概要

政治資金収支報告書V5の様式8の2（振込明細書に係る支出項目）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI08_02` です。

## サンプルXML

```xml
<SYUUSHI08_02>
  <SHEET>
    <KOMOKU>支出項目</KOMOKU>
    <TEKIYOU>摘要</TEKIYOU>
    <DANTAI_NM>団体名称</DANTAI_NM>
  </SHEET>
</SYUUSHI08_02>
```

## プロパティ

|  プロパティ名   | XMLタグ名 |               データ型                |              説明              |    値の制限    |
| --------------- | --------- | ------------------------------------- | ------------------------------ | -------------- |
| `listSheet0802` | `SHEET`   | `List<Sheet080200WithdrawalItemsDto>` | 振込明細書に係る支出項目リスト | 未調査／未実装 |

## 子要素の詳細

- [`Sheet080200WithdrawalItemsDto`](./Sheet080200WithdrawalItemsDto.md): 支出項目別金額の内訳に関する詳細情報を含みます。
