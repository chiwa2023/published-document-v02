# AllSheet0707DonateDto

## 概要

政治資金収支報告書V5の様式7の7（寄付の内訳）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_7` です。

## サンプルXML

```xml
<SYUUSHI07_7>
  <KUBUN1>
    <SHEET>
      <KINGAKU_GK>30000</KINGAKU_GK>
      <SONOTA_GK>2000</SONOTA_GK>
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
      <SONOTA_GK>2000</SONOTA_GK>
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
      <SONOTA_GK>2000</SONOTA_GK>
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
</SYUUSHI07_7>
```

## プロパティ

| プロパティ名            | XMLタグ名 | データ型                  | 説明         | 値の制限       |
| ----------------------- | --------- | ------------------------- | ------------ | -------------- |
| `allSheetKbn070701Dto`  | `KUBUN1`  | `AllSheetKbn070701Dto`    | 様式7の7の1  | 未調査／未実装 |
| `allSheetKbn070702Dto`  | `KUBUN2`  | `AllSheetKbn070702Dto`    | 様式7の7の2  | 未調査／未実装 |
| `allSheetKbn070703Dto`  | `KUBUN3`  | `AllSheetKbn070703Dto`    | 様式7の7の3  | 未調査／未実装 |

## 子要素の詳細

- [AllSheetKbn070701Dto](./AllSheetKbn070701Dto.md)
- [AllSheetKbn070702Dto](./AllSheetKbn070702Dto.md)
- [AllSheetKbn070703Dto](./AllSheetKbn070703Dto.md)
