package hackerrank.java.bignumber;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaBigDecimalTest {

    private static final String IN = """
            9
            -100
            50
            0
            56.6
            90
            0.12
            .12
            02.34
            000.000""";

    private static final String OUT = """
            90
            56.6
            50
            02.34
            0.12
            .12
            0
            000.000
            -100""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaBigDecimal.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}