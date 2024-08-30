package hackerrank.java.advanced;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaReflectionAttributesTest {


    private static final String OUT = """
            anothermethod
            getName
            setEmail
            setId""";

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaReflectionAttributes.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}