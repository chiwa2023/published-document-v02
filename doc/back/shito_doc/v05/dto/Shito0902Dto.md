# Shito0902Dto

## 概要

政党交付金使途報告書V5の様式9の2（振込明細書の内訳）の全体データDto。

## XML要素

ルート要素名は `SITO09_02` です。

## サンプルXML

```xml
<Shito0902Dto>
  <SHEET>
    <KOMOKU>事務所費</KOMOKU>
    <TEKIYO>適当な摘要</TEKIYO>
    <DANTAI_NM>ちゃらんぽらん政治団体</DANTAI_NM>
  </SHEET>
</Shito0902Dto>
```

## プロパティ

| プロパティ名 | XMLタグ名 |       データ型       |     説明     |    値の制限    |
| ------------ | --------- | -------------------- | ------------ | -------------- |
| `list`       | `SHEET`   | `List<Sheet0902Dto>` | シートリスト | 未調査／未実装 |

## 子要素の詳細

- [Sheet0902Dto](./Sheet0902Dto.md)
