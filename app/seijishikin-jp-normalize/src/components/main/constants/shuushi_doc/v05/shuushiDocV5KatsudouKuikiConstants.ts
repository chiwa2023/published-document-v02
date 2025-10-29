export class ShuushiDocV5KatsudouKuikiConstants {

    /** 2以上の都道府県の区域等 */
    static readonly COMPLEX_PREF = 1;

    /** 同一の都道府県の区域内 */
    static readonly DOUITSU = 2;

    /** 2以上の都道府県の区域等 */
    static readonly COMPLEX_PREF_TEXT = "2以上の都道府県の区域等";

    /** 同一の都道府県の区域内 */
    static readonly DOUITSU_TEXT = "同一の都道府県の区域内";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {

        switch (keyValue) {
            case ShuushiDocV5KatsudouKuikiConstants.COMPLEX_PREF:
                return ShuushiDocV5KatsudouKuikiConstants.COMPLEX_PREF_TEXT;

            case ShuushiDocV5KatsudouKuikiConstants.DOUITSU:
                return ShuushiDocV5KatsudouKuikiConstants.DOUITSU_TEXT;

            default:
                return "";
        }
    }
}
