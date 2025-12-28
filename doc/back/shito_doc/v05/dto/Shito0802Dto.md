# Shito0802Dto

## 概要

政党交付金使途報告書V5の様式8の2（資産等の内訳）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI08_2` です。

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

|  プロパティ名  | XMLタグ名 |    データ型    |      説明      |    値の制限    |
| -------------- | --------- | -------------- | -------------- | -------------- |
| `sheet0802Dto` | `SHEET`   | `Sheet0802Dto` | 様式8の2シート | 未調査／未実装 |

## 子要素の詳細

- [Sheet0802Dto](./Sheet0802Dto.md)
