# AllSheet0719RealEstateDto

## 概要

政治資金収支報告書V5の様式7の19（不動産利用の概況）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_19` です。

## サンプルXML

```xml
<SYUUSHI07_19>
  <SHEET>
    <KUBUN>1</KUBUN>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <TEKIYOU>摘要</TEKIYOU>
      <YOUTO>用途</YOUTO>
      <SIYOU_KANKEI>使用者との関係</SIYOU_KANKEI>
      <SIYOU_YOUTO>使用の用途</SIYOU_YOUTO>
      <SIYOU_MENSEKI>123.45</SIYOU_MENSEKI>
      <SIYOU_KAKAKU>4444</SIYOU_KAKAKU>
    </ROW>
  </SHEET>
  <SHEET>
    <KUBUN>2</KUBUN>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <TEKIYOU>摘要</TEKIYOU>
      <YOUTO>用途</YOUTO>
      <SIYOU_KANKEI>使用者との関係</SIYOU_KANKEI>
      <SIYOU_YOUTO>使用の用途</SIYOU_YOUTO>
      <SIYOU_MENSEKI>123.45</SIYOU_MENSEKI>
      <SIYOU_KAKAKU>4444</SIYOU_KAKAKU>
    </ROW>
  </SHEET>
  <SHEET>
    <KUBUN>3</KUBUN>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <TEKIYOU>摘要</TEKIYOU>
      <YOUTO>用途</YOUTO>
      <SIYOU_KANKEI>使用者との関係</SIYOU_KANKEI>
      <SIYOU_YOUTO>使用の用途</SIYOU_YOUTO>
      <SIYOU_MENSEKI>123.45</SIYOU_MENSEKI>
      <SIYOU_KAKAKU>4444</SIYOU_KAKAKU>
    </ROW>
  </SHEET>
</SYUUSHI07_19>
```

## プロパティ

|  プロパティ名   | XMLタグ名 |             データ型             |        説明         |    値の制限    |
| --------------- | --------- | -------------------------------- | ------------------- | -------------- |
| `listSheet0719` | `SHEET`   | `List<Sheet071900RealEstateDto>` | 様式7の19共通リスト | 未調査／未実装 |

## 子要素の詳細

- [`Sheet071900RealEstateDto`](./Sheet071900RealEstateDto.md): 不動産のうち土地の内訳に関する詳細情報を含みます。
