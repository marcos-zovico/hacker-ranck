package hackerrank.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaSubstringComparisonsTest {

    private static final String IN = """
            welcometojava
            3""";

    private static final String OUT = """
            ava
            wel""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(JavaSubstringComparisons::runCode);
        assertEquals(OUT, actual.strip());
    }
}