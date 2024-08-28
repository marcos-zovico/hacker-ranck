package hackerrank.java.oop;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaMethodOverriding2Test {

    private static final String OUT = """
            Hello I am a motorcycle, I am a cycle with an engine.
            My ancestor is a cycle who is a vehicle with pedals.""";


    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(JavaMethodOverriding2::runCode);
        assertEquals(OUT, actual.strip());
    }
}