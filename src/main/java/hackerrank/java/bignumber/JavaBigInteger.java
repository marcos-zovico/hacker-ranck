package hackerrank.java.bignumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaBigInteger {

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            BigInteger a = new BigInteger(bufferedReader.readLine());
            BigInteger b = new BigInteger(bufferedReader.readLine());

            System.out.println(a.add(b));
            System.out.println(a.multiply(b));

            bufferedReader.close();
        }
    }
}
