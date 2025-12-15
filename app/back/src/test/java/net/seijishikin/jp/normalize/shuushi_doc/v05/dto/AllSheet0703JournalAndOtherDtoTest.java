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
 * AllSheet0703JournalAndOtherDto単体テスト
 */
class AllSheet0703JournalAndOtherDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception { // NOPMD
        
        AllSheet0703JournalAndOtherDto allSheet0703JournalAndOtherDto = new AllSheet0703JournalAndOtherDto();
        
        
        Sheet070300JournalAndOtherDto sheet1 = new Sheet070300JournalAndOtherDto();

        Row070300JournalAndOtherDto row0 = new Row070300JournalAndOtherDto();
        row0.setIchirenNo(1);
        row0.setJigyoNoShurui("機関誌発行");
        row0.setKingaku(30000L);
        row0.setBikou("備考");

        sheet1.getList().add(row0);

        allSheet0703JournalAndOtherDto.setSheet070300JournalAndOtherDto(sheet1);        
        
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        
        String xml0 = xmlMapper.writeValueAsString(allSheet0703JournalAndOtherDto);
        
        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/all_sheet_0703.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0,xml0);
    }

}
