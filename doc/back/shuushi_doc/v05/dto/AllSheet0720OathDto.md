# AllSheet0720OathDto

## 概要

政治資金収支報告書V5の様式7の20（宣誓書）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_20` です。

## サンプルXML

```xml
<SYUUSHI07_20>
  <SHEET>
    <RYOUSYU_UMU>0</RYOUSYU_UMU>
    <KANSA_IKEN_UMU>0</KANSA_IKEN_UMU>
    <KANSA_HOUKOKU_UMU>1</KANSA_HOUKOKU_UMU>
    <SENSEI_DT>R4/12/1</SENSEI_DT>
    <DANTAI_NM>団体名称</DANTAI_NM>
    <KAI_NM1>会計責任者の姓</KAI_NM1>
    <KAI_NM2>会計責任者の名</KAI_NM2>
    <DAI_NM1>解散時代表者の姓</DAI_NM1>
    <DAI_NM2>解散時代表者の名</DAI_NM2>
  </SHEET>
</SYUUSHI07_20>
```

## プロパティ

|     プロパティ名     | XMLタグ名 |       データ型       |       説明        |    値の制限    |
| -------------------- | --------- | -------------------- | ----------------- | -------------- |
| `sheet072000OathDto` | `SHEET`   | `Sheet072000OathDto` | 様式7の20のデータ | 未調査／未実装 |

## 子要素の詳細

- [`Sheet072000OathDto`](./Sheet072000OathDto.md): 宣誓書に関する詳細情報を含みます。
