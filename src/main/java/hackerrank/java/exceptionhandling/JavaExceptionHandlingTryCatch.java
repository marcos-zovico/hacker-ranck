package hackerrank.java.exceptionhandling;

import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    public class Solution {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(x / y);
            } catch (ArithmeticException e) {
                System.out.println(e.getClass().getName() + ": / by zero");
            } catch (Exception e) {
                System.out.println(e.getClass().getName());
            }
        }
    }

}
