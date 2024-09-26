package hackerrank.projecteuler;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplesOf3And5Test {

    private static final String IN = """
            6
            10
            100
            1000
            10000
            100000
            1000000""";

    private static final String OUT = """
            23
            2318
            233168
            23331668
            2333316668
            233333166668""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> MultiplesOf3And5.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}