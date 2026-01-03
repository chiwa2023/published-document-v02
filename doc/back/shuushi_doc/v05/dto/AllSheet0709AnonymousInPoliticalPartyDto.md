# AllSheet0709AnonymousInPoliticalPartyDto

## 概要

政治資金収支報告書V5の様式7の9（政党匿名寄付）の全体データDto。

## XML要素

ルート要素名は `SYUUSHI07_09` です。

## サンプルXML

```xml
<SYUUSHI07_09>
  <SHEET>
    <KINGAKU_GK>30000</KINGAKU_GK>
    <ROW>
      <ICHIREN_NO>1</ICHIREN_NO>
      <BASYO>開催場所</BASYO>
      <KINGAKU>30000</KINGAKU>
      <DT>R4/3/1</DT>
      <BIKOU>備考</BIKOU>
    </ROW>
  </SHEET>
</SYUUSHI07_09>
```

## プロパティ

|               プロパティ名                | XMLタグ名 |                 データ型                  |      説明      |    値の制限    |
| ----------------------------------------- | --------- | ----------------------------------------- | -------------- | -------------- |
| `sheet070900AnonymousInPoliticalPartyDto` | `SHEET`   | `Sheet070900AnonymousInPoliticalPartyDto` | 様式7の9データ | 未調査／未実装 |

## 子要素の詳細

- [`Sheet070900AnonymousInPoliticalPartyDto`](./Sheet070900AnonymousInPoliticalPartyDto.md): 政党匿名寄付の収入に関する詳細情報を含みます。
