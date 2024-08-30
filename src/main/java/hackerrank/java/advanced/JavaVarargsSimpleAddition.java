package hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class JavaVarargsSimpleAddition {

    public class Solution {
        public static void main(String[] args) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int n1 = Integer.parseInt(br.readLine());
                int n2 = Integer.parseInt(br.readLine());
                int n3 = Integer.parseInt(br.readLine());
                int n4 = Integer.parseInt(br.readLine());
                int n5 = Integer.parseInt(br.readLine());
                int n6 = Integer.parseInt(br.readLine());

                Add ob = new Add();
                ob.add(n1, n2);
                ob.add(n1, n2, n3);
                ob.add(n1, n2, n3, n4, n5);
                ob.add(n1, n2, n3, n4, n5, n6);

                checkOverloading();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private static void checkOverloading() throws Exception {
            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;

            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());
            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        }
    }
}

class Add {
    public void add(Integer... args) {
        int sum = 0;
        StringBuilder out = new StringBuilder();

        for (Integer integer : args) {
            sum += integer;
            out.append(integer).append("+");
        }

        out = new StringBuilder(out.substring(0, out.length() - 1));
        out.append("=").append(sum);

        System.out.println(out);
    }
}
