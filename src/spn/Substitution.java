package spn;

import constants.Sbox;
import util.StringUtil;

public class Substitution {

    public static String substitute(String s){
        int sInt = Integer.parseInt(s,2);
        String st = Integer.toBinaryString(Sbox.Substitute.get(sInt));
        while (st.length() < 4){
            st = '0' + st;
        }
        return st;
    }
}
