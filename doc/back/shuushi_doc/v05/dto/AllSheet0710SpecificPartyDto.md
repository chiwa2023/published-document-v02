# AllSheet0710SpecificPartyDto

## 概要

政治資金収支報告書V5の様式7の10（特定パーティの対価に係る収入）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_10` です。

## サンプルXML

```xml
<SYUUSHI07_10>
  <SHEET>
    <KINGAKU_GK>30000</KINGAKU_GK>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <PATYI_NM>パーティ名称</PATYI_NM>
      <KINGAKU>30000</KINGAKU>
      <SHIHARAI_SU>3</SHIHARAI_SU>
      <KAISAI_DT>R4/2/2</KAISAI_DT>
      <KAISAI_BASYO>開催場所</KAISAI_BASYO>
      <BIKOU>備考</BIKOU>
    </ROW>
  </SHEET>
</SYUUSHI07_10>
```

## プロパティ

|         プロパティ名          | XMLタグ名 |           データ型            |      説明       |    値の制限    |
| ----------------------------- | --------- | ----------------------------- | --------------- | -------------- |
| `sheet071000SpecificPartyDto` | `SHEET`   | `Sheet071000SpecificPartyDto` | 様式7の10データ | 未調査／未実装 |

## 子要素の詳細

- [`Sheet071000SpecificPartyDto`](./Sheet071000SpecificPartyDto.md): 特定パーティの対価に係る収入に関する詳細情報を含みます。
