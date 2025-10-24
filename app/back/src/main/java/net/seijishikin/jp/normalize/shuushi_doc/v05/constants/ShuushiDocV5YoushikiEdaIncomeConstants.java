package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5様式枝区分項目収入
 */
public final class ShuushiDocV5YoushikiEdaIncomeConstants {

    /** 未設定 */
    public static final short NO_SET = 0;

    /** 個人 */
    public static final short PERSON = 1;

    /** 企業・団体 */
    public static final short KIGYOU_DT = 2;

    /** 政治団体 */
    public static final short SEIJI_DANTAI = 3;

    /** 未設定 */
    public static final String NO_SET_TEXT = "";

    /** 個人 */
    public static final String PERSON_TEXT = "個人";

    /** 企業・団体 */
    public static final String KIGYOU_DT_TEXT = "企業・団体";

    /** 政治団体 */
    public static final String SEIJI_DANTAI_TEXT = "政治団体";

    private ShuushiDocV5YoushikiEdaIncomeConstants() {

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

            case PERSON:
                return PERSON_TEXT;

            case KIGYOU_DT:
                return KIGYOU_DT_TEXT;

            case SEIJI_DANTAI:
                return SEIJI_DANTAI_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
