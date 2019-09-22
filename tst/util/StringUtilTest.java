package util;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class StringUtilTest {

    @Test
    public void binStringTest(){
        String s = StringUtil.bitString("ABCD");
        Assert.assertEquals(s, "01000001010000100100001101000100");
        s = StringUtil.bitString('A');
        Assert.assertEquals(s, "01000001");
        Assert.assertEquals(8,s.length());
        s = StringUtil.bitString("65");
        Assert.assertEquals(s, "0011011000110101");
    }

    @Test
    public void divideStringTest(){
        String s = "12345678";
        ArrayList<String> a = StringUtil.divideString(s, 64);
        ArrayList<String> b = new ArrayList<>();
        b.add(StringUtil.bitString(s));
        b.add(String.format("%64s", Integer.toBinaryString(0)).replace(" ", "0"));
        Assert.assertEquals(a.get(0),b.get(0));
        Assert.assertEquals(a.get(1),b.get(1));
        Assert.assertEquals(a.size(),2);
    }

    @Test
    public void checkXor(){
        String st  = StringUtil.xor("11110000","11111010");
        Assert.assertEquals(st,"00001010");
    }
}
