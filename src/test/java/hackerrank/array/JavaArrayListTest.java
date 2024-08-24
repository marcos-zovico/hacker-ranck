package hackerrank.array;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void getXYPoint() {
        assertEquals(OUT, JavaArrayList.getXYPoint(getInput()));
    }

    private InputStream getInput() {
        return new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8));
    }

}