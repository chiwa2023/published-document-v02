package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5資金管理団体有無定数
 */
public final class ShuushiDocV5ShikinKanridantaiUmuConstants {

    /** 無 */
    public static final short NASHI = 0;
    /** 有 */
    public static final short ARI = 1;

    /** 無 */
    public static final String NASHI_TEXT = "無";
    /** 有 */
    public static final String ARI_TEXT = "有";

    private ShuushiDocV5ShikinKanridantaiUmuConstants() {

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

            case NASHI:
                return NASHI_TEXT;

            case ARI:
                return ARI_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
