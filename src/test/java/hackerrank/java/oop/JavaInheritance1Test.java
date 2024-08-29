package hackerrank.java.oop;


import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaInheritance1Test {

    private static final String OUT = """
            I am walking
            I am flying
            I am singing""";

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaInheritance1.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}