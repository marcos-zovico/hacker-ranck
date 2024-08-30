package hackerrank.java.datastructures;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;


class JavaArrayListTest {

    private static final String IN = """
            5
            5 41 77 74 22 44
            1 12
            4 37 34 36 52
            0
            3 20 22 33
            5
            1 3
            3 4
            3 1
            4 3
            5 5""";

    private static final String OUT = """
            74
            52
            37
            ERROR!
            ERROR!""";


    @BeforeAll
    static void setup(){
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }
    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> JavaArrayList.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }
}