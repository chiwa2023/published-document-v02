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
 * RowJournalAndOthrt0703Dto単体テスト
 */
class Row070300JournalAndOtherDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/row_070300.txt");
        String answer = Files.readString(pathAnswer);

        // すべてにデータが入っている場合。データ欠損などは作成Logicでの対応が必要
        Row070300JournalAndOtherDto row0 = new Row070300JournalAndOtherDto();
        row0.setIchirenNo(1);
        row0.setJigyoNoShurui("機関誌発行");
        row0.setKingaku(30000L);
        row0.setBikou("備考");

        // XML生成
        String xml = xmlMapper.writeValueAsString(row0);

        // Dto名がXMLルートに入っているがワークシートで利用するときに<ROW>で上書き

        assertEquals(answer, xml);
    }

}
