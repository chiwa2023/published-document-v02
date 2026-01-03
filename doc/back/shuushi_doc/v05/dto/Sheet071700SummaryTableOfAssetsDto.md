# Sheet071700SummaryTableOfAssetsDto

## 概要

政治資金収支報告書V5の様式7の17（資産等の状況総括表）のシート情報を表すDto。

## XML要素

ルート要素名は `SHEET` です。

## プロパティ

|     プロパティ名     |      XMLタグ名      | データ型  |        説明        |    値の制限    |
| :------------------- | :------------------ | :-------- | :----------------- | :------------- |
| `flgTochi`           | `TOCHI_UMU`         | `Integer` | 土地報告フラグ     | 未調査／未実装 |
| `bikouTochi`         | `TOCHI_BIKOU`       | `String`  | 備考土地           | 未調査／未実装 |
| `flgTatemono`        | `TATEMONO_UMU`      | `Integer` | 建物報告フラグ     | 未調査／未実装 |
| `bikouTatemono`      | `TATEMONO_BIKOU`    | `String`  | 備考建物           | 未調査／未実装 |
| `flgShakuchiken`     | `SYAKUCHI_UMU`      | `Integer` | 借地件報告フラグ   | 未調査／未実装 |
| `bikouShakuchiken`   | `SYAKUCHI_BIKOU`    | `String`  | 備考借地権         | 未調査／未実装 |
| `flgDohsan`          | `DOUSAN_UMU`        | `Integer` | 動産報告フラグ     | 未調査／未実装 |
| `bikouDohsan`        | `DOUSAN_BIKOU`      | `String`  | 動産借入           | 未調査／未実装 |
| `flgYokin`           | `YOKIN_UMU`         | `Integer` | 預金報告フラグ     | 未調査／未実装 |
| `bikouYokin`         | `YOKIN_BIKOU`       | `String`  | 備考預金           | 未調査／未実装 |
| `flgShintaku`        | `SINTAKU_UMU`       | `Integer` | 信託報告フラグ     | 未調査／未実装 |
| `bikouShintaku`      | `SINTAKU_BIKOU`     | `String`  | 備考信託           | 未調査／未実装 |
| `flgShouken`         | `SYOUKEN_UMU`       | `Integer` | 証券報告フラグ     | 未調査／未実装 |
| `bikouShouken`       | `SYOUKEN_BIKOU`     | `String`  | 備考証券           | 未調査／未実装 |
| `flgShusshi`         | `SYUSSI_UMU`        | `Integer` | 出資報告フラグ     | 未調査／未実装 |
| `bikouShusshi`       | `SYUSSI_BIKOU`      | `String`  | 備考出資           | 未調査／未実装 |
| `flgKashitsuke`      | `KASITUKE_UMU`      | `Integer` | 貸付報告フラグ     | 未調査／未実装 |
| `bikouKashitsuke`    | `KASITUKE_BIKOU`    | `String`  | 備考貸付           | 未調査／未実装 |
| `flgShikikin`        | `SIKIKIN_UMU`       | `Integer` | 敷金報告フラグ     | 未調査／未実装 |
| `bikouShikikin`      | `SIKIKIN_BIKOU`     | `String`  | 備考敷金           | 未調査／未実装 |
| `flgShisetsuRiyou`   | `SISETURIYOU_UMU`   | `Integer` | 施設利用報告フラグ | 未調査／未実装 |
| `bikouShisetsuRiyou` | `SISETURIYOU_BIKOU` | `String`  | 備考施設利用       | 未調査／未実装 |
| `flgKairiire`        | `KARIIRE_UMU`       | `Integer` | 借入報告フラグ     | 未調査／未実装 |
| `bikouKariire`       | `KARIIRE_BIKOU`     | `String`  | 備考借入           | 未調査／未実装 |
