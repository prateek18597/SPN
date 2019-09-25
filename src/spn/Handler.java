package spn;

import config.Config;
import util.KeyMixing;
import util.StringUtil;

import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;

public class Handler {
    /**
     * @param msg Original Message (!Not in Binary String )
     * @param key Original Key in Char (!Not in Binary String)
     * @return
     */
    public static String handleEncryption(String msg, String key){
        ArrayList<String> stringArrayList = StringUtil.divideString(StringUtil.bitString(msg),
                Config.blockSize);
        String handledMsg = "";
        for(String s: stringArrayList){
            String st = s;
            String k = "";
            for( int i = 0; i < Config.rounds - 1; i++){
                k = KeyMixing.getKey(key,i);
                st = Round.generalRound(st,k);
            }
            k = KeyMixing.getKey(key,Config.rounds - 1);
            st = Round.lastRound(st, k);
            k = KeyMixing.getKey(key,Config.rounds);
            st = StringUtil.xor(st, k);
            handledMsg += st;
        }
        System.out.println("Encrypted Message:");
        System.out.println("Hexadecimal: " + StringUtil.toHexadecimal(handledMsg));
        System.out.println("Ascii: " + StringUtil.asciiString(handledMsg));
        return StringUtil.asciiString(handledMsg);
    }

    public static String handleDecryption(String msg, String key){
        ArrayList<String> stringArrayList = StringUtil.divideStringDecryption(StringUtil.bitString(msg),
                Config.blockSize);
        String handledMsg = "";
        for(String s: stringArrayList){
            String st = s;
            String k = "";
            k = KeyMixing.getKey(key,Config.rounds);
            st = Round.lastRoundBack(st, k);
            for( int i = Config.rounds - 1; i > 0; i--){
                k = KeyMixing.getKey(key,i);
                st = Round.generalRoundBack(st,k);
            }
            k = KeyMixing.getKey(key,0);
            st = StringUtil.xor(st, k);
            handledMsg += st;
        }
        handledMsg = StringUtil.removePadding(handledMsg);
        return StringUtil.asciiString(handledMsg);
    }
}
