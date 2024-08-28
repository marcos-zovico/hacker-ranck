package hackerrank.java.datastructures;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaPriorityQueueTest {

    private static final String IN = """
            12
            ENTER John 3.75 50
            ENTER Mark 3.8 24
            ENTER Shafaet 3.7 35
            SERVED
            SERVED
            ENTER Samiha 3.85 36
            SERVED
            ENTER Ashley 3.9 42
            ENTER Maria 3.6 46
            ENTER Anik 3.95 49
            ENTER Dan 3.95 50
            SERVED""";

    private static final String OUT = """
            Dan
            Ashley
            Shafaet
            Maria""";

    @BeforeAll
    static void setup() {
        System.setIn(new ByteArrayInputStream(IN.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void runCode() throws Exception {
        String actual = tapSystemOut(JavaPriorityQueue::runCode);
        assertEquals(OUT, actual.strip());
    }

}