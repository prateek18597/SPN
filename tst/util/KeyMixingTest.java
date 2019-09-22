package util;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class KeyMixingTest {

    @Test
    public void check5Left(){
        String s = KeyMixing.left("0123456789",1);
        Assert.assertEquals(s, "5678901234");
        s = KeyMixing.left("012345678912",2);
        Assert.assertEquals(s, "120123456789");
    }

    @Test
    public void check5Right(){
        String s = KeyMixing.right("0123456789",1);
        Assert.assertEquals(s, "5678901234");
        s = KeyMixing.right("0123456789AB",2);
        Assert.assertEquals(s, "23456789AB01");
    }

}
