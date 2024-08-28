package hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void runCode() {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        int ops = scan.nextInt();

        for (int i = 0; i < ops; i++) {
            String op = scan.next();
            int x = scan.nextInt();

            if ("Insert".equals(op)) {
                int y = scan.nextInt();
                list.add(x, y);
            } else {
               list.remove(x);
            }
        }

        scan.close();

        StringBuilder out = new StringBuilder();

        for (Integer i : list){
            out.append(i).append(" ");
        }

        System.out.println(out.toString().strip());
    }
}
