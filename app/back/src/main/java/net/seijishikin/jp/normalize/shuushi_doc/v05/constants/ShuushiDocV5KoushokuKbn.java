package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5公職区分定数
 */
public final class ShuushiDocV5KoushokuKbn {

    /** 現職 */
    public static final short GENSHOKU = 0;

    /** 候補者 */
    public static final short KOUHOSHA = 4;

    /** 現職 */
    public static final String GENSHOKU_TEXT = "現職";

    /** 候補者 */
    public static final String KOUHOSHA_TEXT = "候補者";

    private ShuushiDocV5KoushokuKbn() {

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

            case GENSHOKU:
                return GENSHOKU_TEXT;

            case KOUHOSHA:
                return KOUHOSHA_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
