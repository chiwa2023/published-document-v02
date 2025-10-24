package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5寄付控除定数
 */
public final class ShuushiDocV5KifukinKoujoConstants {

    /** なし(空白) */
    public static final short NO_SET = 0;

    /** 寄附金(税額)控除 */
    public static final short ZEIGAKU_KOUJO = 1;

    /** なし(空白) */
    public static final String NO_SET_TEXT = "";

    /** 寄附金(税額)控除 */
    public static final String ZEIGAKU_KOUJO_TEXT = "寄附金(税額)控除";

    private ShuushiDocV5KifukinKoujoConstants() {

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

            case NO_SET:
                return NO_SET_TEXT;

            case ZEIGAKU_KOUJO:
                return ZEIGAKU_KOUJO_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
