# AllSheet0708MediationDto

## 概要

政治資金収支報告書V5の様式7の8（あっせんによる寄付）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_8` です。

## サンプルXML

```xml
<SYUUSHI07_8>
  <KUBUN1>
    <SHEET>
      <KINGAKU_GK>30000</KINGAKU_GK>
      <SONOTA_GK>2000</SONOTA_GK>
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
      <SONOTA_GK>2000</SONOTA_GK>
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
      <SONOTA_GK>2000</SONOTA_GK>
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
</SYUUSHI07_8>
```

## プロパティ

|      プロパティ名      | XMLタグ名 |        データ型        |    説明     |    値の制限    |
| ---------------------- | --------- | ---------------------- | ----------- | -------------- |
| `allSheetKbn070801Dto` | `KUBUN1`  | `AllSheetKbn070801Dto` | 様式7の8の1 | 未調査／未実装 |
| `allSheetKbn070802Dto` | `KUBUN2`  | `AllSheetKbn070802Dto` | 様式7の8の2 | 未調査／未実装 |
| `allSheetKbn070803Dto` | `KUBUN3`  | `AllSheetKbn070803Dto` | 様式7の8の3 | 未調査／未実装 |

## 子要素の詳細

- [`AllSheetKbn070801Dto`](./AllSheetKbn070801Dto.md): 個人によるあっせんの寄付に関する情報を含みます。
- [`AllSheetKbn070802Dto`](./AllSheetKbn070802Dto.md): 団体によるあっせんの寄付に関する情報を含みます。
- [`AllSheetKbn070803Dto`](./AllSheetKbn070803Dto.md): 政治団体によるあっせんの寄付に関する情報を含みます。
