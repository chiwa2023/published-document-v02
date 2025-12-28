# Shito0806Dto

## 概要

政党交付金使途報告書V5の様式8の6（基金等の明細）の全体データDto。

## XML要素

ルート要素名は `SITO08_06` です。

## サンプルXML

```xml
<Shito0806Dto>
  <SHEET>
    <KIKIN_NM>極悪同盟専用</KIKIN_NM>
    <ZENNEN_ZAN_GK>99999999</ZENNEN_ZAN_GK>
    <MOKUTEKI>強烈な裏金買収</MOKUTEKI>
    <GOUKEI_GK>1111</GOUKEI_GK>
    <GOUKEI_BIKOU>合計備考</GOUKEI_BIKOU>
    <HONNEN_ZAN_GK>91919191919</HONNEN_ZAN_GK>
    <HONNEN_ZAN_BIKOU>本年残備考</HONNEN_ZAN_BIKOU>
    <ZOUGEN_GK>334</ZOUGEN_GK>
    <ZOUGEN_BIKOU>増減備考</ZOUGEN_BIKOU>
    <KUBUN1>
      <SYOUKEI_GK>654654</SYOUKEI_GK>
      <SYOUKEI_BIKOU>積み立て特別備考</SYOUKEI_BIKOU>
      <ROW>
        <ICHIREN_NO>22</ICHIREN_NO>
        <DT>R4/9/19</DT>
        <KINGAKU>997755</KINGAKU>
        <BIKOU>備品</BIKOU>
      </ROW>
    </KUBUN1>
    <KUBUN2>
      <SYOUKEI_GK>654654</SYOUKEI_GK>
      <SYOUKEI_BIKOU>果実特別備考</SYOUKEI_BIKOU>
      <ROW>
        <ICHIREN_NO>22</ICHIREN_NO>
        <DT>R4/9/19</DT>
        <KINGAKU>997755</KINGAKU>
        <BIKOU>備品</BIKOU>
      </ROW>
    </KUBUN2>
    <KUBUN3>
      <SYOUKEI_GK>654654</SYOUKEI_GK>
      <SYOUKEI_BIKOU>取り崩し特別備考</SYOUKEI_BIKOU>
      <ROW>
        <ICHIREN_NO>22</ICHIREN_NO>
        <DT>R4/9/19</DT>
        <KINGAKU>997755</KINGAKU>
        <BIKOU>備品</BIKOU>
      </ROW>
    </KUBUN3>
  </SHEET>
</Shito0806Dto>
```

## プロパティ

| プロパティ名 | XMLタグ名 |       データ型       |     説明     |    値の制限    |
| ------------ | --------- | -------------------- | ------------ | -------------- |
| `list`       | `SHEET`   | `List<Sheet0806Dto>` | シートリスト | 未調査／未実装 |

## 子要素の詳細

- [Sheet0806Dto](./Sheet0806Dto.md)
