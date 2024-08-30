package hackerrank.java.datastructures;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaGenericsTest {

    private static final String OUT = """
            1
            2
            3
            Hello
            World""";

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaGenerics.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }

}