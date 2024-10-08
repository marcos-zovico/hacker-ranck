package hackerrank.java.oop;

import java.util.Scanner;

public class JavaInterface {

    public class Solution {
        public static void main(String[] args) {
            MyCalculator my_calculator = new MyCalculator();
            System.out.print("I implemented: ");
            ImplementedInterfaceNames(my_calculator);
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print(my_calculator.divisor_sum(n) + "\n");
            sc.close();
        }

        /*
         *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
         */
        static void ImplementedInterfaceNames(Object o) {
            Class[] theInterfaces = o.getClass().getInterfaces();
            for (Class theInterface : theInterfaces) {
                String interfaceName = theInterface.getSimpleName();
                System.out.println(interfaceName);
            }
        }
    }
}

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
