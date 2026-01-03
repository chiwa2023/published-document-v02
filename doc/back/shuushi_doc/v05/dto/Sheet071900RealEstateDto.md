# Sheet071900RealEstateDto

## 概要

政治資金収支報告書V5の様式7の19（不動産利用の概況）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

|   プロパティ名    | XMLタグ名 |             データ型              |    説明    |    値の制限    |
| :---------------- | :-------- | :-------------------------------- | :--------- | :------------- |
| `kbnRealEstitate` | `KUBUN`   | `Integer`                         | 区分       | 未調査／未実装 |
| `list`            | `ROW`     | `List<Row071900RealEstateUseDto>` | 項目リスト | 未調査／未実装 |

## 子要素の詳細

### `Row071900RealEstateUseDto` の詳細

`list` 内に含まれる `Row071900RealEstateUseDto` の各項目は以下の構造を持ちます。

|   プロパティ名    |    XMLタグ名    | データ型  |          説明          |    値の制限    |
| :---------------- | :-------------- | :-------- | :--------------------- | :------------- |
| `ichirenNo`       | `ICHIREN_NO`    | `Integer` | 連番                   | 未調査／未実装 |
| `tekiyou`         | `TEKIYOU`       | `String`  | 摘要                   | 未調査／未実装 |
| `youto`           | `YOUTO`         | `String`  | 用途                   | 未調査／未実装 |
| `kankeiShiyousha` | `SIYOU_KANKEI`  | `String`  | 使用者と代表者との関係 | 未調査／未実装 |
| `shiyouYouto`     | `SIYOU_YOUTO`   | `String`  | 使用の用途             | 未調査／未実装 |
| `shiyouMenseki`   | `SIYOU_MENSEKI` | `String`  | 使用面積               | 未調査／未実装 |
| `shiyouKakaku`    | `SIYOU_KAKAKU`  | `Long`    | 使用価格               | 未調査／未実装 |
