package hackerrank.java.oop;


import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaInheritance2Test {

    private static final String OUT = """
            My superclass is: Arithmetic
            42 13 20""";

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaInheritance2.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }

}