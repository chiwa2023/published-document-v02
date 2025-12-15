package net.seijishikin.jp.normalize.common.utils;

import static org.junit.jupiter.api.Assertions.fail;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

/**
 * ConvertAsserThatToIsEqualUtil単体テスト
 */
class ConvertAsserThatToIsEqualUtilTest {

    @Test
    void test() throws Exception {

        final String root = "/net/seijishikin/jp/normalize/shuushi_doc/v05/dto";

        ConvertAsserThatToIsEqualUtil convertAsserThatToIsEqualUtil = new ConvertAsserThatToIsEqualUtil();

        Path pathDirectory = Paths.get(GetCurrentResourcePath.getBackTestFilePath() + root);

        System.out.println("======"+pathDirectory);
        
        
        
        convertAsserThatToIsEqualUtil.practice(pathDirectory);

        // TODO 動作結果のテスト
        // 候補1.ファイル存在
        // 候補2.ファイル内容

        fail("Not yet implemented");
    }

}
