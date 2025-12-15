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
 * Row071900RealEstateUseDto単体テスト
 */
class Row071900RealEstateUseDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/balancesheet/row_071900.txt");
        String answer = Files.readString(pathAnswer);

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

        // XML生成
        String xml = xmlMapper.writeValueAsString(row0);

        // Dto名がXMLルートに入っているがワークシートで利用するときに<ROW>で上書き

        assertEquals(answer,xml);
    }

}
