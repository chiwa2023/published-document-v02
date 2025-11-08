export class ShuushiDocV5ShikinKanridantaiUmuConstants {

    /** 無 */
    static readonly NASHI = 0;
    /** 有 */
    static readonly ARI = 1;

    /** 無 */
    static readonly NASHI_TEXT = "無";
    /** 有 */
    static readonly ARI_TEXT = "有";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {

        switch (keyValue) {
            case ShuushiDocV5ShikinKanridantaiUmuConstants.NASHI:
                return ShuushiDocV5ShikinKanridantaiUmuConstants.NASHI_TEXT;

            case ShuushiDocV5ShikinKanridantaiUmuConstants.ARI:
                return ShuushiDocV5ShikinKanridantaiUmuConstants.ARI_TEXT;

            default:
                return "";
        }
    }
}
