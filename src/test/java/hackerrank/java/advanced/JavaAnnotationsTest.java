package hackerrank.java.advanced;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaAnnotationsTest {


    private static final String IN = """
            3
            SENIOR 75
            JUNIOR 45
            SENIOR 40""";

    private static final String OUT = """
            Senior Member
            Spend: 75
            Budget Left: 25
            Junior Member
            Spend: 45
            Budget Left: 5
            Senior Member
            Spend: 40
            Budget Left: 60""";

    @BeforeAll
    static void setUp() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaAnnotations.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}