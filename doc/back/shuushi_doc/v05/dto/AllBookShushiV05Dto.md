# AllBookShushiV05Dto 設計書

## 概要

政治資金収支報告書V5の全体データを表すDto。オンライン提出に使用するXMLをJava環境で読み出しをするのに使用する。

- com.fasterxml.jacksonのXmlMapperを使用する。
- 仕様公開ドキュメントが存在しないため、公式配布ツールからの逆コンパイル的な実装であり、対象となるファイルによっては読みとりきれないことがある。

## XML要素

ルート要素名は `BOOK`

## サンプルXML

テスト結果確認用のファイル[SYUUSI_least.xml](../../../../../app/back/src/test/resources/dto/publish/balancesheet/SYUUSI_least.xml)を参照のこと

## 利用例

```
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get("読みとりたいXMLのファイルパス");
        String readText = Files.readString(pathAnswer, Charset.forName("XMLのエンコード"));

        AllBookShushiV05Dto allShushiBook = xmlMapper.readValue(readText, new TypeReference<>() {
        });
        
        // 例：ヘッダのバージョンを読み出し
        assertEquals("20191220", allShushiBook.getAllBookHeaderDto().getVersion());
 
        // 以下、１政治資金収支報告書が1インスタンスのpure Java Dtoとして取り扱いが可能

```

## プロパティ

|                 プロパティ名                 |      XMLタグ名       |                   データ型                   |                説明                |    値の制限    |
| -------------------------------------------- | -------------------- | -------------------------------------------- | ---------------------------------- | -------------- |
| `allBookHeaderDto`                           | `HEAD`               | `AllBookHeaderDto`                           | 様式8の1に属する項目を統合する要素 | 未調査／未実装 |
| `allBookUmuInputDataDto`                     | `SYUUSHI_UMU_FLG`    | `AllBookUmuInputDataDto`                     | 様式8の1に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0701CoverAndOrganizationDetailsDto` | `SYUUSHI07_01`       | `AllSheet0701CoverAndOrganizationDetailsDto` | 様式8の1に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0702SummaryTableIncomeDto`          | `SYUUSHI07_02`       | `AllSheet0702SummaryTableIncomeDto`          | 様式8の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0703JournalAndOtherDto`             | `SYUUSHI07_03`       | `AllSheet0703JournalAndOtherDto`             | 様式8の3に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0704BorrowedMoneyDto`               | `SYUUSHI07_04`       | `AllSheet0704BorrowedMoneyDto`               | 様式8の4に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0705IncomeRelatedToGrantsDto`       | `SYUUSHI07_05`       | `AllSheet0705IncomeRelatedToGrantsDto`       | 様式8の5に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0706OtherIncomeDto`                 | `SYUUSHI07_06`       | `AllSheet0706OtherIncomeDto`                 | 様式8の6に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0707DonateDto`                      | `SYUUSHI07_07`       | `AllSheet0707DonateDto`                      | 様式8の6に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0708MediationDto`                   | `SYUUSHI07_08`       | `AllSheet0708MediationDto`                   | 様式8の7に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0709AnonymousInPoliticalPartyDto`   | `SYUUSHI07_09`       | `AllSheet0709AnonymousInPoliticalPartyDto`   | 様式9の1に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0710SpecificPartyDto`               | `SYUUSHI07_10`       | `AllSheet0710SpecificPartyDto`               | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0711ConsiderationPartyDto`          | `SYUUSHI07_11`       | `AllSheet0711ConsiderationPartyDto`          | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0712PartyMediationDto`              | `SYUUSHI07_12`       | `AllSheet0712PartyMediationDto`              | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0713ListOfExpenditureItemsDto`      | `SYUUSHI07_13`       | `AllSheet0713ListOfExpenditureItemsDto`      | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0714ConstsDto`                      | `SYUUSHI07_14`       | `AllSheet0714ConstsDto`                      | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0715ExpenseDto`                     | `SYUUSHI07_15`       | `AllSheet0715ExpenseDto`                     | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0716RelatedToGrantsDtoDto`          | `SYUUSHI07_16`       | `AllSheet0716RelatedToGrantsDtoDto`          | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0717SummaryTableOfAssetsDto`        | `SYUUSHI07_17`       | `AllSheet0717SummaryTableOfAssetsDto`        | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0718AssetsDto`                      | `SYUUSHI07_18`       | `AllSheet0718AssetsDto`                      | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0719RealEstateDto`                  | `SYUUSHI07_19`       | `AllSheet0719RealEstateDto`                  | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0720OathDto`                        | `SYUUSHI07_20`       | `AllSheet0720OathDto`                        | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0800DifficultCollectReceiptDto`     | `SYUUSHI08`          | `AllSheet0800DifficultCollectReceiptDto`     | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet0802WithdrawalItemsByTransferDto`   | `SYUUSHI08_02`       | `AllSheet0802WithdrawalItemsByTransferDto`   | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |
| `allSheet411710DonationClassifyDto`          | `SYUUSHI_KIFUKOUJYO` | `AllSheet411710DonationClassifyDto`          | 様式9の2に属する項目を統合する要素 | 未調査／未実装 |

## 子要素の詳細

- [AllBookHeaderDto](./AllBookHeaderDto.md)
- [AllBookUmuInputDataDto](./AllBookUmuInputDataDto.md)
- [AllSheet0701CoverAndOrganizationDetailsDto](./AllSheet0701CoverAndOrganizationDetailsDto.md)
- [AllSheet0702SummaryTableIncomeDto](./AllSheet0702SummaryTableIncomeDto.md)
- [AllSheet0703JournalAndOtherDto](./AllSheet0703JournalAndOtherDto.md)
- [AllSheet0704BorrowedMoneyDto](./AllSheet0704BorrowedMoneyDto.md)
- [AllSheet0705IncomeRelatedToGrantsDto](./AllSheet0705IncomeRelatedToGrantsDto.md)
- [AllSheet0706OtherIncomeDto](./AllSheet0706OtherIncomeDto.md)
- [AllSheet0707DonateDto](./AllSheet0707DonateDto.md)
- [AllSheet0708MediationDto](./AllSheet0708MediationDto.md)
- [AllSheet0709AnonymousInPoliticalPartyDto](./AllSheet0709AnonymousInPoliticalPartyDto.md)
- [AllSheet0710SpecificPartyDto](./AllSheet0710SpecificPartyDto.md)
- [AllSheet0711ConsiderationPartyDto](./AllSheet0711ConsiderationPartyDto.md)
- [AllSheet0712PartyMediationDto](./AllSheet0712PartyMediationDto.md)
- [AllSheet0713ListOfExpenditureItemsDto](./AllSheet0713ListOfExpenditureItemsDto.md)
- [AllSheet0714ConstsDto](./AllSheet0714ConstsDto.md)
- [AllSheet0715ExpenseDto](./AllSheet0715ExpenseDto.md)
- [AllSheet0716RelatedToGrantsDtoDto](./AllSheet0716RelatedToGrantsDtoDto.md)
- [AllSheet0717SummaryTableOfAssetsDto](./AllSheet0717SummaryTableOfAssetsDto.md)
- [AllSheet0718AssetsDto](./AllSheet0718AssetsDto.md)
- [AllSheet0719RealEstateDto](./AllSheet0719RealEstateDto.md)
- [AllSheet0720OathDto](./AllSheet0720OathDto.md)
- [AllSheet0800DifficultCollectReceiptDto](./AllSheet0800DifficultCollectReceiptDto.md)
- [AllSheet0802WithdrawalItemsByTransferDto](./AllSheet0802WithdrawalItemsByTransferDto.md)
- [AllSheet411710DonationClassifyDto](./AllSheet411710DonationClassifyDto.md)
