package util;

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

    public static String bitString(char c){
        String st = Integer.toBinaryString(c);
        while (st.length() < 8){
            st = '0' + st;
        }
        return st;
    }

    public static String bitString(int i){
        return bitString(Integer.toString(i));
    }

}
