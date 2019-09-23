package util;

import config.Config;

public class KeyMixing {

    public static String left(String b, int r, int l){
        return b.substring(r*l%Config.blockSize) + b.substring(0, r*l%Config.blockSize);
    }

    public static String right(String b, int r, int l){
        int beginIndex = b.length() - (r * l) % Config.blockSize;
        return b.substring(beginIndex) + b.substring(0, beginIndex);
    }

    public static String left(String b, int r){
        return left(b,r,5);
    }

    public static String right(String b, int r){
        return right(b,r,5);
    }

    public static String getKey(String key, int round){
        //Rounds starts from 0
        String k = StringUtil.bitString(key);
        if(round%2==0){
            //Odd rounds refers to L
            return left(k.substring(0, Config.blockSize),round/2);
        } else {
            //Even rounds refer to R
            return right(k.substring(Config.blockSize), round/2);
        }
    }

}
