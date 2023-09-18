package second;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTransformerTest {
    private static final String MOCK_INPUT_NUMBER = "92345\n";
    private static final String INVALID_MOCK_INPUT_DATA = "abc\n";
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final InputStream originalSystemIn = System.in;
    private final PrintStream originalSystemOut = System.out;
    private final DigitsTransformer transformer = new DigitsTransformer();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }

    @Test
    public void testTransformWithNumber() {
        System.setIn(new ByteArrayInputStream(MOCK_INPUT_NUMBER.getBytes()));

        transformer.transform();
        String output = outputStream.toString().trim();
        assertEquals("Enter any number: \nYour transformer number is: 103456", output);
    }

    @Test
    public void testTransformNegative() {
        System.setIn(new ByteArrayInputStream(INVALID_MOCK_INPUT_DATA.getBytes()));

        assertThrows(InputMismatchException.class, transformer::transform);
    }
}