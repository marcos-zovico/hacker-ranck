package hackerrank.algorithms.strings;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BeautifulBinaryStringTest {

    @Test
    void runCase0() throws Exception {
        String in = """
                7
                0101010""";

        System.setIn(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8)));

        String actual = tapSystemOut(() -> BeautifulBinaryString.Solution.main(new String[]{}));
        assertEquals("2", actual.strip());
    }

    @Test
    void runCase1() throws Exception {
        String in = """
                5
                01100""";

        System.setIn(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8)));

        String actual = tapSystemOut(() -> BeautifulBinaryString.Solution.main(new String[]{}));
        assertEquals("0", actual.strip());
    }

    @Test
    void runCase2() throws Exception {
        String in = """
                10
                0100101010""";

        System.setIn(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8)));

        String actual = tapSystemOut(() -> BeautifulBinaryString.Solution.main(new String[]{}));
        assertEquals("3", actual.strip());
    }
}