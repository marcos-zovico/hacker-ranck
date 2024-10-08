package hackerrank.java.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaInstanceofKeyword {

    public class Solution {
        public static void main(String[] args) {
            List<Object> mylist = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                String s = sc.next();
                if (s.equals("Student")) mylist.add(new Student());
                if (s.equals("Rockstar")) mylist.add(new Rockstar());
                if (s.equals("Hacker")) mylist.add(new Hacker());
            }
            System.out.println(InstanceOFTutorial.count(mylist));
        }
    }
}

class InstanceOFTutorial {

    static String count(List<Object> mylist) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);

            if (element instanceof Student)
                a++;

            if (element instanceof Rockstar)
                b++;

            if (element instanceof Hacker)
                c++;
        }

        return a + " " + b + " " + c;
    }
}

class Student {
}

class Rockstar {
}

class Hacker {
}