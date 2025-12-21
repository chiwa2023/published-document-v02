export class ShuushiDocV5YoushikiEdaShisanConstants {

    /** 土地 */
    static readonly TOCHI = "ア";

    /** 建物 */
    static readonly TATEMONO = "イ";

    /** 地上権または借地権 */
    static readonly CHIJOUKEN = "ウ";

    /** 動産 */
    static readonly DOUSAN = "エ";

    /** 預金(貯金) */
    static readonly YOKIN = "オ";

    /** 金銭信託 */
    static readonly SHINTAKU = "カ";

    /** 有価証券 */
    static readonly YUUKA_SHOKEN = "キ";

    /** 出資による権利 */
    static readonly SHUSSHI = "ク";

    /** 貸付 */
    static readonly KASHITSUKE = "ケ";

    /** 敷金 */
    static readonly SHIKIKIN = "コ";

    /** 施設利用の権利 */
    static readonly SHISETSU_RIYOU = "サ";

    /** 借入金 */
    static readonly SHAKUNYUUKIN = "シ";

    /** 土地 */
    static readonly TOCHI_TEXT = "土地";

    /** 建物 */
    static readonly TATEMONO_TEXT = "建物";

    /** 地上権または借地権 */
    static readonly CHIJOUKEN_TEXT = "地上権または借地権";

    /** 動産 */
    static readonly DOUSAN_TEXT = "動産";

    /** 預金(貯金) */
    static readonly YOKIN_TEXT = "預金(貯金)";

    /** 金銭信託 */
    static readonly SHINTAKU_TEXT = "金銭信託";

    /** 有価証券 */
    static readonly YUUKA_SHOKEN_TEXT = "有価証券";

    /** 出資による権利 */
    static readonly SHUSSHI_TEXT = "出資による権利";

    /** 貸付 */
    static readonly KASHITSUKE_TEXT = "貸付";

    /** 敷金 */
    static readonly SHIKIKIN_TEXT = "敷金";

    /** 施設利用の権利 */
    static readonly SHISETSU_RIYOU_TEXT = "施設利用の権利";

    /** 借入金 */
    static readonly SHAKUNYUUKIN_TEXT = "借入金";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: string): string {

        switch (keyValue) {
            case ShuushiDocV5YoushikiEdaShisanConstants.TOCHI:
                return ShuushiDocV5YoushikiEdaShisanConstants.TOCHI_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.TATEMONO:
                return ShuushiDocV5YoushikiEdaShisanConstants.TATEMONO_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.CHIJOUKEN:
                return ShuushiDocV5YoushikiEdaShisanConstants.CHIJOUKEN_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.DOUSAN:
                return ShuushiDocV5YoushikiEdaShisanConstants.DOUSAN_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.YOKIN:
                return ShuushiDocV5YoushikiEdaShisanConstants.YOKIN_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.SHINTAKU:
                return ShuushiDocV5YoushikiEdaShisanConstants.SHINTAKU_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.YUUKA_SHOKEN:
                return ShuushiDocV5YoushikiEdaShisanConstants.YUUKA_SHOKEN_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.SHUSSHI:
                return ShuushiDocV5YoushikiEdaShisanConstants.SHUSSHI_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.KASHITSUKE:
                return ShuushiDocV5YoushikiEdaShisanConstants.KASHITSUKE_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.SHIKIKIN:
                return ShuushiDocV5YoushikiEdaShisanConstants.SHIKIKIN_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.SHISETSU_RIYOU:
                return ShuushiDocV5YoushikiEdaShisanConstants.SHISETSU_RIYOU_TEXT;

            case ShuushiDocV5YoushikiEdaShisanConstants.SHAKUNYUUKIN:
                return ShuushiDocV5YoushikiEdaShisanConstants.SHAKUNYUUKIN_TEXT;

            default:
                return "";
        }
    }

}
