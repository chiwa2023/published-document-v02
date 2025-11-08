export class ShuushiDocV5HoujinGaishiKifuConstants {

    /** なし(空白) */
    static readonly NO_SET = "";

    /** 上場・外資50%超 */
    static readonly GAISHI_50PER = "上場・外資50%超";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: string): string {
        switch (keyValue) {
            case ShuushiDocV5HoujinGaishiKifuConstants.NO_SET:
                return "なし(空白)";
            case ShuushiDocV5HoujinGaishiKifuConstants.GAISHI_50PER:
                return "上場・外資50%超";
            default:
                return "";
        }
    }
}
