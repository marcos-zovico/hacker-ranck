package hackerrank.java.introduction;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaOutputFormattingTest {

    private static final String IN = """
            java 100
            cpp 65
            python 50""";

    private static final String OUT = """
            ================================
            java           100
            cpp            065
            python         050
            ================================""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaOutputFormatting.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}