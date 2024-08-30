package hackerrank.java.datastructures;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaSortTest {

    private static final String IN = """
            5
            33 Rumpa 3.68
            85 Ashis 3.85
            56 Samiha 3.75
            19 Samara 3.75
            22 Fahim 3.76""";

    private static final String OUT = """
            Ashis
            Fahim
            Samara
            Samiha
            Rumpa""";


    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaSort.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}