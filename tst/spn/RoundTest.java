package spn;

import org.junit.Assert;
import org.junit.Test;

public class RoundTest {

    @Test
    public void basicTest(){
        String bitString = "1010101010101010101010101010101010101010101010101010101010101010";
        String bitKey = "0101010101010101010101010101010101010101010101010101010101010101";
        String out = Round.generalRound(bitString,bitKey);
        Assert.assertEquals(out, "1111111111111111111111111111111111111111111111111111111111111111");
        out = Round.generalRound(bitString,bitString);
        Assert.assertEquals(out, "0000000000000000000000000000000000000000000000000000000000000000");
    }
}
