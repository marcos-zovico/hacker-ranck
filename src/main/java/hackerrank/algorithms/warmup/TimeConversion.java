package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConversion {

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String s = bufferedReader.readLine();
            String result = Result.timeConversion(s);
            System.out.println(result);

            bufferedReader.close();
        }
    }
}

class Result {
    public static String timeConversion(String s) {
        s = s.replace("AM", " AM").replace("PM", " PM");

        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.US))
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    }
}
