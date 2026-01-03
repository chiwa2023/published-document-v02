# AllSheet0706OtherIncomeDto

## 概要

政治資金収支報告書V5の様式7の6（その他の収入）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_06` です。

## サンプルXML

```xml
<SYUUSHI07_06>
  <SHEET>
    <KINGAKU_GK>0</KINGAKU_GK>
    <MIMAN_GK></MIMAN_GK>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <TEKIYOU>摘要</TEKIYOU>
      <KINGAKU>30000</KINGAKU>
      <BIKOU>備考</BIKOU>
    </ROW>
  </SHEET>
</SYUUSHI07_06>
```

## プロパティ

|        プロパティ名         | XMLタグ名 |          データ型           |      説明      |    値の制限    |
| --------------------------- | --------- | --------------------------- | -------------- | -------------- |
| `sheet070600OtherIncomeDto` | `SHEET`   | `Sheet070600OtherIncomeDto` | 様式7の6シート | 未調査／未実装 |

## 子要素の詳細

- [`Sheet070600OtherIncomeDto`](./Sheet070600OtherIncomeDto.md): その他の収入に関する詳細情報を含みます。
