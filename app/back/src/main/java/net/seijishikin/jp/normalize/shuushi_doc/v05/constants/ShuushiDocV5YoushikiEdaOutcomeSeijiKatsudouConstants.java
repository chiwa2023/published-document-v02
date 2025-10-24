package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5様式枝区分項目支出政治活動
 */
public final class ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants {

    /** 組織活動費 */
    public static final short SOSHIKI_KATSUDOU = 1;

    /** 選挙関係費 */
    public static final short SENKYO_KANKEI = 2;

    /** 機関紙発行事業費 */
    public static final short KIKANSHI_HAKKOU = 3;

    /** 宣伝事業費 */
    public static final short SENDEN = 4;

    /** 政治資金パーティー開催事業費 */
    public static final short PARTY_KAISAI = 5;

    /** その他の事業費 */
    public static final short OTHER_JIGYOU = 6;

    /** 調査研究費 */
    public static final short CHOUSA_KENKYU = 7;

    /** 寄付交付金 */
    public static final short KIFU_KOUFUKIN = 8;

    /** その他の経費 */
    public static final short SONOTA_KEIHI = 9;

    /** 組織活動費 */
    public static final String SOSHIKI_KATSUDOU_TEXT = "組織活動費";

    /** 選挙関係費 */
    public static final String SENKYO_KANKEI_TEXT = "選挙関係費";

    /** 機関紙発行事業費 */
    public static final String KIKANSHI_HAKKOU_TEXT = "機関紙発行事業費";

    /** 宣伝事業費 */
    public static final String SENDEN_TEXT = "宣伝事業費";

    /** 政治資金パーティー開催事業費 */
    public static final String PARTY_KAISAI_TEXT = "政治資金パーティー開催事業費";

    /** その他の事業費 */
    public static final String OTHER_JIGYOU_TEXT = "その他の事業費";

    /** 調査研究費 */
    public static final String CHOUSA_KENKYU_TEXT = "調査研究費";

    /** 寄付交付金 */
    public static final String KIFU_KOUFUKIN_TEXT = "寄付交付金";

    /** その他の経費 */
    public static final String SONOTA_KEIHI_TEXT = "その他の経費";

    private ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants() {

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

            // 組織活動費 */
            case SOSHIKI_KATSUDOU:
                return SOSHIKI_KATSUDOU_TEXT;

            // 選挙関係費 */
            case SENKYO_KANKEI:
                return SENKYO_KANKEI_TEXT;

            // 機関紙発行事業費 */
            case KIKANSHI_HAKKOU:
                return KIKANSHI_HAKKOU_TEXT;

            // 宣伝事業費 */
            case SENDEN:
                return SENDEN_TEXT;

            // 政治資金パーティー開催事業費 */
            case PARTY_KAISAI:
                return PARTY_KAISAI_TEXT;

            // その他の事業費 */
            case OTHER_JIGYOU:
                return OTHER_JIGYOU_TEXT;

            // 調査研究費 */
            case CHOUSA_KENKYU:
                return CHOUSA_KENKYU_TEXT;

            // 寄付交付金 */
            case KIFU_KOUFUKIN:
                return KIFU_KOUFUKIN_TEXT;

            // その他の経費 */
            case SONOTA_KEIHI:
                return SONOTA_KEIHI_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
