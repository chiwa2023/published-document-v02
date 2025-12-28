# AllBookShitoV05Dto 設計書

## 概要

政党交付金使途報告書V5の全体データを表すDto。オンライン提出に使用するXMLをJava環境で読み出しをするのに使用する。

- com.fasterxml.jacksonのXmlMapperを使用する。
- 仕様公開ドキュメントが存在しないため、公式配布ツールからの逆コンパイル的な実装であり、対象となるファイルによっては読みとりきれないことがある。

## XML要素

ルート要素名は `BOOK`

## サンプルXML

テスト結果確認用のファイル[SITO.xml](../../../../../app/back/src/test/resources/dto/publish/party_usage/SITO.xml)を参照のこと

## 利用例

```
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get("読みとりたいXMLのファイルパス");
        String readText = Files.readString(pathAnswer, Charset.forName("XMLのエンコード"));

        AllBookShitoV05Dto allShitoBook = xmlMapper.readValue(readText, new TypeReference<>() {
        });

        // 例：ヘッダのバージョンを読み出し
        assertEquals("20191220", allShitoBook.getBookHeadDto().getVersion(), "バージョン");

        // 以下、１政党交付金使途報告書が1インスタンスのpure Java Dtoとして取り扱いが可能
```

## プロパティ

|  プロパティ名   |  XMLタグ名  |    データ型     |                説明                |    値の制限    |
| --------------- | ----------- | --------------- | ---------------------------------- | -------------- |
| `bookHeadDto`   | `HEAD`      | `BookHeadDto`   | 文書ヘッダを表す要素               | 未調査／未実装 |
| `SitoUmuFlgDto` | `SITO_FLG`  | `sitoUmuFlgDto` | 要素の有無チェックを格納する       | 未調査／未実装 |
| `shito0801Dto`  | `SITO08_01` | `Shito0801Dto`  | 様式8の1に属する項目を統合する要素 | 未調査／未実装 |
| `shito0802Dto`  | `SITO08_02` | `Shito0802Dto`  | 様式8の2に属する項目を統合する要素 | 未調査／未実装 |
| `shito0803Dto`  | `SITO08_03` | `Shito0803Dto`  | 様式8の3に属する項目を統合する要素 | 未調査／未実装 |
| `shito0804Dto`  | `SITO08_04` | `Shito0804Dto`  | 様式8の4に属する項目を統合する要素 | 未調査／未実装 |
| `shito0805Dto`  | `SITO08_05` | `Shito0805Dto`  | 様式8の5に属する項目を統合する要素 | 未調査／未実装 |
| `shito0806Dto`  | `SITO08_06` | `Shito0806Dto`  | 様式8の6に属する項目を統合する要素 | 未調査／未実装 |
| `shito0807Dto`  | `SITO08_07` | `Shito0807Dto`  | 様式8の7に属する項目を統合する要素 | 未調査／未実装 |
| `shito0901Dto`  | `SITO09_01` | `Shito0901Dto`  | 様式9の1に属する項目を統合する要素 | 未調査／未実装 |
| `shito0902Dto`  | `SITO09_02` | `Shito0902Dto`  | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |

## 子要素の詳細

- [BookHeadDto](./BookHeadDto.md)
- [SitoUmuFlgDto](./SitoUmuFlgDto.md)
- [Sheet0801Dto](./Sheet0801Dto.md)
- [Sheet0802Dto](./Sheet0802Dto.md)
- [Sheet0803Dto](./Sheet0803Dto.md)
- [Sheet0804Dto](./Sheet0804Dto.md)
- [Sheet0805Dto](./Sheet0805Dto.md)
- [Sheet0806Dto](./Sheet0806Dto.md)
- [Sheet0807Dto](./Sheet0807Dto.md)
- [Sheet0901Dto](./Sheet0808Dto.md)
- [Sheet0902Dto](./Sheet0809Dto.md)
