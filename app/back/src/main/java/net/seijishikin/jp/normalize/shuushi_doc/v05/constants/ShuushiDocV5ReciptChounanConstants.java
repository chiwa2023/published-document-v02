package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5領収書を徴しがたかったもの(徴難)定数
 */
public final class ShuushiDocV5ReciptChounanConstants {

    /** なし(空白) */
    public static final short NO_SET = 0;

    /** 振込明細書に係る支出目的書を作成する */
    public static final short MOKUTEKISHO = 1;

    /** 領収書を徴しがたかった支出の明細書を作成する */
    public static final short CHOUNAN_MEISAI = 2;

    /** なし(空白) */
    public static final String NO_SET_TEXT = "";

    /** 振込明細書に係る支出目的書を作成する */
    public static final String MOKUTEKISHO_TEXT = "支出目的書";

    /** 領収書を徴しがたかった支出の明細書を作成する */
    public static final String CHOUNAN_MEISAI_TEXT = "領収書を徴しがたかった支出の明細書";

    private ShuushiDocV5ReciptChounanConstants() {

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

            case MOKUTEKISHO:
                return MOKUTEKISHO_TEXT;

            case CHOUNAN_MEISAI:
                return CHOUNAN_MEISAI_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
