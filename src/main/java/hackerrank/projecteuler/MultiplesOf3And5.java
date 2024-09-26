package hackerrank.projecteuler;

import java.util.Scanner;

public class MultiplesOf3And5 {

    public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();

            for (int i = 0; i < t; i++) {
                int n = in.nextInt();
                long count = sumOfMultiples(3, n) +
                        sumOfMultiples(5, n) -
                        sumOfMultiples(15, n);
                System.out.println(count);
            }
        }

        private static long sumOfMultiples(int k, int n) {
            long p = (n - 1) / k; // Find the number of multiples of k below n
            return k * p * (p + 1) / 2; // Use the sum of arithmetic progression formula
        }
    }
}
