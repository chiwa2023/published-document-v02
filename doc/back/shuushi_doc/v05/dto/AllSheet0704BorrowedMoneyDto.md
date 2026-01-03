# AllSheet0704BorrowedMoneyDto

## 概要

政治資金収支報告書V5の様式7の4（借入金）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_04` です。

## サンプルXML

```xml
<SYUUSHI07_04>
  <SHEET>
    <KINGAKU_GK>30000</KINGAKU_GK>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <KARIIRESAKI>借入先</KARIIRESAKI>
      <KINGAKU>30000</KINGAKU>
      <BIKOU>備考</BIKOU>
    </ROW>
  </SHEET>
</SYUUSHI07_04>
```

## プロパティ

|         プロパティ名          | XMLタグ名 |           データ型            |       説明       |    値の制限    |
| ----------------------------- | --------- | ----------------------------- | ---------------- | -------------- |
| `sheet070400BorrowedMoneyDto` | `SHEET`   | `Sheet070400BorrowedMoneyDto` | 様式7の4のシート | 未調査／未実装 |

## 子要素の詳細

- [`Sheet070400BorrowedMoneyDto`](./Sheet070400BorrowedMoneyDto.md): 借入金に関する詳細情報を含みます。
