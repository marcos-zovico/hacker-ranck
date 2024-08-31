package hackerrank.java.strings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidUsernameRegularExpressionTest {

    private static final String IN = """
            8
            Julia
            Samantha
            Samantha_21
            1Samantha
            Samantha?10_2A
            JuliaZ007
            Julia@007
            _Julia007""";

    private static final String OUT = """
            Invalid
            Valid
            Valid
            Invalid
            Invalid
            Valid
            Invalid
            Invalid""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> ValidUsernameRegularExpression.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}