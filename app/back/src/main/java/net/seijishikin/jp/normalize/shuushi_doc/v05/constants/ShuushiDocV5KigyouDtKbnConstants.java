package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 企業団体献金上限確定用団体種類定数
 */
public final class ShuushiDocV5KigyouDtKbnConstants {

    /** 企業 */
    public static final short CORP = 1;

    /** 組合 */
    public static final short UNION = 2;

    /** その他 */
    public static final short OTHER = 3;

    /** 企業 */
    public static final String CORP_TEXT = "企業";

    /** 組合 */
    public static final String UNION_TEXT = "組合";

    /** その他 */
    public static final String OTHER_TEXT = "その他";

    private ShuushiDocV5KigyouDtKbnConstants() {

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

            case CORP:
                return CORP_TEXT;

            case UNION:
                return UNION_TEXT;

            case OTHER:
                return OTHER_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
