package net.seijishikin.jp.normalize.shuushi_doc.v05.dto;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import net.seijishikin.jp.normalize.common.utils.GetCurrentResourcePath;

/**
 * Sheet071801LandAmongAssetsDto単体テスト
 */
class Sheet071801LandAmongAssetsDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // リスト0
        Sheet071801LandAmongAssetsDto sheet0 = new Sheet071801LandAmongAssetsDto();
        String xml0 = xmlMapper.writeValueAsString(sheet0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/sheet_071801_none.txt");
        String answer0 = Files.readString(pathAnswer0);
        
        assertEquals(answer0,xml0);

        // リスト存在
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/sheet_071801_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        Sheet071801LandAmongAssetsDto sheet1 = new Sheet071801LandAmongAssetsDto();

        // すべてにデータが入っている場合。データ欠損などは作成Logicでの対応が必要
        Row071800ClassificationAssetsDto row0 = new Row071800ClassificationAssetsDto();
        //  連番 */
        row0.setIchirenNo(1);
        //  摘要 */
        row0.setTekiyou("摘要");
        //  金額 */
        row0.setKingaku(30000L);
        //  発生日 */
        row0.setAccrualDate("R4/12/1");
        //  備考 */
        row0.setBiko("備考");

        sheet1.getList().add(row0);

        String xml1 = xmlMapper.writeValueAsString(sheet1);

        assertEquals(answer1,xml1);
    }

}
