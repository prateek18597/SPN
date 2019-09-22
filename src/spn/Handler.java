package spn;

import config.Config;
import util.KeyMixing;
import util.StringUtil;

import java.security.Key;
import java.util.ArrayList;

public class Handler {
    /**
     * @param msg Original Message (! Not in Binary String )
     * @param key Original Key in Char (!Not in Binary String)
     * @return
     */
    public static String handle(String msg, String key){
        ArrayList<String> stringArrayList = StringUtil.divideString(StringUtil.bitString(msg),
                Config.blockSize);
        String handledMsg = "";
        for(String s: stringArrayList){
            String st = s;
            String k;
            for( int i = 0; i < Config.rounds - 1; i++){
                k = KeyMixing.getKey(key,i);
                st = Round.generalRound(st,k);
            }
            k = KeyMixing.getKey(key,Config.rounds - 1);
            st = Round.lastRound(st, k);
            handledMsg += st;
        }
        return handledMsg;
    }
}