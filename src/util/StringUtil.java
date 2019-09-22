package util;

import java.util.ArrayList;

public class StringUtil {
    public static String bitString(String s){
        String str = "";
        for(int i = 0; i < s.length(); i++){
            String st = Integer.toBinaryString(s.charAt(i));
            while (st.length() < 8){
                st = '0' + st;
            }
            str += st;
        }
        return str;
    }

    public static String xor(String s, String t){
        String r = "";
        for( int i = 0; i < s.length(); i++ ){
            r += s.charAt(i) ^ t.charAt(i);
        }
        return r;
    }

    public static String bitString(char c){
        String st = Integer.toBinaryString(c);
        while (st.length() < 8){
            st = '0' + st;
        }
        return st;
    }

    public static ArrayList<String> divideString(String s, int size){
        ArrayList<String> strArray = new ArrayList<>();
        s = bitString(s);
        int l = s.length();
        int count = 0;
        while(l%size != 0){
            s+='0';
            l++;
            count++;
        }
        String c = Integer.toBinaryString(count);
        while(c.length() < 64){
            c ='0' + c;
        }
        for(int i = 0; i < l; i+=64){
            strArray.add(s.substring(i,i+64));
        }
        strArray.add(c);
        return strArray;
    }

}
