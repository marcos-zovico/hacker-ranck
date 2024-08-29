package hackerrank.java.advanced;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class CanYouAccessTest {

    private static final String IN = "8";

    private static final String OUT = """
            8 is power of 2
            An instance of class: hackerrank.java.advanced.CanYouAccess.Solution.Inner.Private has been created""";

    @BeforeAll
    static void setUp() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> CanYouAccess.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }

}