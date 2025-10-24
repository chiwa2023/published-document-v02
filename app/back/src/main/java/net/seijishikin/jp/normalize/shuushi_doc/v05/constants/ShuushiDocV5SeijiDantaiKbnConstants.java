package net.seijishikin.jp.normalize.shuushi_doc.v05.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * 政治資金収支報告書V5政治団体区分定数
 */
public final class ShuushiDocV5SeijiDantaiKbnConstants {

    /** 団体区分01:政党 */
    public static final String SEITOU = "01";
    /** 団体区分02:政党支部 */
    public static final String SEITOU_SHIBU = "02";
    /** 団体区分03:政治資金団体 */
    public static final String SHIKIN_DANTAI = "03";
    /** 団体区分04:18条2項1規定団体 */
    public static final String JOU18_2KOU_DANTAI = "04";
    /** 団体区分05:その他の政治団体 */
    public static final String SONOTA = "05";
    /** 団体区分06:その他の政治団体支部 */
    public static final String SONOTA_SHIBU = "06";

    /** 団体区分01:政党 */
    public static final String SEITOU_TEXT = "政党";
    /** 団体区分02:政党支部 */
    public static final String SEITOU_SHIBU_TEXT = "政党支部";
    /** 団体区分03:政治資金団体 */
    public static final String SHIKIN_DANTAI_TEXT = "政治資金団体";
    /** 団体区分04:18条2項1規定団体 */
    public static final String JOU18_2KOU_DANTAI_TEXT = "18条2項1規定団体";
    /** 団体区分05:その他の政治団体 */
    public static final String SONOTA_TEXT = "団体区分05:その他の政治団体";
    /** 団体区分06:その他の政治団体支部 */
    public static final String SONOTA_SHIBU_TEXT = "その他の政治団体支部";

    /** 団体区分リスト */
    private static final List<String> list = new ArrayList<>();

    private ShuushiDocV5SeijiDantaiKbnConstants() {

    }

    /**
     * 政治団体区分定数リストを取得する
     *
     * @return 政治団体区分定数リスト
     */
    public static List<String> getList() {

        if (list.isEmpty()) {
            list.add(SEITOU);
            list.add(SEITOU_SHIBU);
            list.add(SHIKIN_DANTAI);
            list.add(JOU18_2KOU_DANTAI);
            list.add(SONOTA);
            list.add(SONOTA_SHIBU);
        }

        return list;
    }

    /**
     * 表示ラベルを取得する
     *
     * @param keyValue 設定値
     * @return 表示テキスト
     * @throws IllegalArgumentException このクラスで使用する定数でない場合
     */
    public static final String getLabel(final String keyValue) throws IllegalArgumentException { // NOPMD UnChecked

        switch (keyValue) {

            case SEITOU:
                return SEITOU_TEXT;

            case SEITOU_SHIBU:
                return SEITOU_SHIBU_TEXT;

            case SHIKIN_DANTAI:
                return SHIKIN_DANTAI_TEXT;

            case JOU18_2KOU_DANTAI:
                return JOU18_2KOU_DANTAI_TEXT;

            case SONOTA:
                return SONOTA_TEXT;

            case SONOTA_SHIBU:
                return SONOTA_SHIBU_TEXT;

            default:
                throw new IllegalArgumentException("Unexpected value: " + keyValue);
        }
    }

}
