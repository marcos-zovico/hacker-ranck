package hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

    public class Solution {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            List<List<Integer>> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                List<Integer> l = new ArrayList<>();
                int d = scan.nextInt();

                for (int j = 0; j < d; j++) {
                    l.add(scan.nextInt());
                }

                list.add(l);
            }

            int q = scan.nextInt();

            for (int i = 0; i < q; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();

                try {
                    System.out.println(list.get(x - 1).get(y - 1));
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }

            scan.close();
        }
    }
}
