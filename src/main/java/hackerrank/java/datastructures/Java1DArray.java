package hackerrank.java.datastructures;

import java.io.IOException;
import java.util.Scanner;

public class Java1DArray {

    public static void runCode() throws IOException {
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
