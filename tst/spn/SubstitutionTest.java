package spn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstitutionTest {

    @Test
    public void checkSubstituion(){
        String st = Substitution.substitute("1010");
        assertEquals(st, "0101");
        st = Substitution.substitute("0000");
        assertEquals(st, "0000");

    }
}
