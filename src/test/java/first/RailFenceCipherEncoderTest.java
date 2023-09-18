package first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RailFenceCipherEncoderTest {
    private static final String MESSAGE = "WEAREDISCOVEREDFLEEATONCE";
    private static final String EMPTY_MESSAGE = "";
    private static final Integer VALID_RAILS = 3;
    private static final Integer INVALID_RAILS = 1;
    private final RailFenceCipherEncoder encoder = new RailFenceCipherEncoder();

    @Test
    void encodeAndDecodeIsOk() {
        String encoded = encoder.encode(MESSAGE, VALID_RAILS);
        String decoded = encoder.decode(encoded, VALID_RAILS);
        assertEquals(MESSAGE, decoded);
    }

    @Test
    void encodeWithInvalidRailsIsOk() {
        String encoded = encoder.encode(MESSAGE, INVALID_RAILS);
        assertEquals(EMPTY_MESSAGE, encoded);
    }

    @Test
    void decodeWithInvalidRailsIsOk() {
        String decoded = encoder.decode(MESSAGE, INVALID_RAILS);
        assertEquals(EMPTY_MESSAGE, decoded);
    }

    @Test
    void encodeWithEmptyMessageIsOk() {
        String encoded = encoder.encode(EMPTY_MESSAGE, VALID_RAILS);
        assertEquals(EMPTY_MESSAGE, encoded);
    }

    @Test
    void decodeWithEmptyMessageIsOk() {
        String decoded = encoder.decode(EMPTY_MESSAGE, VALID_RAILS);
        assertEquals(EMPTY_MESSAGE, decoded);
    }
}
