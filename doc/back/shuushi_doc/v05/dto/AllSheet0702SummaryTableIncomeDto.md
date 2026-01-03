# AllSheet0702SummaryTableIncomeDto

## 概要

政治資金収支報告書V5の様式7の2（収入一覧表）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_02` です。

## サンプルXML

```xml
<SYUUSHI07_02>
  <SHEET>
    <SYUNYU_SGK>30000</SYUNYU_SGK>
    <ZENNEN_KKS_GK>30000</ZENNEN_KKS_GK>
    <HONNEN_SYUNYU_GK>30000</HONNEN_SYUNYU_GK>
    <SISYUTU_SGK>30000</SISYUTU_SGK>
    <YOKUNEN_KKS_GK>30000</YOKUNEN_KKS_GK>
    <KOJIN_FUTAN_KGK>30000</KOJIN_FUTAN_KGK>
    <KOJIN_FUTAN_SU>30000</KOJIN_FUTAN_SU>
    <KOJIN_KIFU_GK>30000</KOJIN_KIFU_GK>
    <KOJIN_KIFU_BIKOU>備考</KOJIN_KIFU_BIKOU>
    <TOKUTEI_KIFU_GK>30000</TOKUTEI_KIFU_GK>
    <TOKUTEI_KIFU_BIKOU>備考</TOKUTEI_KIFU_BIKOU>
    <HOJIN_KIFU_GK>30000</HOJIN_KIFU_GK>
    <HOJIN_KIFU_BIKOU>備考</HOJIN_KIFU_BIKOU>
    <SEIJI_KIFU_GK>30000</SEIJI_KIFU_GK>
    <SEIJI_KIFU_BIKOU>備考</SEIJI_KIFU_BIKOU>
    <KIFU_SKEI_GK>30000</KIFU_SKEI_GK>
    <KIFU_SKEI_BIKOU>備考</KIFU_SKEI_BIKOU>
    <ATUSEN_GK>30000</ATUSEN_GK>
    <ATUSEN_BIKOU>備考</ATUSEN_BIKOU>
    <TOKUMEI_KIFU_GK>30000</TOKUMEI_KIFU_GK>
    <TOKUMEI_KIFU_BIKOU>備考</TOKUMEI_KIFU_BIKOU>
    <KIFU_GKEI_GK>30000</KIFU_GKEI_GK>
    <KIFU_GKEI_BIKOU>備考</KIFU_GKEI_BIKOU>
  </SHEET>
</SYUUSHI07_02>
```

## プロパティ

|                 プロパティ名                  | XMLタグ名 |           データ型            |           説明           |    値の制限    |
| --------------------------------------------- | --------- | ----------------------------- | ------------------------ | -------------- |
| `sheet070200SummaryTableIncomeExpenditureDto` | `SHEET`   | `Sheet070200SummaryIncomeDto` | 様式7の2収入一覧表データ | 未調査／未実装 |

## 子要素の詳細

- [`Sheet070200SummaryIncomeDto`](./Sheet070200SummaryIncomeDto.md): 収支の総括表に関する詳細情報を含みます。
