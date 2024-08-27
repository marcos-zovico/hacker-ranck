package hackerrank.java.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaRegex2DuplicateWordsTest {

    private static final String IN = """
            5
            Goodbye bye bye world world world
            Sam went went to to to his business
            Reya is is the the best player in eye eye game
            in inthe
            Hello hello Ab aB""";

    private static final String OUT = """
            Goodbye bye world
            Sam went to his business
            Reya is the best player in eye game
            in inthe
            Hello Ab""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(JavaRegex2DuplicateWords::runCode);
        assertEquals(OUT, actual.strip());
    }
}