# Shito0805Dto

## 概要

政党交付金使途報告書V5の様式8の5（支部交付金の内訳）の全体データDto。

## XML要素

ルート要素名は `SITO08_05` です。

## サンプルXML

```xml
<Shito0805Dto>
  <SHEET>
    <KINGAKU_GK>242424</KINGAKU_GK>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <SIBU_NM>支部名称</SIBU_NM>
      <KINGAKU>23456</KINGAKU>
      <DT>R3/11/13</DT>
      <MOKUTEKI>事務所費</MOKUTEKI>
      <BIKOU>備考</BIKOU>
      <ROWKBN>100</ROWKBN>
    </ROW>
  </SHEET>
</Shito0805Dto>
```

## プロパティ

|  プロパティ名  | XMLタグ名 |    データ型    |      説明      |    値の制限    |
| -------------- | --------- | -------------- | -------------- | -------------- |
| `sheet0805Dto` | `SHEET`   | `Sheet0805Dto` | 様式8の5シート | 未調査／未実装 |

## 子要素の詳細

- [Sheet0805Dto](./Sheet0805Dto.md)
