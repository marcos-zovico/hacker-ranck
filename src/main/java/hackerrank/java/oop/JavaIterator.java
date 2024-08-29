package hackerrank.java.oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaIterator {

    static Iterator<Object> func(List<Object> myList) {

        Iterator<Object> it = myList.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            if ("###".equals(element))
                break;
        }
        return it;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Object> mylist = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");

        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        Iterator<Object> it = func(mylist);

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }
    }
}
