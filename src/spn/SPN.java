package spn;

import java.util.Scanner;

public class SPN {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Key ( 16 Characters):");
        String key = "0123456789123456";//scan.next();
        System.out.println("Enter your message:");
        String msg = "Hello World, This is Pratik Parmar.";//scan.next();
        String encryptedMessage = Handler.handleEncryption(msg, key);
        System.out.println("Encrypted Message:\n" + encryptedMessage);
        String decryptedMessage = Handler.handleDecryption(encryptedMessage, key);
        System.out.println("Decrypted Message:\n" + decryptedMessage);
    }
}