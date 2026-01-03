# AllSheet0712PartyMediationDto

## 概要

政治資金収支報告書V5の様式7の12（政治資金パーティの対価に係るあっせんによる収入）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_12` です。

## サンプルXML

```xml
<SYUUSHI07_12>
  <KUBUN1>
    <SHEET>
      <KINGAKU_GK>30000</KINGAKU_GK>
      <PATYI_NM>パーティ名称</PATYI_NM>
      <SORT_NO>9</SORT_NO>
      <ROW>
        <ICHIREN_NO>1</ICHIREN_NO>
        <NM>名称</NM>
        <KINGAKU>30000</KINGAKU>
        <DT>R4/2/2</DT>
        <KIKAN>1/1-1/31</KIKAN>
        <ADR>住所</ADR>
        <SYOKUGYO>職業</SYOKUGYO>
        <BIKOU>備考</BIKOU>
        <SEQ_NO>1</SEQ_NO>
        <ROWKBN>7</ROWKBN>
      </ROW>
    </SHEET>
  </KUBUN1>
  <KUBUN2>
    <SHEET>
      <KINGAKU_GK>30000</KINGAKU_GK>
      <PATYI_NM>パーティ名称</PATYI_NM>
      <SORT_NO>9</SORT_NO>
      <ROW>
        <ICHIREN_NO>1</ICHIREN_NO>
        <NM>名称</NM>
        <KINGAKU>30000</KINGAKU>
        <DT>R4/2/2</DT>
        <KIKAN>1/1-1/31</KIKAN>
        <ADR>住所</ADR>
        <SYOKUGYO>職業</SYOKUGYO>
        <BIKOU>備考</BIKOU>
        <SEQ_NO>1</SEQ_NO>
        <ROWKBN>7</ROWKBN>
      </ROW>
    </SHEET>
  </KUBUN2>
  <KUBUN3>
    <SHEET>
      <KINGAKU_GK>30000</KINGAKU_GK>
      <PATYI_NM>パーティ名称</PATYI_NM>
      <SORT_NO>9</SORT_NO>
      <ROW>
        <ICHIREN_NO>1</ICHIREN_NO>
        <NM>名称</NM>
        <KINGAKU>30000</KINGAKU>
        <DT>R4/2/2</DT>
        <KIKAN>1/1-1/31</KIKAN>
        <ADR>住所</ADR>
        <SYOKUGYO>職業</SYOKUGYO>
        <BIKOU>備考</BIKOU>
        <SEQ_NO>1</SEQ_NO>
        <ROWKBN>7</ROWKBN>
      </ROW>
    </SHEET>
  </KUBUN3>
</SYUUSHI07_12>
```

## プロパティ

|      プロパティ名      | XMLタグ名 |        データ型        |     説明     |    値の制限    |
| ---------------------- | --------- | ---------------------- | ------------ | -------------- |
| `allSheetKbn071201Dto` | `KUBUN1`  | `AllSheetKbn071201Dto` | 様式7の12の1 | 未調査／未実装 |
| `allSheetKbn071202Dto` | `KUBUN2`  | `AllSheetKbn071202Dto` | 様式7の12の2 | 未調査／未実装 |
| `allSheetKbn071203Dto` | `KUBUN3`  | `AllSheetKbn071203Dto` | 様式7の12の3 | 未調査／未実装 |

## 子要素の詳細

- [AllSheetKbn071201Dto](./AllSheetKbn071201Dto.md)
- [AllSheetKbn071202Dto](./AllSheetKbn071202Dto.md)
- [AllSheetKbn071203Dto](./AllSheetKbn071203Dto.md)
