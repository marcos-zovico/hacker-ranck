package hackerrank.java.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void runCode() {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int operations  = scan.nextInt();
        BitSet b1 = new BitSet(length);
        BitSet b2 = new BitSet(length);

        BitSet[] b = {b1, b2};

        for (int i = 0; i < operations; i++) {
            String op = scan.next();
            int x = scan.nextInt() - 1;
            int y = scan.nextInt();

            switch (op) {
                case "AND" -> b[x].and(b[y - 1]);
                case "OR" -> b[x].or(b[y - 1]);
                case "XOR" -> b[x].xor(b[y - 1]);
                case "FLIP" -> b[x].flip(y);
                case "SET" -> b[x].set(y);
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        scan.close();
    }
}
