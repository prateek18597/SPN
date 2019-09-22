package util;

import org.junit.Assert;
import org.junit.Test;


public class StringUtilTest {

    @Test
    public void binStringTest(){
        String s = StringUtil.bitString("ABCD");
        Assert.assertEquals(s, "01000001010000100100001101000100");
        s = StringUtil.bitString('A');
        Assert.assertEquals(s, "01000001");
        Assert.assertEquals(8,s.length());
        s = StringUtil.bitString(65);
        Assert.assertEquals(s, "0011011000110101");
    }
}
