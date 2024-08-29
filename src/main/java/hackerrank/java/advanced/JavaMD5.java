package hackerrank.java.advanced;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {

    public class Solution {

        public static void main(String[] args) throws NoSuchAlgorithmException {

            Scanner scan = new Scanner(System.in);
            String token = scan.nextLine();

            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(token.getBytes(), 0, token.length());

            scan.close();

            System.out.println(new BigInteger(1, m.digest()).toString(16));
        }
    }
}
