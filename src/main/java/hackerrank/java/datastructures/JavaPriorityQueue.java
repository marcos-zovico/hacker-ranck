package hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void runCode() {

        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Priorities {

    private final StudentComparator comparator = new StudentComparator();
    private final PriorityQueue<Student> queue = new PriorityQueue<>(comparator);

    public List<Student> getStudents(List<String> events) {

        for (String event : events) {
            if ("SERVED".equals(event)) {
                queue.poll();
            } else {
                String[] s = event.split(" ");
                int id = Integer.parseInt(s[3]);
                String name = s[1];
                double cgpa = Double.parseDouble(s[2]);
                queue.add(new Student(id, name, cgpa));
            }
        }

        return queue.stream().
                sorted(comparator)
                .collect(Collectors.toList());
    }
}

/**
 * 1. The student having the highest Cumulative Grade Point Average (CGPA) is served first.
 * 2. Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
 * 3. Any students having the same CGPA and name will be served in ascending order of the id.
 */
class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        if (o1.getCgpa() < o2.getCgpa()) {
            return 1;
        }

        if (o1.getCgpa() > o2.getCgpa()) {
            return -1;
        }

        if (o1.getCgpa() == o2.getCgpa()) {
            return o1.getName().compareTo(o2.getName());
        }

        if (o1.getCgpa() == o2.getCgpa() && Objects.equals(o1.getName(), o2.getName()) && o1.getId() < o2.getId()) {
            return 1;
        }

        return -1;
    }
}

class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
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