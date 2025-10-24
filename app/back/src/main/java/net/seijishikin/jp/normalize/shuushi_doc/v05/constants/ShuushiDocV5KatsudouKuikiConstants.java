package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5活動区域定数
 */
public final class ShuushiDocV5KatsudouKuikiConstants {

    /** 2以上の都道府県の区域等 */
    public static final short COMPLEX_PREF = 1;

    /** 同一の都道府県の区域内 */
    public static final short DOUITSU = 2;

    /** 2以上の都道府県の区域等 */
    public static final String COMPLEX_PREF_TEXT = "2以上の都道府県の区域等";

    /** 同一の都道府県の区域内 */
    public static final String DOUITSU_TEXT = "同一の都道府県の区域内";

    /**
     * コンストラクタ
     */
    private ShuushiDocV5KatsudouKuikiConstants() {
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
            case COMPLEX_PREF:
                return COMPLEX_PREF_TEXT;

            // 同一の都道府県の区域内
            case DOUITSU:
                return DOUITSU_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }
}
