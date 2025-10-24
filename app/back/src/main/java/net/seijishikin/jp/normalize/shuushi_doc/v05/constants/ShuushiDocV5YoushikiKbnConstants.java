package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書様式区分定数(V5)
 */
public final class ShuushiDocV5YoushikiKbnConstants {

    /** 団体基礎情報(表紙) */
    public static final short HYOUSHI = 1;

    /** 収入項目集計表 */
    public static final short SHUUKEI_SHUUNYU = 2;

    /** 機関誌の発行その他 */
    public static final short KIKANSHI = 3;

    /** 借入金 */
    public static final short SHAKUNYUKIN = 4;

    /** 本部または支部からの交付金 */
    public static final short KOUFUKIN = 5;

    /** その他の収入 */
    public static final short SHUUNYU_SONOTA = 6;

    /** 寄付 */
    public static final short DONATE = 7;

    /** 寄付のうちあっせんによるもの */
    public static final short DONATE_ASSEN = 8;

    /** 政党匿名寄付 */
    public static final short DONATE_TOKUMEI = 9;

    /** 特定パーティー */
    public static final short TOKUTEI_PARTY = 10;

    /** 政治資金パーティー */
    public static final short PARTY = 11;

    /** 政治資金パーティーのうちあっせんによるもの */
    public static final short PARTY_ASSEN = 12;

    /** 支出項目集計表 */
    public static final short SHUUKEI_SHISHUTSU = 13;

    /** 経常経費の内訳 */
    public static final short KEIJO_KEIHI = 14;

    /** 政治活動費 */
    public static final short SEIJIKATSUDOUHI = 15;

    /** 本部または支部に供与した交付金 */
    public static final short KOUFUKIN_SHISHUTSU = 16;

    /** 資産項目記載一覧 */
    public static final short SHUUKEI_SHISAN = 17;

    /** 資産の内訳 */
    public static final short ESTATE = 18;

    /** 不動産詳細の内訳 */
    public static final short REALESTATE = 19;

    /** 宣誓書 */
    public static final short SENSEISHO = 20;

    /** 団体基礎情報(表紙) */
    public static final String HYOUSHI_TEXT = "団体基礎情報(表紙)";

    /** 収入項目集計表 */
    public static final String SHUUKEI_SHUUNYU_TEXT = "収入項目集計表";

    /** 機関誌の発行その他 */
    public static final String KIKANSHI_TEXT = "機関誌の発行その他";

    /** 借入金 */
    public static final String SHAKUNYUKIN_TEXT = "借入金";

    /** 本部または支部からの交付金 */
    public static final String KOUFUKIN_TEXT = "本部または支部からの交付金";

    /** その他の収入 */
    public static final String SHUUNYU_SONOTA_TEXT = "その他の収入";

    /** 寄付 */
    public static final String DONATE_TEXT = "寄付";

    /** 寄付のうちあっせんによるもの */
    public static final String DONATE_ASSEN_TEXT = "寄付のうちあっせんによるもの";

    /** 政党匿名寄付 */
    public static final String DONATE_TOKUMEI_TEXT = "政党匿名寄付";

    /** 特定パーティー */
    public static final String TOKUTEI_PARTY_TEXT = "特定パーティー";

    /** 政治資金パーティー */
    public static final String PARTY_TEXT = "政治資金パーティー";

    /** 政治資金パーティーのうちあっせんによるもの */
    public static final String PARTY_ASSEN_TEXT = "政治資金パーティーのうちあっせんによるもの";

    /** 支出項目集計表 */
    public static final String SHUUKEI_SHISHUTSU_TEXT = "支出項目集計表";

    /** 経常経費の内訳 */
    public static final String KEIJO_KEIHI_TEXT = "経常経費の内訳";

    /** 政治活動費 */
    public static final String SEIJIKATSUDOUHI_TEXT = "政治活動費";

    /** 本部または支部に供与した交付金 */
    public static final String KOUFUKIN_SHISHUTSU_TEXT = "本部または支部に供与した交付金";

    /** 資産項目記載一覧 */
    public static final String SHUUKEI_SHISAN_TEXT = "資産項目記載一覧";

    /** 資産の内訳 */
    public static final String ESTATE_TEXT = "資産の内訳";

    /** 不動産詳細の内訳 */
    public static final String REALESTATE_TEXT = "不動産詳細の内訳";

    /** 宣誓書 */
    public static final String SENSEISHO_TEXT = "宣誓書";

    private ShuushiDocV5YoushikiKbnConstants() {

    }

    /**
     * 表示ラベルを取得する
     *
     * @param keyValue 設定値
     * @return 表示テキスト
     * @throws IllegalArgumentException このクラスで使用する定数でない場合
     */
    public static final String getLabel(final short keyValue) throws IllegalArgumentException { // NOPMD UnChecked

        switch (keyValue) {

            // 団体基礎情報(表紙)
            case HYOUSHI:
                return HYOUSHI_TEXT;

            // 収入項目集計表
            case SHUUKEI_SHUUNYU:
                return SHUUKEI_SHUUNYU_TEXT;

            // 機関誌の発行その他
            case KIKANSHI:
                return KIKANSHI_TEXT;

            // 借入金
            case SHAKUNYUKIN:
                return SHAKUNYUKIN_TEXT;

            // 本部または支部からの交付金
            case KOUFUKIN:
                return SHAKUNYUKIN_TEXT;

            // その他の収入
            case SHUUNYU_SONOTA:
                return SHUUNYU_SONOTA_TEXT;

            // 寄付
            case DONATE:
                return DONATE_TEXT;

            // 寄付のうちあっせんによるもの
            case DONATE_ASSEN:
                return DONATE_ASSEN_TEXT;

            // 政党匿名寄付
            case DONATE_TOKUMEI:
                return DONATE_TOKUMEI_TEXT;

            // 特定パーティー
            case TOKUTEI_PARTY:
                return TOKUTEI_PARTY_TEXT;

            // 政治資金パーティー
            case PARTY:
                return PARTY_TEXT;

            // 政治資金パーティーのうちあっせんによるもの
            case PARTY_ASSEN:
                return PARTY_ASSEN_TEXT;

            // 支出項目集計表
            case SHUUKEI_SHISHUTSU:
                return SHUUKEI_SHISHUTSU_TEXT;

            // 経常経費の内訳
            case KEIJO_KEIHI:
                return KEIJO_KEIHI_TEXT;

            // 政治活動費
            case SEIJIKATSUDOUHI:
                return SEIJIKATSUDOUHI_TEXT;

            // 本部または支部に供与した交付金
            case KOUFUKIN_SHISHUTSU:
                return KOUFUKIN_SHISHUTSU_TEXT;

            // 資産項目記載一覧
            case SHUUKEI_SHISAN:
                return SHUUKEI_SHISAN_TEXT;

            // 資産の内訳
            case ESTATE:
                return ESTATE_TEXT;

            // 不動産詳細の内訳
            case REALESTATE:
                return REALESTATE_TEXT;

            // 宣誓書
            case SENSEISHO:
                return SENSEISHO_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
