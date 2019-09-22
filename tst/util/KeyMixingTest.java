package util;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static org.junit.Assert.assertEquals;

public class KeyMixingTest {

    @Test
    public void check5Left(){
        String s = KeyMixing.left("0123456789",1);
        assertEquals(s, "5678901234");
        s = KeyMixing.left("012345678912",2);
        assertEquals(s, "120123456789");
    }

    @Test
    public void check5Right(){
        String s = KeyMixing.right("0123456789",1);
        assertEquals(s, "5678901234");
        s = KeyMixing.right("0123456789AB",2);
        assertEquals(s, "23456789AB01");
    }

    @Test
    public void checkGetKey(){
        String key = KeyMixing.getKey("0123456789ABCDEF",0);
        assertEquals(key, StringUtil.bitString("01234567"));
        key = KeyMixing.getKey("0123456789ABCDEF",1);
        assertEquals(key, StringUtil.bitString("89ABCDEF"));
        key = KeyMixing.getKey("0123456789ABCDEF",2);
        assertEquals(key, KeyMixing.left(StringUtil.bitString("01234567"),1));
        key = KeyMixing.getKey("0123456789ABCDEF",3);
        assertEquals(key, KeyMixing.right(StringUtil.bitString("89ABCDEF"),1));
    }

}
