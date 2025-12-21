export class ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants {

    /** 組織活動費 */
    static readonly SOSHIKI_KATSUDOU = 1;

    /** 選挙関係費 */
    static readonly SENKYO_KANKEI = 2;

    /** 機関紙発行事業費 */
    static readonly KIKANSHI_HAKKOU = 3;

    /** 宣伝事業費 */
    static readonly SENDEN = 4;

    /** 政治資金パーティー開催事業費 */
    static readonly PARTY_KAISAI = 5;

    /** その他の事業費 */
    static readonly OTHER_JIGYOU = 6;

    /** 調査研究費 */
    static readonly CHOUSA_KENKYU = 7;

    /** 寄付交付金 */
    static readonly KIFU_KOUFUKIN = 8;

    /** その他の経費 */
    static readonly SONOTA_KEIHI = 9;

    /** 組織活動費 */
    static readonly SOSHIKI_KATSUDOU_TEXT = "組織活動費";

    /** 選挙関係費 */
    static readonly SENKYO_KANKEI_TEXT = "選挙関係費";

    /** 機関紙発行事業費 */
    static readonly KIKANSHI_HAKKOU_TEXT = "機関紙発行事業費";

    /** 宣伝事業費 */
    static readonly SENDEN_TEXT = "宣伝事業費";

    /** 政治資金パーティー開催事業費 */
    static readonly PARTY_KAISAI_TEXT = "政治資金パーティー開催事業費";

    /** その他の事業費 */
    static readonly OTHER_JIGYOU_TEXT = "その他の事業費";

    /** 調査研究費 */
    static readonly CHOUSA_KENKYU_TEXT = "調査研究費";

    /** 寄付交付金 */
    static readonly KIFU_KOUFUKIN_TEXT = "寄付交付金";

    /** その他の経費 */
    static readonly SONOTA_KEIHI_TEXT = "その他の経費";

    /**
     * 値に該当するラベルを作成する
     * @param keyValue 値
     * @returns ラベル
     */
    public static getLabel(keyValue: number): string {

        switch (keyValue) {
            case ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.SOSHIKI_KATSUDOU:
                return ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.SOSHIKI_KATSUDOU_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.SENKYO_KANKEI:
                return ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.SENKYO_KANKEI_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.KIKANSHI_HAKKOU:
                return ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.KIKANSHI_HAKKOU_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.SENDEN:
                return ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.SENDEN_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.PARTY_KAISAI:
                return ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.PARTY_KAISAI_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.OTHER_JIGYOU:
                return ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.OTHER_JIGYOU_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.CHOUSA_KENKYU:
                return ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.CHOUSA_KENKYU_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.KIFU_KOUFUKIN:
                return ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.KIFU_KOUFUKIN_TEXT;

            case ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.SONOTA_KEIHI:
                return ShuushiDocV5YoushikiEdaOutcomeSeijiKatsudouConstants.SONOTA_KEIHI_TEXT;

            default:
                return "";
        }
    }

}
