package hackerrank.java.datastructures;

import java.util.Scanner;

public class Java1DArray {

    class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }

            scan.close();

            for (int j : a) {
                System.out.println(j);
            }
        }
    }
}
