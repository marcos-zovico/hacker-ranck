package hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Comparator.comparing;

public class JavaSort {

    public class Solution {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());

            List<SortStudent> studentList = new ArrayList<>();
            while (testCases > 0) {
                int id = in.nextInt();
                String name = in.next();
                double cgpa = Double.parseDouble(in.next());

                SortStudent st = new SortStudent(id, name, cgpa);
                studentList.add(st);

                testCases--;
            }

            studentList.sort(
                    comparing(SortStudent::getCgpa)
                            .reversed()
                            .thenComparing(SortStudent::getName)
            );

            studentList.forEach(st -> System.out.println(st.getName()));
        }
    }

}

class SortStudent {
    private int id;
    private String name;
    private double cgpa;

    public SortStudent(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}
