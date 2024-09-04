package hackerrank.algorithms.sorting;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertionSortPart2Test {

    @Test
    void runCase1() throws Exception {
        String IN = """
                6
                1 4 3 5 6 2""";

        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));

        String actual = tapSystemOut(() -> InsertionSortPart2.Solution.main(new String[]{}));

        String OUT = """
                1 4 3 5 6 2
                1 3 4 5 6 2
                1 3 4 5 6 2
                1 3 4 5 6 2
                1 2 3 4 5 6""";

        assertEquals(OUT, actual.strip());
    }

    @Test
    void runCase2() throws Exception {
        String IN = """
                7
                3 4 7 5 6 2 1""";

        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));

        String actual = tapSystemOut(() -> InsertionSortPart2.Solution.main(new String[]{}));

        String OUT = """
                3 4 7 5 6 2 1
                3 4 7 5 6 2 1
                3 4 5 7 6 2 1
                3 4 5 6 7 2 1
                2 3 4 5 6 7 1
                1 2 3 4 5 6 7""";

        assertEquals(OUT, actual.strip());
    }

}