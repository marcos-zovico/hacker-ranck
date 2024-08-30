package hackerrank.java.datastructures;


import java.util.Scanner;

public class JavaSubArray {

    public class Solution {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int n = Integer.parseInt(in.nextLine());
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }

            int count = 0;

            for (int i = 0; i < array.length; i++) {
                int sum = 0;
                for (int j = i; j < array.length; j++) {
                    sum += array[j];
                    if (sum < 0)
                        count++;
                }
            }

            System.out.println(count);
            in.close();
        }
    }
}
