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
 * AllBookHeaderDto単体テスト
 */
class AllBookHeaderDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception { // NOPMD

        AllBookHeaderDto allBookHeaderDto = new AllBookHeaderDto();

        allBookHeaderDto.setVersion("20191220");
        allBookHeaderDto.setAppName("収支報告書作成ソフト〔収支報告書作成ソフト〕");
        allBookHeaderDto.setFileFormatNo("1");
        allBookHeaderDto.setFlgKokuji("0");
        allBookHeaderDto.setChouboAppVer("20150701");

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String xml0 = xmlMapper.writeValueAsString(allBookHeaderDto);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/all_book_header.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0,xml0);
    }

}
