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
 * RowSozei411714LocalLegislatorsDto単体テスト
 */
class RowSozei411714LocalLegislatorsDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        RowSozei411714LocalLegislatorsDto row0 = new RowSozei411714LocalLegislatorsDto();

        row0.setName("選挙立候補者");
        row0.setSenkyo("市議会議員選挙");
        row0.setAccrualDate("R4/12/1");

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/balancesheet/row_411714.txt");
        String answer = Files.readString(pathAnswer);

        // XML生成
        String xml = xmlMapper.writeValueAsString(row0);

        // Dto名がXMLルートに入っているがワークシートで利用するときに<ROW>で上書き

        assertEquals(answer,xml);

    }

}
