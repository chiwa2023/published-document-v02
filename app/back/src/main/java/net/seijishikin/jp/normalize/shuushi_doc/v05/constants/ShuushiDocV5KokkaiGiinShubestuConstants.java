package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5国会議員種別定数
 */
public final class ShuushiDocV5KokkaiGiinShubestuConstants {

    /** 衆議院 */
    public static final short SHUUGIIN = 1;

    /** 参議院 */
    public static final short SANGIIN = 2;

    /** 衆議院 */
    public static final String SHUUGIIN_TEXT = "衆議院";

    /** 参議院 */
    public static final String SANGIIN_TEXT = "参議院";

    private ShuushiDocV5KokkaiGiinShubestuConstants() {

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

            case SHUUGIIN:
                return SHUUGIIN_TEXT;

            case SANGIIN:
                return SANGIIN_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
