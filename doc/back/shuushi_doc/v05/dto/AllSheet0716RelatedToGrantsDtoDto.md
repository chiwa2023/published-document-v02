# AllSheet0716RelatedToGrantsDtoDto

## 概要

政治資金収支報告書V5の様式7の16（交付金に係る支出）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_16` です。

## サンプルXML

```xml
<SYUUSHI07_16>
  <SHEET>
    <KINGAKU_GK>30000</KINGAKU_GK>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <SHISYUTU_KMK>支出の目的</SHISYUTU_KMK>
      <KINGAKU>30000</KINGAKU>
      <DT>R4/12/1</DT>
      <HONSIBU_NM>本部支部名称</HONSIBU_NM>
      <JIMU_ADR>東京都千代田区</JIMU_ADR>
      <BIKOU>備考</BIKOU>
    </ROW>
  </SHEET>
</SYUUSHI07_16>
```

## プロパティ

|                プロパティ名                 | XMLタグ名 |            データ型             |      説明       |    値の制限    |
| ------------------------------------------- | --------- | ------------------------------- | --------------- | -------------- |
| `sheet071600ExpendituresRelatedToGrantsDto` | `SHEET`   | `Sheet071600RelatedToGrantsDto` | 様式7の16データ | 未調査／未実装 |

## 子要素の詳細

- [`Sheet071600RelatedToGrantsDto`](./Sheet071600RelatedToGrantsDto.md): 交付金に係る支出に関する詳細情報を含みます。
