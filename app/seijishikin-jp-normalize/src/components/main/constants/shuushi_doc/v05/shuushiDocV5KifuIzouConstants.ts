export class ShuushiDocV5KifuIzouConstants {

    /** なし(空白) */
    static readonly NO_SET = "";

    /** 遺贈 */
    static readonly IZOU = "遺贈";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: string): string {
        switch (keyValue) {
            case ShuushiDocV5KifuIzouConstants.NO_SET:
                return "なし(空白)";
            case ShuushiDocV5KifuIzouConstants.IZOU:
                return "遺贈";
            default:
                return "";
        }
    }
}
