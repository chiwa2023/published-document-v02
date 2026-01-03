# AllSheet411710DonationClassifyDto

## 概要

政治資金収支報告書V5の様式411710（寄付控除を受ける団体の区分と補足情報）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI_KIFUKOUJYO` です。

## サンプルXML

```xml
<SYUUSHI_KIFUKOUJYO>
  <SHEET>
    <KUBUN>1</KUBUN>
    <ZEI411713>
      <GIIN_NM>国会議員姓名</GIIN_NM>
    </ZEI411713>
    <ZEI411714>
      <NM>選挙立候補者</NM>
      <SENKYO>市議会議員選挙</SENKYO>
      <DT>R4/12/1</DT>
    </ZEI411714>
  </SHEET>
</SYUUSHI_KIFUKOUJYO>
```

## プロパティ

|           プロパティ名           | XMLタグ名 |             データ型             |       説明       |    値の制限    |
| -------------------------------- | --------- | -------------------------------- | ---------------- | -------------- |
| `sheet411710DonationClassifyDto` | `SHEET`   | `Sheet411710DonationClassifyDto` | 寄付控除団体情報 | 未調査／未実装 |

## 子要素の詳細

- [`Sheet411710DonationClassifyDto`](./Sheet411710DonationClassifyDto.md): 寄付控除を受ける団体の区分と補足情報に関する詳細情報を含みます。
