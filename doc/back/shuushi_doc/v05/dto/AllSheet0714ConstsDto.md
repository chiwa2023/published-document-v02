# AllSheet0714ConstsDto

## 概要

政治資金収支報告書V5の様式7の14（経常経費・政治活動費）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_14` です。

## サンプルXML

```xml
<SYUUSHI07_14>
  <KUBUN1>
    <SHEET>
      <KINGAKU_GK>30000</KINGAKU_GK>
      <SONOTA_GK></SONOTA_GK>
      <ROW>
        <ICHIREN_NO>1</ICHIREN_NO>
        <MOKUTEKI>目的</MOKUTEKI>
        <KINGAKU>30000</KINGAKU>
        <DT>R4/12/1</DT>
        <NM>支出の相手先名称</NM>
        <ADR>東京都千代田区</ADR>
        <BIKOU>備考</BIKOU>
        <RYOUSYU>0</RYOUSYU>
        <KOUFUKIN>1</KOUFUKIN>
      </ROW>
    </SHEET>
  </KUBUN1>
  <KUBUN2>
    <SHEET>
      <KINGAKU_GK>30000</KINGAKU_GK>
      <SONOTA_GK></SONOTA_GK>
      <ROW>
        <ICHIREN_NO>1</ICHIREN_NO>
        <MOKUTEKI>目的</MOKUTEKI>
        <KINGAKU>30000</KINGAKU>
        <DT>R4/12/1</DT>
        <NM>支出の相手先名称</NM>
        <ADR>東京都千代田区</ADR>
        <BIKOU>備考</BIKOU>
        <RYOUSYU>0</RYOUSYU>
        <KOUFUKIN>1</KOUFUKIN>
      </ROW>
    </SHEET>
  </KUBUN2>
  <KUBUN3>
    <SHEET>
      <KINGAKU_GK>30000</KINGAKU_GK>
      <SONOTA_GK></SONOTA_GK>
      <ROW>
        <ICHIREN_NO>1</ICHIREN_NO>
        <MOKUTEKI>目的</MOKUTEKI>
        <KINGAKU>30000</KINGAKU>
        <DT>R4/12/1</DT>
        <NM>支出の相手先名称</NM>
        <ADR>東京都千代田区</ADR>
        <BIKOU>備考</BIKOU>
        <RYOUSYU>0</RYOUSYU>
        <KOUFUKIN>1</KOUFUKIN>
      </ROW>
    </SHEET>
  </KUBUN3>
</SYUUSHI07_14>
```

## プロパティ

|      プロパティ名      | XMLタグ名 |        データ型        |       説明        |    値の制限    |
| ---------------------- | --------- | ---------------------- | ----------------- | -------------- |
| `allSheetKbn071401Dto` | `KUBUN1`  | `AllSheetKbn071401Dto` | 14の1の区分データ | 未調査／未実装 |
| `allSheetKbn071402Dto` | `KUBUN2`  | `AllSheetKbn071402Dto` | 14の2の区分データ | 未調査／未実装 |
| `allSheetKbn071403Dto` | `KUBUN3`  | `AllSheetKbn071403Dto` | 14の3の区分データ | 未調査／未実装 |

## 子要素の詳細

- [AllSheetKbn071401Dto](./AllSheetKbn071401Dto.md)
- [AllSheetKbn071402Dto](./AllSheetKbn071402Dto.md)
- [AllSheetKbn071403Dto](./AllSheetKbn071403Dto.md)
