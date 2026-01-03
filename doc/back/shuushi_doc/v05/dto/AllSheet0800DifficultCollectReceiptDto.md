# AllSheet0800DifficultCollectReceiptDto

## 概要

政治資金収支報告書V5の様式8（領収書を徴し難かった支出項目一覧表）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI08` です。

## サンプルXML

```xml
<SYUUSHI08>
  <SHEET>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <KOMOKU>支出項目</KOMOKU>
      <TEKIYOU>摘要</TEKIYOU>
      <KINGAKU>30000</KINGAKU>
      <DT>R4/12/1</DT>
      <JIJYOU>徴し難たかった事情</JIJYOU>
    </ROW>
  </SHEET>
</SYUUSHI08>
```

## プロパティ

|              プロパティ名               | XMLタグ名 |                データ型                 | 説明  |    値の制限    |
| --------------------------------------- | --------- | --------------------------------------- | ----- | -------------- |
| `sheet080000DifficultCollectReceiptDto` | `SHEET`   | `Sheet080000DifficultCollectReceiptDto` | 様式8 | 未調査／未実装 |

## 子要素の詳細

- [`Sheet080000DifficultCollectReceiptDto`](./Sheet080000DifficultCollectReceiptDto.md): 領収書を徴し難かった支出項目一覧表に関する詳細情報を含みます。
