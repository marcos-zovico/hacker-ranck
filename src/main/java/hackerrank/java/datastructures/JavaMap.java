package hackerrank.java.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void runCode() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> book = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            book.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            if (book.containsKey(s)) {
                System.out.println(s + "=" + book.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
