package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5交付金に係る支出定数
 */
public final class ShuushiDocV5KoufukinShishutsuConstants {

    /** なし(空白) */
    public static final short NO_SET = 0;

    /** (交)* */
    public static final short KOUFUKIN = 1;

    /** なし(空白) */
    public static final String NO_SET_TEXT = "";

    /** (交)* */
    public static final String KOUFUKIN_TEXT = "(交)*";

    private ShuushiDocV5KoufukinShishutsuConstants() {

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

            // 2以上の都道府県の区域等
            case NO_SET:
                return NO_SET_TEXT;

            // 同一の都道府県の区域内
            case KOUFUKIN:
                return KOUFUKIN_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }
}
