package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class SolveMeFirst {

    public class Solution {

        static int solveMeFirst(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            in.next();
            in.next();
            int a = in.nextInt();

            in.next();
            in.next();
            int b = in.nextInt();

            in.close();

            System.out.println(solveMeFirst(a, b));
        }
    }
}
