package spn;

import config.Config;
import constants.Pbox;

public class Permutation {
    public static String permute(String s){//Size of String s is 64 here.
        StringBuffer st = new StringBuffer(String.format("%"+ Config.blockSize +"s", Integer.toBinaryString(0))
                .replace(" ", "0"));
        int l = s.length();
        for(int i = 0; i < l; i++){
            st.setCharAt(Pbox.Permute.get(i),s.charAt(i));
        }
        return st.toString();
    }

    public static String permuteB(String s){//Size of String s is 64 here.
        StringBuffer st = new StringBuffer(String.format("%"+ Config.blockSize +"s", Integer.toBinaryString(0))
                .replace(" ", "0"));
        int l = s.length();
        for(int i = 0; i < l; i++){
            st.setCharAt(Pbox.PermuteB.get(i),s.charAt(i));
        }
        return st.toString();
    }
}
