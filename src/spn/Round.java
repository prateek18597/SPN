package spn;

import util.StringUtil;

public class Round {

    /**
     * @param s block message, this will be in bitString format, Size 64
     * @param key also in bit format and of Size 64
     * @return out obtained after operations
     */
    public static String generalRound(String s, String key){
        String xorString = StringUtil.xor(s, key);
        String subString = "";
        for(int i = 0; i < xorString.length(); i+=4){
            subString += Substitution.substitute(xorString.substring(i,i+4));
        }
        String perString = Permutation.permute(subString);
        return perString;
    }

    public static String lastRound(String s, String key){
        String xorString = StringUtil.xor(s, key);
        String subString = "";
        for(int i = 0; i < xorString.length(); i+=4){
            subString += Substitution.substitute(xorString.substring(i,i+4));
        }
        return subString;
    }

    public static String generalRoundBack(String s, String key){
        String xorString = StringUtil.xor(s, key);
        String perString = Permutation.permuteB(xorString);
        String subString = "";
        for(int i = 0; i < perString.length(); i+=4){
            subString += Substitution.substituteB(perString.substring(i,i+4));
        }
        return subString;
    }

    public static String lastRoundBack(String s, String key){
        String xorString = StringUtil.xor(s, key);
        String subString = "";
        for(int i = 0; i < xorString.length(); i+=4){
            subString += Substitution.substituteB(xorString.substring(i,i+4));
        }
        return subString;
    }

}
