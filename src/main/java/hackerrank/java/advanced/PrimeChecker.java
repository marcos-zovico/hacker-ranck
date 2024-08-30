package hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class PrimeChecker {

    public class Solution {

        public static void main(String[] args) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int n1 = Integer.parseInt(br.readLine());
                int n2 = Integer.parseInt(br.readLine());
                int n3 = Integer.parseInt(br.readLine());
                int n4 = Integer.parseInt(br.readLine());
                int n5 = Integer.parseInt(br.readLine());

                Prime ob = new Prime();
                ob.checkPrime(n1);
                ob.checkPrime(n1, n2);
                ob.checkPrime(n1, n2, n3);
                ob.checkPrime(n1, n2, n3, n4, n5);

                checkOverloading();
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        private static void checkOverloading() throws Exception {
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;

            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());
            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        }

    }
}

class Prime {
    public void checkPrime(Integer... args) {
        StringBuilder out = new StringBuilder();
        for (Integer integer : args) {
            boolean isPrime = BigInteger.valueOf(integer).isProbablePrime(1);

            if (isPrime) {
               out.append(integer).append(" ");
            }
        }

        System.out.println(out.toString().strip());
    }
}
