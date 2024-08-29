package hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CanYouAccess {

    public class Solution {

        public static void main(String[] args) throws Exception {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int num = Integer.parseInt(br.readLine().trim());

                Inner.Private o = new Inner().new Private();

                System.out.println(num + " is " + o.powerof2(num));
                System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

                br.close();
            } catch (Exception e) {
                System.out.println("Unsuccessful Termination!!");
            }
        }

        static class Inner {
            private class Private {
                private String powerof2(int num) {
                    return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
                }
            }
        }

    }
}
