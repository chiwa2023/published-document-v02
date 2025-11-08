export class ShuushiDocV5KokkaiGiinShubestuConstants {

    /** 衆議院 */
    static readonly SHUUGIIN = 1;

    /** 参議院 */
    static readonly SANGIIN = 2;

    /** 衆議院 */
    static readonly SHUUGIIN_TEXT = "衆議院";

    /** 参議院 */
    static readonly SANGIIN_TEXT = "参議院";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {

        switch (keyValue) {
            case ShuushiDocV5KokkaiGiinShubestuConstants.SHUUGIIN:
                return ShuushiDocV5KokkaiGiinShubestuConstants.SHUUGIIN_TEXT;

            case ShuushiDocV5KokkaiGiinShubestuConstants.SANGIIN:
                return ShuushiDocV5KokkaiGiinShubestuConstants.SANGIIN_TEXT;

            default:
                return "";
        }
    }
}
