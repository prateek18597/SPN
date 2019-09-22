package constants;

import java.util.HashMap;
import java.util.Map;

public class Sbox {
    public static final Map<Integer, Integer> Substitute = new HashMap<>(){{
        put(0,0);
        put(1,0xD);
        put(2,0xB);
        put(3,6);
        put(4,7);
        put(5,0xA);
        put(6,0xC);
        put(7,1);
        put(8,0xE);
        put(9,3);
        put(0xA,5);
        put(0xB,8);
        put(0xC,9);
        put(0xD,4);
        put(0xE,2);
        put(0xF,0xF);
    }};
}
