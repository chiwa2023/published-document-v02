# AllSheet0703JournalAndOtherDto

## 概要

政治資金収支報告書V5の様式7の3（機関誌発行等の事業収入）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_03` です。

## サンプルXML

```xml
<SYUUSHI07_03>
  <SHEET>
    <KINGAKU_GK>0</KINGAKU_GK>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <GIGYOU_SYURUI>機関誌発行</GIGYOU_SYURUI>
      <KINGAKU>30000</KINGAKU>
      <BIKOU>備考</BIKOU>
    </ROW>
  </SHEET>
</SYUUSHI07_03>
```

## プロパティ

|          プロパティ名           | XMLタグ名 |            データ型             |       説明       |    値の制限    |
| ------------------------------- | --------- | ------------------------------- | ---------------- | -------------- |
| `sheet070300JournalAndOtherDto` | `SHEET`   | `Sheet070300JournalAndOtherDto` | 様式7の3のシート | 未調査／未実装 |

## 子要素の詳細

- [`Sheet070300JournalAndOtherDto`](./Sheet070300JournalAndOtherDto.md): 機関誌発行とその他の事業の収入に関する詳細情報を含みます。
