package hackerrank.java.advanced;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaVarargsSimpleAdditionTest {

    private static final String IN = """
            1
            2
            3
            4
            5
            6""";

    private static final String OUT = """
            1+2=3
            1+2+3=6
            1+2+3+4+5=15
            1+2+3+4+5+6=21""";

    @BeforeAll
    static void setUp() {
        System.setIn(new ByteArrayInputStream(IN.getBytes()));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaVarargsSimpleAddition.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }

}