package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

    public class Solution {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("================================");
            System.out.printf("%-15s%03d\n", scanner.next(), scanner.nextInt());
            System.out.printf("%-15s%03d\n", scanner.next(), scanner.nextInt());
            System.out.printf("%-15s%03d\n", scanner.next(), scanner.nextInt());
            System.out.println("================================");

            scanner.close();
        }
    }
}
