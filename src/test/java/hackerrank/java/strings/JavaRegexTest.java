package hackerrank.java.strings;

import hackerrank.java.strings.JavaRegex;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaRegexTest {

    private static final String IN = """
            000.12.12.034
            121.234.12.12
            23.45.12.56
            00.12.123.123123.123
            122.23
            Hello.IP""";

    private static final String OUT = """
            true
            true
            true
            false
            false
            false""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaRegex.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}