package hackerrank.java.datastructures;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaComparatorTest {

    private static final String IN = """
            5
            amy 100
            david 100
            heraldo 50
            aakansha 75
            aleksa 150""";

    private static final String OUT = """
            aleksa 150
            amy 100
            david 100
            aakansha 75
            heraldo 50""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(JavaComparator::runCode);
        assertEquals(OUT, actual.strip());
    }
}