export class ShuushiDocV5KifukinKoujoConstants {

    /** なし(空白) */
    static readonly NO_SET = 0;

    /** 寄附金(税額)控除 */
    static readonly ZEIGAKU_KOUJO = 1;

    /** なし(空白) */
    static readonly NO_SET_TEXT = "";

    /** 寄附金(税額)控除 */
    static readonly ZEIGAKU_KOUJO_TEXT = "寄附金(税額)控除";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {

        switch (keyValue) {
            case ShuushiDocV5KifukinKoujoConstants.NO_SET:
                return ShuushiDocV5KifukinKoujoConstants.NO_SET_TEXT;

            case ShuushiDocV5KifukinKoujoConstants.ZEIGAKU_KOUJO:
                return ShuushiDocV5KifukinKoujoConstants.ZEIGAKU_KOUJO_TEXT;

            default:
                return "";
        }
    }
}
