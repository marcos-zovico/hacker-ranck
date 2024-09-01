package hackerrank.java.introduction;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WelcomeToJavaTest {

    private static final String OUT = """
            Hello, World.
            Hello, Java.""";

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> WelcomeToJava.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}