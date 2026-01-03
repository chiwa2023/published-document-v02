# AllSheet0705IncomeRelatedToGrantsDto

## 概要

政治資金収支報告書V5の様式7の5（交付金に係る収入）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_05` です。

## サンプルXML

```xml
<SYUUSHI07_05>
  <SHEET>
    <KINGAKU_GK>30000</KINGAKU_GK>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <HONSIBU_NM>本部支部名称</HONSIBU_NM>
      <KINGAKU>30000</KINGAKU>
      <DT>R4/2/2</DT>
      <JIMU_ADR>事務所住所</JIMU_ADR>
      <BIKOU>備考</BIKOU>
    </ROW>
  </SHEET>
</SYUUSHI07_05>
```

## プロパティ

|             プロパティ名              | XMLタグ名 |            データ型             |      説明      |    値の制限    |
| ------------------------------------- | --------- | ------------------------------- | -------------- | -------------- |
| `sheet070500IncomeRelatedToGrantsDto` | `SHEET`   | `Sheet070500RelatedToGrantsDto` | 様式7の5シート | 未調査／未実装 |

## 子要素の詳細

- [`Sheet070500RelatedToGrantsDto`](./Sheet070500RelatedToGrantsDto.md): 本部または支部から供与された交付金に係る収入に関する詳細情報を含みます。
