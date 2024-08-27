package hackerrank.java.datastructures;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaStackTest {

    private static final String IN = """
            }][}}(}][))]
            [](){()}
            ()
            ({}([][]))[]()
            {)[](}]}]}))}(())(
            ([[)""";

    private static final String OUT = """
            false
            true
            true
            true
            false
            false""";


    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(JavaStack::runCode);
        assertEquals(OUT, actual.strip());
    }

}