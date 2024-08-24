package hackerrank.array;


public class NegativeSubArrays {

    public static long countNegativeSubArrays(Integer[] array) {
        long count = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum+= array[j];
                if (sum < 0)
                    count++;
            }
        }

        return count;
    }
}
