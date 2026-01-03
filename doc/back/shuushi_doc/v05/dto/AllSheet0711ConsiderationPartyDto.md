# AllSheet0711ConsiderationPartyDto

## 概要

政治資金収支報告書V5の様式7の11（政治資金パーティの対価に係る収入）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_11` です。

## サンプルXML

```xml
<SYUUSHI07_11>
  <KUBUN1>
    <SHEET>
      <KINGAKU_GK>30000</KINGAKU_GK>
      <PATYI_NM>パーティ名称</PATYI_NM>
      <SORT_NO>9</SORT_NO>
      <ROW>
        <ICHIREN_NO>1</ICHIREN_NO>
        <KIFUSYA_NM>寄付者名称</KIFUSYA_NM>
        <KINGAKU>30000</KINGAKU>
        <DT>R4/2/2</DT>
        <ADR>住所</ADR>
        <SYOKUGYO>職業</SYOKUGYO>
        <BIKOU>備考</BIKOU>
        <SEQ_NO>1</SEQ_NO>
        <ZEIGAKUKOUJYO>0</ZEIGAKUKOUJYO>
        <ROWKBN>8</ROWKBN>
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
        <KIFUSYA_NM>寄付者名称</KIFUSYA_NM>
        <KINGAKU>30000</KINGAKU>
        <DT>R4/2/2</DT>
        <ADR>住所</ADR>
        <SYOKUGYO>職業</SYOKUGYO>
        <BIKOU>備考</BIKOU>
        <SEQ_NO>1</SEQ_NO>
        <ZEIGAKUKOUJYO>0</ZEIGAKUKOUJYO>
        <ROWKBN>8</ROWKBN>
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
        <KIFUSYA_NM>寄付者名称</KIFUSYA_NM>
        <KINGAKU>30000</KINGAKU>
        <DT>R4/2/2</DT>
        <ADR>住所</ADR>
        <SYOKUGYO>職業</SYOKUGYO>
        <BIKOU>備考</BIKOU>
        <SEQ_NO>1</SEQ_NO>
        <ZEIGAKUKOUJYO>0</ZEIGAKUKOUJYO>
        <ROWKBN>8</ROWKBN>
      </ROW>
    </SHEET>
  </KUBUN3>
</SYUUSHI07_11>
```

## プロパティ

|      プロパティ名      | XMLタグ名 |        データ型        |     説明     |    値の制限    |
| ---------------------- | --------- | ---------------------- | ------------ | -------------- |
| `allSheetKbn071101Dto` | `KUBUN1`  | `AllSheetKbn071101Dto` | 様式7の11の1 | 未調査／未実装 |
| `allSheetKbn071102Dto` | `KUBUN2`  | `AllSheetKbn071102Dto` | 様式7の11の2 | 未調査／未実装 |
| `allSheetKbn071103Dto` | `KUBUN3`  | `AllSheetKbn071103Dto` | 様式7の11の3 | 未調査／未実装 |

## 子要素の詳細

- [`AllSheetKbn071101Dto`](./AllSheetKbn071101Dto.md): 個人からのパーティ収入に関する情報を含みます。
- [`AllSheetKbn071102Dto`](./AllSheetKbn071102Dto.md): 団体からのパーティ収入に関する情報を含みます。
- [`AllSheetKbn071103Dto`](./AllSheetKbn071103Dto.md): 政治団体からのパーティ収入に関する情報を含みます。
