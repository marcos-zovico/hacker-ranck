package hackerrank.array;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

    public static String getXYPoint(InputStream in) {
        StringBuilder out = new StringBuilder();
        Scanner scan = new Scanner(in);
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

            try{
                out.append(list.get(x-1).get(y-1));
//                System.out.println(list.get(x-1).get(y-1));
            } catch(Exception e){
                out.append("ERROR!");
//                System.out.println("ERROR!");
            }

            out.append("\n");
        }

        scan.close();

        return out.deleteCharAt(out.length() - 1).toString();
    }
}
