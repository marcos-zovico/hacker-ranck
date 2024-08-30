package hackerrank.java.exceptionhandling;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaExceptionHandlingTryCatchTest {

    @Test
    void testCase1() throws Exception {
        String in = """
                10
                3""";
        System.setIn(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8)));
        String actual = tapSystemOut(() -> JavaExceptionHandlingTryCatch.Solution.main(new String[]{}));
        assertEquals("3", actual.strip());
    }

    @Test
    void testCase2() throws Exception {
        String in = """
                10
                Hello""";
        System.setIn(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8)));
        String actual = tapSystemOut(() -> JavaExceptionHandlingTryCatch.Solution.main(new String[]{}));
        assertEquals("java.util.InputMismatchException", actual.strip());
    }

    @Test
    void testCase3() throws Exception {
        String in = """
                10
                0""";
        System.setIn(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8)));
        String actual = tapSystemOut(() -> JavaExceptionHandlingTryCatch.Solution.main(new String[]{}));
        assertEquals("java.lang.ArithmeticException: / by zero", actual.strip());
    }
}