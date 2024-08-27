package hackerrank.java.bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void runCode() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        sc.close();

        Arrays.sort(s,0,n, (a, b) -> new BigDecimal(b).compareTo(new BigDecimal(a)));

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
