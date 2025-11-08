export class ShuushiDocV5KoushokuKbn {

    /** 現職 */
    static readonly GENSHOKU = 0;

    /** 候補者 */
    static readonly KOUHOSHA = 4;

    /** 現職 */
    static readonly GENSHOKU_TEXT = "現職";

    /** 候補者 */
    static readonly KOUHOSHA_TEXT = "候補者";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {
        switch (keyValue) {
            case ShuushiDocV5KoushokuKbn.GENSHOKU:
                return ShuushiDocV5KoushokuKbn.GENSHOKU_TEXT;
            case ShuushiDocV5KoushokuKbn.KOUHOSHA:
                return ShuushiDocV5KoushokuKbn.KOUHOSHA_TEXT;
            default:
                return "";
        }
    }
}
