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
 * AllSheet0802WithdrawalItemsByTransferDto単体テスト
 */
class AllSheet0802WithdrawalItemsByTransferDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception { // NOPMD

        AllSheet0802WithdrawalItemsByTransferDto allSheet0802WithdrawalItemsByTransferDto = new AllSheet0802WithdrawalItemsByTransferDto();

        Sheet080200WithdrawalItemsDto sheet1 = new Sheet080200WithdrawalItemsDto();

        sheet1.setShishutsuKoumoku("支出項目");
        sheet1.setTekiyou("摘要");
        sheet1.setDantaiName0820("団体名称");

        allSheet0802WithdrawalItemsByTransferDto.getListSheet0802().add(sheet1);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String xml0 = xmlMapper.writeValueAsString(allSheet0802WithdrawalItemsByTransferDto);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/all_sheet_0802.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0,xml0);

    }

}
