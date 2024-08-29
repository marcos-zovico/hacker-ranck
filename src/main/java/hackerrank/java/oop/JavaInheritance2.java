package hackerrank.java.oop;

public class JavaInheritance2 {

    public class Solution {
        public static void main(String[] args) {
            Adder a = new Adder();
            System.out.println("My superclass is: " + a.getClass().getSuperclass().getSimpleName());
            System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
        }
    }
}

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {

}
