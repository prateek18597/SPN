package constants;

import java.util.HashMap;
import java.util.Map;

public class Sbox {
    public static final Map<Integer, Integer> Substitute = new HashMap<>(){{
        put(0,0);
        put(1,13);
        put(2,11);
        put(3,6);
        put(4,7);
        put(5,10);
        put(6,12);
        put(7,1);
        put(8,14);
        put(9,3);
        put(10,5);
        put(11,8);
        put(12,9);
        put(13,4);
        put(14,2);
        put(15,15);
    }};

    public static final Map<Integer, Integer> SubstituteB = new HashMap<>(){{
        put(0,0);
        put(13,1);
        put(11,2);
        put(6,3);
        put(7,4);
        put(10,5);
        put(12,6);
        put(1,7);
        put(14,8);
        put(3,9);
        put(5,10);
        put(8,11);
        put(9,12);
        put(4,13);
        put(2,14);
        put(15,15);
    }};
}
