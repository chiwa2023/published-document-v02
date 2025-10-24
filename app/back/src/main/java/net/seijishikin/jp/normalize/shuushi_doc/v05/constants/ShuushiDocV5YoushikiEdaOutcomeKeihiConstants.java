package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5様式枝区分項目支出経費
 */
public final class ShuushiDocV5YoushikiEdaOutcomeKeihiConstants {

    /** 人件費 */
    public static final short JINKENHI = 1;

    /** 光熱水費 */
    public static final short KOUNETSUSUI = 2;

    /** 備品・消耗品費 */
    public static final short BIHIN_SHOUMOUHIN = 3;

    /** 事務所費 */
    public static final short JIMUSHO = 4;

    /** 人件費 */
    public static final String JINKENHI_TEXT = "人件費";

    /** 光熱水費 */
    public static final String KOUNETSUSUI_TEXT = "光熱水費";

    /** 備品・消耗品費 */
    public static final String BIHIN_SHOUMOUHIN_TEXT = "備品・消耗品費";

    /** 事務所費 */
    public static final String JIMUSHO_TEXT = "事務所費";

    private ShuushiDocV5YoushikiEdaOutcomeKeihiConstants() {

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

            case JINKENHI:
                return JINKENHI_TEXT;

            case KOUNETSUSUI:
                return KOUNETSUSUI_TEXT;

            case BIHIN_SHOUMOUHIN:
                return BIHIN_SHOUMOUHIN_TEXT;

            case JIMUSHO:
                return JIMUSHO_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
