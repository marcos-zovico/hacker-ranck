package hackerrank.java.oop;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaMethodOverridingTest {


    private static final String OUT = """
            Generic Sports
            Each team has n players in Generic Sports
            Soccer Class
            Each team has 11 players in Soccer Class""";


    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaMethodOverriding.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}