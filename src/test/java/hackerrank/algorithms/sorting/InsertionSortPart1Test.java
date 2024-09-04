package hackerrank.algorithms.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertionSortPart1Test {

    private static final String IN = """
            10
            2 3 4 5 6 7 8 9 10 1""";

    private static final String OUT = """
            2 3 4 5 6 7 8 9 10 10
            2 3 4 5 6 7 8 9 9 10
            2 3 4 5 6 7 8 8 9 10
            2 3 4 5 6 7 7 8 9 10
            2 3 4 5 6 6 7 8 9 10
            2 3 4 5 5 6 7 8 9 10
            2 3 4 4 5 6 7 8 9 10
            2 3 3 4 5 6 7 8 9 10
            2 2 3 4 5 6 7 8 9 10
            1 2 3 4 5 6 7 8 9 10""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(() -> InsertionSortPart1.Solution.main(new String[]{}));
        assertEquals(OUT, actual.strip());
    }

}