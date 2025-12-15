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
 * Sheet071000SpecificPartyDto単体テスト
 */
class Sheet071000SpecificPartyDtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception {

        XmlMapper xmlMapper = new XmlMapper();
       xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // リスト0
        Sheet071000SpecificPartyDto sheet0 = new Sheet071000SpecificPartyDto();
        sheet0.setPageTotal(30000L);
        String xml0 = xmlMapper.writeValueAsString(sheet0);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/sheet_071000_none.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0,xml0);

        // リスト存在
        Path pathAnswer1 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/sheet_071000_list.txt");
        String answer1 = Files.readString(pathAnswer1);

        Sheet071000SpecificPartyDto sheet1 = new Sheet071000SpecificPartyDto();
        sheet1.setPageTotal(30000L);

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
        

        sheet1.getList().add(row0);

        String xml1 = xmlMapper.writeValueAsString(sheet1);

        assertEquals(answer1,xml1);
    }

}
