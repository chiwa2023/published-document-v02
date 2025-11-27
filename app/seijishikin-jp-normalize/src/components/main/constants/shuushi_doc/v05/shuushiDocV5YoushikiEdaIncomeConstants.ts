export class ShuushiDocV5YoushikiEdaIncomeConstants {

    /** 未設定 */
    static readonly NO_SET = 0;

    /** 個人 */
    static readonly PERSON = 1;

    /** 企業・団体 */
    static readonly KIGYOU_DT = 2;

    /** 政治団体 */
    static readonly SEIJI_DANTAI = 3;

    /** 未設定 */
    static readonly NO_SET_TEXT = "";

    /** 個人 */
    static readonly PERSON_TEXT = "個人";

    /** 企業・団体 */
    static readonly KIGYOU_DT_TEXT = "企業・団体";

    /** 政治団体 */
    static readonly SEIJI_DANTAI_TEXT = "政治団体";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {

        switch (keyValue) {
            case ShuushiDocV5YoushikiEdaIncomeConstants.NO_SET:
                return ShuushiDocV5YoushikiEdaIncomeConstants.NO_SET_TEXT;

            case ShuushiDocV5YoushikiEdaIncomeConstants.PERSON:
                return ShuushiDocV5YoushikiEdaIncomeConstants.PERSON_TEXT;

            case ShuushiDocV5YoushikiEdaIncomeConstants.KIGYOU_DT:
                return ShuushiDocV5YoushikiEdaIncomeConstants.KIGYOU_DT_TEXT;

            case ShuushiDocV5YoushikiEdaIncomeConstants.SEIJI_DANTAI:
                return ShuushiDocV5YoushikiEdaIncomeConstants.SEIJI_DANTAI_TEXT;

            default:
                return "";
        }
    }
}
