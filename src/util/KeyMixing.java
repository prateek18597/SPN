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

}
