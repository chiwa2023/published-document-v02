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
 * AllSheetKbn071812Dto
 */
class AllSheetKbn071812DtoTest {
    // CHECKSTYLE:OFF MagicNumber

    @Test
    void testConvretXml() throws Exception { // NOPMD

        AllSheetKbn071812Dto allSheetKbn071812Dto = new AllSheetKbn071812Dto();

        Sheet071812BorrowingsAmongAssetsDto sheet1 = new Sheet071812BorrowingsAmongAssetsDto();

        // すべてにデータが入っている場合。データ欠損などは作成Logicでの対応が必要
        Row071800ClassificationAssetsDto row0 = new Row071800ClassificationAssetsDto();
        //  連番 */
        row0.setIchirenNo(1);
        //  摘要 */
        row0.setTekiyou("摘要");
        //  金額 */
        row0.setKingaku(30000L);
        //  発生日 */
        row0.setAccrualDate("R4/12/1");
        //  備考 */
        row0.setBiko("備考");

        sheet1.getList().add(row0);

        allSheetKbn071812Dto.setSheet071812BorrowingsAmongAssetsDto(sheet1);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String xml0 = xmlMapper.writeValueAsString(allSheetKbn071812Dto);

        Path pathAnswer0 = Paths.get(GetCurrentResourcePath.getBackTestResourcePath(),
                "dto/publish/balancesheet/kbn_071812_list.txt");
        String answer0 = Files.readString(pathAnswer0);

        assertEquals(answer0,xml0);

    }

}
