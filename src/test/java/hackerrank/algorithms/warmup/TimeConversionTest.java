package hackerrank.algorithms.warmup;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {

    @Test
    void testCase1() throws Exception {
        String in = "07:05:45PM";
        System.setIn(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8)));
        String actual = tapSystemOut(() -> TimeConversion.Solution.main(new String[]{}));
        assertEquals("19:05:45", actual.strip());
    }

    @Test
    void testCase2() throws Exception {
        String in = "12:40:22AM";
        System.setIn(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8)));
        String actual = tapSystemOut(() -> TimeConversion.Solution.main(new String[]{}));
        assertEquals("00:40:22", actual.strip());
    }
}