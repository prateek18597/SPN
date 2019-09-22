package util;

public class KeyMixing {

    public static String left(String b, int r, int l){
        return b.substring(r*l) + b.substring(0, r*l);
    }

    public static String right(String b, int r, int l){
        return b.substring(b.length() - r*l) + b.substring(0, b.length() - r*l);
    }

    public static String left(String b, int r){
        return left(b,r,5);
    }

    public static String right(String b, int r){
        return right(b,r,5);
    }

    public static String getKey(String key, int round){
        //Rounds starts from 0
        if(round%2==0){
            //Odd rounds refers to L
            return left(StringUtil.bitString(key.substring(0,64)),round/2);
        } else {
            //Even rounds refer to R
            return right(StringUtil.bitString(key.substring(64)), round/2);
        }
    }

}
