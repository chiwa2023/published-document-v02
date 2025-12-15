package net.seijishikin.jp.normalize.shuushi_doc.v05.dto;

import static org.junit.Assert.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import net.seijishikin.jp.normalize.common.utils.GetCurrentResourcePath;

/**
 * Template0719SheetDto単体テスト
 */
class Template0719SheetDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // リスト0
        Template0719SheetDto sheet0 = new Template0719SheetDto();
        sheet0.setKbnRealEstitate(0);
        String xml0 = xmlMapper.writeValueAsString(sheet0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/template_0719_none.txt");
        String answer0 = Files.readString(pathAnswer0);
        assertEquals(answer0, xml0);
        
        
        // リスト存在
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/template_0719_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        Template0719SheetDto sheet1 = new Template0719SheetDto();
        sheet1.setKbnRealEstitate(0);

        // すべてにデータが入っている場合。データ欠損などは作成Logicでの対応が必要
        Row071900RealEstateUseDto row0 = new Row071900RealEstateUseDto();
        //  連番 */
        row0.setIchirenNo(1);
        //  摘要 */
        row0.setTekiyou("摘要");
        //  用途 */
        row0.setYouto("用途");
        //  使用者と代表者との関係 */
        row0.setKankeiShiyousha("使用者との関係");
        //  使用の用途 */
        row0.setShiyouYouto("使用の用途");
        //  使用面積 */
        row0.setShiyouMenseki("123.45");
        //  使用価格 */
        row0.setShiyouKakaku(4444L);

        sheet1.getList().add(row0);

        String xml1 = xmlMapper.writeValueAsString(sheet1);

        assertEquals(answer1, xml1);    
    }


}
