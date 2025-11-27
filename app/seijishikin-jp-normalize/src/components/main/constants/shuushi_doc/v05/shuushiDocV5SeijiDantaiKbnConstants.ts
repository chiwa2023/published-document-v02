export class ShuushiDocV5SeijiDantaiKbnConstants {

    /** 団体区分01:政党 */
    static readonly SEITOU = "01";
    /** 団体区分02:政党支部 */
    static readonly SEITOU_SHIBU = "02";
    /** 団体区分03:政治資金団体 */
    static readonly SHIKIN_DANTAI = "03";
    /** 団体区分04:18条2項1規定団体 */
    static readonly JOU18_2KOU_DANTAI = "04";
    /** 団体区分05:その他の政治団体 */
    static readonly SONOTA = "05";
    /** 団体区分06:その他の政治団体支部 */
    static readonly SONOTA_SHIBU = "06";

    /** 団体区分01:政党 */
    static readonly SEITOU_TEXT = "政党";
    /** 団体区分02:政党支部 */
    static readonly SEITOU_SHIBU_TEXT = "政党支部";
    /** 団体区分03:政治資金団体 */
    static readonly SHIKIN_DANTAI_TEXT = "政治資金団体";
    /** 団体区分04:18条2項1規定団体 */
    static readonly JOU18_2KOU_DANTAI_TEXT = "18条2項1規定団体";
    /** 団体区分05:その他の政治団体 */
    static readonly SONOTA_TEXT = "団体区分05:その他の政治団体";
    /** 団体区分06:その他の政治団体支部 */
    static readonly SONOTA_SHIBU_TEXT = "その他の政治団体支部";

    /** 団体区分リスト */
    static readonly list = [
        ShuushiDocV5SeijiDantaiKbnConstants.SEITOU,
        ShuushiDocV5SeijiDantaiKbnConstants.SEITOU_SHIBU,
        ShuushiDocV5SeijiDantaiKbnConstants.SHIKIN_DANTAI,
        ShuushiDocV5SeijiDantaiKbnConstants.JOU18_2KOU_DANTAI,
        ShuushiDocV5SeijiDantaiKbnConstants.SONOTA,
        ShuushiDocV5SeijiDantaiKbnConstants.SONOTA_SHIBU,
    ];

    /**
     * 表示ラベルを取得する
     *
     * @param keyValue 設定値
     * @return 表示テキスト
     */
    public static getLabel(keyValue: string): string {

        switch (keyValue) {

            case ShuushiDocV5SeijiDantaiKbnConstants.SEITOU:
                return ShuushiDocV5SeijiDantaiKbnConstants.SEITOU_TEXT;

            case ShuushiDocV5SeijiDantaiKbnConstants.SEITOU_SHIBU:
                return ShuushiDocV5SeijiDantaiKbnConstants.SEITOU_SHIBU_TEXT;

            case ShuushiDocV5SeijiDantaiKbnConstants.SHIKIN_DANTAI:
                return ShuushiDocV5SeijiDantaiKbnConstants.SHIKIN_DANTAI_TEXT;

            case ShuushiDocV5SeijiDantaiKbnConstants.JOU18_2KOU_DANTAI:
                return ShuushiDocV5SeijiDantaiKbnConstants.JOU18_2KOU_DANTAI_TEXT;

            case ShuushiDocV5SeijiDantaiKbnConstants.SONOTA:
                return ShuushiDocV5SeijiDantaiKbnConstants.SONOTA_TEXT;

            case ShuushiDocV5SeijiDantaiKbnConstants.SONOTA_SHIBU:
                return ShuushiDocV5SeijiDantaiKbnConstants.SONOTA_SHIBU_TEXT;

            default:
                return "";
        }
    }
}
