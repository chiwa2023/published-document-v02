# Shito0901Dto

## 概要

政党交付金使途報告書V5の様式9の1（領収書等を徴し難かった支出の内訳）の全体データDto。

## XML要素

ルート要素名は `SITO09_01` です。

## サンプルXML

```xml
<Shito0901Dto>
  <SHEET>
    <ROW>
      <ICHIREN_NO>7</ICHIREN_NO>
      <KOMOKU>備品・消耗品費</KOMOKU>
      <TEKIYOU>aaaaa</TEKIYOU>
      <KINGAKU>20000</KINGAKU>
      <DT>R4/12/1</DT>
      <JIJYOU>相手が××だった</JIJYOU>
    </ROW>
  </SHEET>
</Shito0901Dto>
```

## プロパティ

|  プロパティ名  | XMLタグ名 |    データ型    |      説明      |    値の制限    |
| -------------- | --------- | -------------- | -------------- | -------------- |
| `sheet0901Dto` | `SHEET`   | `Sheet0901Dto` | 様式9の1シート | 未調査／未実装 |

## 子要素の詳細

- [Sheet0901Dto](./Sheet0901Dto.md)
