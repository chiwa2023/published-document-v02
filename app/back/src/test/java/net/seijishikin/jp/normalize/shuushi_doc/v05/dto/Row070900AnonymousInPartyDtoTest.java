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
 * Row070900AnonymousIPartyDto単体テスト
 */
class Row070900AnonymousInPartyDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml()throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT); 

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/balancesheet/row_070900.txt");
        String answer = Files.readString(pathAnswer);
        
        //すべてにデータが入っている場合。データ欠損などは作成Logicでの対応が必要
        Row070900AnonymousIPartyDto row0 = new Row070900AnonymousIPartyDto();
        
        ///** 連番 */
        row0.setIchirenNo(1);
        ///** 場所 */
        row0.setBasho("開催場所");
        ///** 金額 */
        row0.setKingaku(30000L);
        ///** 発生日 */
        row0.setAccrualDate("R4/3/1");
        ///** 備考 */
        row0.setBikou("備考");
        
        //XML生成
        String xml = xmlMapper.writeValueAsString(row0);
        
        //Dto名がXMLルートに入っているがワークシートで利用するときに<ROW>で上書き

        assertEquals(answer,xml);
    }

}
