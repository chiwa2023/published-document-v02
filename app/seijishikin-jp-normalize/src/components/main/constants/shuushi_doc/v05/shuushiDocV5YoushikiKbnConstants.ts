export class ShuushiDocV5YoushikiKbnConstants {

    /** 団体基礎情報(表紙) */
    static readonly HYOUSHI = 1;

    /** 収入項目集計表 */
    static readonly SHUUKEI_SHUUNYU = 2;

    /** 機関誌の発行その他 */
    static readonly KIKANSHI = 3;

    /** 借入金 */
    static readonly SHAKUNYUKIN = 4;

    /** 本部または支部からの交付金 */
    static readonly KOUFUKIN = 5;

    /** その他の収入 */
    static readonly SHUUNYU_SONOTA = 6;

    /** 寄付 */
    static readonly DONATE = 7;

    /** 寄付のうちあっせんによるもの */
    static readonly DONATE_ASSEN = 8;

    /** 政党匿名寄付 */
    static readonly DONATE_TOKUMEI = 9;

    /** 特定パーティー */
    static readonly TOKUTEI_PARTY = 10;

    /** 政治資金パーティー */
    static readonly PARTY = 11;

    /** 政治資金パーティーのうちあっせんによるもの */
    static readonly PARTY_ASSEN = 12;

    /** 支出項目集計表 */
    static readonly SHUUKEI_SHISHUTSU = 13;

    /** 経常経費の内訳 */
    static readonly KEIJO_KEIHI = 14;

    /** 政治活動費 */
    static readonly SEIJIKATSUDOUHI = 15;

    /** 本部または支部に供与した交付金 */
    static readonly KOUFUKIN_SHISHUTSU = 16;

    /** 資産項目記載一覧 */
    static readonly SHUUKEI_SHISAN = 17;

    /** 資産の内訳 */
    static readonly ESTATE = 18;

    /** 不動産詳細の内訳 */
    static readonly REALESTATE = 19;

    /** 宣誓書 */
    static readonly SENSEISHO = 20;

    /** 団体基礎情報(表紙) */
    static readonly HYOUSHI_TEXT = "団体基礎情報(表紙)";

    /** 収入項目集計表 */
    static readonly SHUUKEI_SHUUNYU_TEXT = "収入項目集計表";

    /** 機関誌の発行その他 */
    static readonly KIKANSHI_TEXT = "機関誌の発行その他";

    /** 借入金 */
    static readonly SHAKUNYUKIN_TEXT = "借入金";

    /** 本部または支部からの交付金 */
    static readonly KOUFUKIN_TEXT = "本部または支部からの交付金";

    /** その他の収入 */
    static readonly SHUUNYU_SONOTA_TEXT = "その他の収入";

    /** 寄付 */
    static readonly DONATE_TEXT = "寄付";

    /** 寄付のうちあっせんによるもの */
    static readonly DONATE_ASSEN_TEXT = "寄付のうちあっせんによるもの";

    /** 政党匿名寄付 */
    static readonly DONATE_TOKUMEI_TEXT = "政党匿名寄付";

    /** 特定パーティー */
    static readonly TOKUTEI_PARTY_TEXT = "特定パーティー";

    /** 政治資金パーティー */
    static readonly PARTY_TEXT = "政治資金パーティー";

    /** 政治資金パーティーのうちあっせんによるもの */
    static readonly PARTY_ASSEN_TEXT = "政治資金パーティーのうちあっせんによるもの";

    /** 支出項目集計表 */
    static readonly SHUUKEI_SHISHUTSU_TEXT = "支出項目集計表";

    /** 経常経費の内訳 */
    static readonly KEIJO_KEIHI_TEXT = "経常経費の内訳";

    /** 政治活動費 */
    static readonly SEIJIKATSUDOUHI_TEXT = "政治活動費";

    /** 本部または支部に供与した交付金 */
    static readonly KOUFUKIN_SHISHUTSU_TEXT = "本部または支部に供与した交付金";

    /** 資産項目記載一覧 */
    static readonly SHUUKEI_SHISAN_TEXT = "資産項目記載一覧";

    /** 資産の内訳 */
    static readonly ESTATE_TEXT = "資産の内訳";

    /** 不動産詳細の内訳 */
    static readonly REALESTATE_TEXT = "不動産詳細の内訳";

    /** 宣誓書 */
    static readonly SENSEISHO_TEXT = "宣誓書";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {

        switch (keyValue) {

            case ShuushiDocV5YoushikiKbnConstants.HYOUSHI:
                return ShuushiDocV5YoushikiKbnConstants.HYOUSHI_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.SHUUKEI_SHUUNYU:
                return ShuushiDocV5YoushikiKbnConstants.SHUUKEI_SHUUNYU_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.KIKANSHI:
                return ShuushiDocV5YoushikiKbnConstants.KIKANSHI_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.SHAKUNYUKIN:
                return ShuushiDocV5YoushikiKbnConstants.SHAKUNYUKIN_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.KOUFUKIN:
                return ShuushiDocV5YoushikiKbnConstants.KOUFUKIN_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.SHUUNYU_SONOTA:
                return ShuushiDocV5YoushikiKbnConstants.SHUUNYU_SONOTA_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.DONATE:
                return ShuushiDocV5YoushikiKbnConstants.DONATE_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.DONATE_ASSEN:
                return ShuushiDocV5YoushikiKbnConstants.DONATE_ASSEN_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.DONATE_TOKUMEI:
                return ShuushiDocV5YoushikiKbnConstants.DONATE_TOKUMEI_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.TOKUTEI_PARTY:
                return ShuushiDocV5YoushikiKbnConstants.TOKUTEI_PARTY_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.PARTY:
                return ShuushiDocV5YoushikiKbnConstants.PARTY_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.PARTY_ASSEN:
                return ShuushiDocV5YoushikiKbnConstants.PARTY_ASSEN_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.SHUUKEI_SHISHUTSU:
                return ShuushiDocV5YoushikiKbnConstants.SHUUKEI_SHISHUTSU_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.KEIJO_KEIHI:
                return ShuushiDocV5YoushikiKbnConstants.KEIJO_KEIHI_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.SEIJIKATSUDOUHI:
                return ShuushiDocV5YoushikiKbnConstants.SEIJIKATSUDOUHI_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.KOUFUKIN_SHISHUTSU:
                return ShuushiDocV5YoushikiKbnConstants.KOUFUKIN_SHISHUTSU_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.SHUUKEI_SHISAN:
                return ShuushiDocV5YoushikiKbnConstants.SHUUKEI_SHISAN_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.ESTATE:
                return ShuushiDocV5YoushikiKbnConstants.ESTATE_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.REALESTATE:
                return ShuushiDocV5YoushikiKbnConstants.REALESTATE_TEXT;

            case ShuushiDocV5YoushikiKbnConstants.SENSEISHO:
                return ShuushiDocV5YoushikiKbnConstants.SENSEISHO_TEXT;

            default:
                return "";
        }
    }

}
