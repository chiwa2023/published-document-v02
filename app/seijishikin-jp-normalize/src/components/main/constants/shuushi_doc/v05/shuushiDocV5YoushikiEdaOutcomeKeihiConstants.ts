export class ShuushiDocV5YoushikiEdaOutcomeKeihiConstants {

    /** 人件費 */
    static readonly JINKENHI = 1;

    /** 光熱水費 */
    static readonly KOUNETSUSUI = 2;

    /** 備品・消耗品費 */
    static readonly BIHIN_SHOUMOUHIN = 3;

    /** 事務所費 */
    static readonly JIMUSHO = 4;

    /** 人件費 */
    static readonly JINKENHI_TEXT = "人件費";

    /** 光熱水費 */
    static readonly KOUNETSUSUI_TEXT = "光熱水費";

    /** 備品・消耗品費 */
    static readonly BIHIN_SHOUMOUHIN_TEXT = "備品・消耗品費";

    /** 事務所費 */
    static readonly JIMUSHO_TEXT = "事務所費";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {

        switch (keyValue) {
            case ShuushiDocV5YoushikiEdaOutcomeKeihiConstants.JINKENHI:
                return ShuushiDocV5YoushikiEdaOutcomeKeihiConstants.JINKENHI_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeKeihiConstants.KOUNETSUSUI:
                return ShuushiDocV5YoushikiEdaOutcomeKeihiConstants.KOUNETSUSUI_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeKeihiConstants.BIHIN_SHOUMOUHIN:
                return ShuushiDocV5YoushikiEdaOutcomeKeihiConstants.BIHIN_SHOUMOUHIN_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeKeihiConstants.JIMUSHO:
                return ShuushiDocV5YoushikiEdaOutcomeKeihiConstants.JIMUSHO_TEXT;

            default:
                return "";
        }
    }

}
