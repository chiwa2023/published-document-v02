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
 * Sheet080200WithdrawalItemsByTransferDto単体テスト
 */
class Sheet080200WithdrawalItemsByTransferDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        Sheet080200WithdrawalItemsByTransferDto sheet1 = new Sheet080200WithdrawalItemsByTransferDto();

        sheet1.setShishutsuKoumoku("支出項目");
        sheet1.setTekiyou("摘要");
        sheet1.setDantaiName0820("団体名称");

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // リスト存在
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/sheet_080200_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        String xml1 = xmlMapper.writeValueAsString(sheet1);

        assertEquals(answer1,xml1);

    }

}
