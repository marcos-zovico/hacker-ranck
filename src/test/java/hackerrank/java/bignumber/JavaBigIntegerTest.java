package hackerrank.java.bignumber;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaBigIntegerTest {

    private static final String IN = """
            1234
            20""";

    private static final String OUT = """
            1254
            24680""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(JavaBigInteger::runCode);
        assertEquals(OUT, actual.strip());
    }

}