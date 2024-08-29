package hackerrank.java.advanced;

import java.util.Scanner;

public class JavaSingletonPattern {

    public class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Singleton.getSingleInstance().str = scan.nextLine();

            String out = "Hello I am a singleton! Let me say %s to you";
            System.out.printf(out, Singleton.getSingleInstance().str);

            scan.close();
        }
    }

}

class Singleton {

    private static final Singleton instance = new Singleton();

    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return instance;
    }
}