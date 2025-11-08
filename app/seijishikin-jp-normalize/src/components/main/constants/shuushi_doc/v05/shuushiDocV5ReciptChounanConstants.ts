export class ShuushiDocV5ReciptChounanConstants {

    /** なし(空白) */
    static readonly NO_SET = 0;

    /** 振込明細書に係る支出目的書を作成する */
    static readonly MOKUTEKISHO = 1;

    /** 領収書を徴しがたかった支出の明細書を作成する */
    static readonly CHOUNAN_MEISAI = 2;

    /** なし(空白) */
    static readonly NO_SET_TEXT = "";

    /** 振込明細書に係る支出目的書を作成する */
    static readonly MOKUTEKISHO_TEXT = "支出目的書";

    /** 領収書を徴しがたかった支出の明細書を作成する */
    static readonly CHOUNAN_MEISAI_TEXT = "領収書を徴しがたかった支出の明細書";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {
        switch (keyValue) {
            case ShuushiDocV5ReciptChounanConstants.NO_SET:
                return ShuushiDocV5ReciptChounanConstants.NO_SET_TEXT;
            case ShuushiDocV5ReciptChounanConstants.MOKUTEKISHO:
                return ShuushiDocV5ReciptChounanConstants.MOKUTEKISHO_TEXT;
            case ShuushiDocV5ReciptChounanConstants.CHOUNAN_MEISAI:
                return ShuushiDocV5ReciptChounanConstants.CHOUNAN_MEISAI_TEXT;
            default:
                return "";
        }
    }
}
