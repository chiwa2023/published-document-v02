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
 * Row071000SpecificPartyDto単体テスト
 */
class Row071000SpecificPartyDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml()throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT); 

        Path pathAnswer = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(), "dto/publish/balancesheet/row_071000.txt");
        String answer = Files.readString(pathAnswer);
        
        //すべてにデータが入っている場合。データ欠損などは作成Logicでの対応が必要
        Row071000SpecificPartyDto row0 = new Row071000SpecificPartyDto();
       
        ///** 連番 */
        row0.setIchirenNo(1);
        ///** パーティ名称 */
        row0.setPartyName("パーティ名称");
        ///** 金額 */
        row0.setKingaku(30000L);
        ///** 支払い数 */
        row0.setShiharaisu(3);
        ///** 開催日 */
        row0.setAccrualDate("R4/2/2");
        ///** 開催場所 */
        row0.setKaisaiBasho("開催場所");
        ///** 備考 */
        row0.setBikou("備考");
        
        //XML生成
        String xml = xmlMapper.writeValueAsString(row0);
        
        //Dto名がXMLルートに入っているがワークシートで利用するときに<ROW>で上書き
        assertEquals(answer,xml);
    }

}
