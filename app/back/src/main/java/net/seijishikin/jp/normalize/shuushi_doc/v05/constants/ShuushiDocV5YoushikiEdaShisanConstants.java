package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

/**
 * 政治資金収支報告書V5様式枝区分項目資産
 */
public final class ShuushiDocV5YoushikiEdaShisanConstants {

    /** 土地 */
    public static final String TOCHI = "ア";

    /** 建物 */
    public static final String TATEMONO = "イ";

    /** 地上権または借地権 */
    public static final String CHIJOUKEN = "ウ";

    /** 動産 */
    public static final String DOUSAN = "エ";

    /** 預金(貯金) */
    public static final String YOKIN = "オ";

    /** 金銭信託 */
    public static final String SHINTAKU = "カ";

    /** 有価証券 */
    public static final String YUUKA_SHOKEN = "キ";

    /** 出資による権利 */
    public static final String SHUSSHI = "ク";

    /** 貸付 */
    public static final String KASHITSUKE = "ケ";

    /** 敷金 */
    public static final String SHIKIKIN = "コ";

    /** 施設利用の権利 */
    public static final String SHISETSU_RIYOU = "サ";

    /** 借入金 */
    public static final String SHAKUNYUUKIN = "シ";

    /** 土地 */
    public static final String TOCHI_TEXT = "土地";

    /** 建物 */
    public static final String TATEMONO_TEXT = "建物";

    /** 地上権または借地権 */
    public static final String CHIJOUKEN_TEXT = "地上権または借地権";

    /** 動産 */
    public static final String DOUSAN_TEXT = "動産";

    /** 預金(貯金) */
    public static final String YOKIN_TEXT = "預金(貯金)";

    /** 金銭信託 */
    public static final String SHINTAKU_TEXT = "金銭信託";

    /** 有価証券 */
    public static final String YUUKA_SHOKEN_TEXT = "有価証券";

    /** 出資による権利 */
    public static final String SHUSSHI_TEXT = "出資による権利";

    /** 貸付 */
    public static final String KASHITSUKE_TEXT = "貸付";

    /** 敷金 */
    public static final String SHIKIKIN_TEXT = "敷金";

    /** 施設利用の権利 */
    public static final String SHISETSU_RIYOU_TEXT = "施設利用の権利";

    /** 借入金 */
    public static final String SHAKUNYUUKIN_TEXT = "借入金";

    private ShuushiDocV5YoushikiEdaShisanConstants() {

    }

    /**
     * 表示ラベルを取得する
     *
     * @param keyValue 設定値
     * @return 表示テキスト
     * @throws IllegalArgumentException このクラスで使用する定数でない場合
     */
    public static final String getLabel(final String keyValue) throws IllegalArgumentException { // NOPMD UnChecked

        switch (keyValue) {

            case TOCHI:
                return TOCHI_TEXT;

            case TATEMONO:
                return TATEMONO_TEXT;

            case CHIJOUKEN:
                return CHIJOUKEN_TEXT;

            case DOUSAN:
                return DOUSAN_TEXT;

            case YOKIN:
                return YOKIN_TEXT;

            case SHINTAKU:
                return SHINTAKU_TEXT;

            case YUUKA_SHOKEN:
                return YUUKA_SHOKEN_TEXT;

            case SHUSSHI:
                return SHUSSHI_TEXT;

            case KASHITSUKE:
                return KASHITSUKE_TEXT;

            case SHIKIKIN:
                return SHIKIKIN_TEXT;

            case SHISETSU_RIYOU:
                return SHISETSU_RIYOU_TEXT;

            case SHAKUNYUUKIN:
                return SHAKUNYUUKIN_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
