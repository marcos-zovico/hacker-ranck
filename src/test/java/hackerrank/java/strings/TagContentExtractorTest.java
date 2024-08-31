package hackerrank.java.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TagContentExtractorTest {

    private static final String IN = """
            4
            <h1>Nayeem loves counseling</h1>
            <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
            <Amee>safat codes like a ninja</amee>
            <SA premium>Imtiaz has a secret crush</SA premium>""";

    private static final String OUT = """
            Nayeem loves counseling
            Sanjay has no watch
            So wait for a while
            None
            Imtiaz has a secret crush""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> TagContentExtractor.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}