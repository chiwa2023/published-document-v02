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
 * AllBookUmuInputDataDto単体テスト
 */
class AllBookUmuInputDataDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception { // NOPMD

        AllBookUmuInputDataDto allBookUmuInputDataDto = new AllBookUmuInputDataDto();

        allBookUmuInputDataDto.setInputBitText("110010000000000000001111111111111111111111111111100");

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String xml0 = xmlMapper.writeValueAsString(allBookUmuInputDataDto);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/all_book_input_header.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0,xml0);
    }

}
