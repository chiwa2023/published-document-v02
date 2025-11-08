export class ShuushiDocV5KigyouDtKbnConstants {

    /** 企業 */
    static readonly CORP = 1;

    /** 組合 */
    static readonly UNION = 2;

    /** その他 */
    static readonly OTHER = 3;

    /** 企業 */
    static readonly CORP_TEXT = "企業";

    /** 組合 */
    static readonly UNION_TEXT = "組合";

    /** その他 */
    static readonly OTHER_TEXT = "その他";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {

        switch (keyValue) {
            case ShuushiDocV5KigyouDtKbnConstants.CORP:
                return ShuushiDocV5KigyouDtKbnConstants.CORP_TEXT;

            case ShuushiDocV5KigyouDtKbnConstants.UNION:
                return ShuushiDocV5KigyouDtKbnConstants.UNION_TEXT;

            case ShuushiDocV5KigyouDtKbnConstants.OTHER:
                return ShuushiDocV5KigyouDtKbnConstants.OTHER_TEXT;

            default:
                return "";
        }
    }
}
