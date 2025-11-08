export class ShuushiDocV5KoufukinShishutsuConstants {

    /** なし(空白) */
    static readonly NO_SET = 0;

    /** (交)* */
    static readonly KOUFUKIN = 1;

    /** なし(空白) */
    static readonly NO_SET_TEXT = "";

    /** (交)* */
    static readonly KOUFUKIN_TEXT = "(交)*";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {
        switch (keyValue) {
            case ShuushiDocV5KoufukinShishutsuConstants.NO_SET:
                return ShuushiDocV5KoufukinShishutsuConstants.NO_SET_TEXT;
            case ShuushiDocV5KoufukinShishutsuConstants.KOUFUKIN:
                return ShuushiDocV5KoufukinShishutsuConstants.KOUFUKIN_TEXT;
            default:
                return "";
        }
    }
}
