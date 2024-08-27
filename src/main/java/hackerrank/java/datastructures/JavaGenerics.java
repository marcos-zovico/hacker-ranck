package hackerrank.java.datastructures;

public class JavaGenerics {

    public static void runCode(){

        Integer[] intArray = new Integer[]{1, 2, 3};
        String[] stringArray = new String[]{"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }

    private static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
