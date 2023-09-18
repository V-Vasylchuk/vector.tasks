package third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SudokuValidatorTest {
    private final SudokuValidator validator = new SudokuValidator();

    @Test
    void testValidSudoku4x4() {
        List<List<Integer>> validSudoku = new ArrayList<>();
        validSudoku.add(Arrays.asList(1, 2, 3, 4));
        validSudoku.add(Arrays.asList(3, 4, 2, 1));
        validSudoku.add(Arrays.asList(4, 1, 3, 2));
        validSudoku.add(Arrays.asList(2, 3, 1, 4));

        assertTrue(validator.validateSudoku(validSudoku));
    }

    @Test
    void testInvalidSudoku4x4() {
        List<List<Integer>> invalidSudoku = new ArrayList<>();
        invalidSudoku.add(Arrays.asList(1, 2, 2, 4));
        invalidSudoku.add(Arrays.asList(3, 4, 2, 1));
        invalidSudoku.add(Arrays.asList(4, 1, 3, 2));
        invalidSudoku.add(Arrays.asList(2, 3, 1, 4));

        assertFalse(validator.validateSudoku(invalidSudoku));
    }

    @Test
    void testValidSudoku9x9() {
        List<List<Integer>> validSudoku = new ArrayList<>();
        validSudoku.add(Arrays.asList(5, 3, 4, 6, 7, 8, 9, 1, 2));
        validSudoku.add(Arrays.asList(6, 7, 2, 1, 9, 5, 3, 4, 8));
        validSudoku.add(Arrays.asList(1, 9, 8, 3, 4, 2, 5, 6, 7));
        validSudoku.add(Arrays.asList(8, 5, 9, 7, 6, 1, 4, 2, 3));
        validSudoku.add(Arrays.asList(4, 2, 6, 8, 5, 3, 7, 9, 1));
        validSudoku.add(Arrays.asList(7, 1, 3, 9, 2, 4, 8, 5, 6));
        validSudoku.add(Arrays.asList(9, 6, 1, 5, 3, 7, 2, 8, 4));
        validSudoku.add(Arrays.asList(2, 8, 7, 4, 1, 9, 6, 3, 5));
        validSudoku.add(Arrays.asList(3, 4, 5, 2, 8, 6, 1, 7, 9));

        assertTrue(validator.validateSudoku(validSudoku));
    }

    @Test
    void testInvalidSudoku9x9() {
        List<List<Integer>> invalidSudoku = new ArrayList<>();
        invalidSudoku.add(Arrays.asList(5, 3, 4, 6, 7, 8, 9, 1, 2));
        invalidSudoku.add(Arrays.asList(6, 7, 2, 1, 9, 5, 3, 4, 8));
        invalidSudoku.add(Arrays.asList(1, 9, 8, 3, 4, 2, 5, 6, 7));
        invalidSudoku.add(Arrays.asList(8, 5, 9, 7, 6, 1, 4, 2, 3));
        invalidSudoku.add(Arrays.asList(4, 2, 6, 8, 5, 3, 7, 9, 1));
        invalidSudoku.add(Arrays.asList(7, 1, 3, 9, 2, 4, 8, 5, 6));
        invalidSudoku.add(Arrays.asList(9, 6, 1, 5, 3, 7, 2, 8, 4));
        invalidSudoku.add(Arrays.asList(2, 8, 7, 4, 1, 9, 6, 3, 5));
        invalidSudoku.add(Arrays.asList(3, 4, 5, 2, 8, 6, 1, 7, 3));

        assertFalse(validator.validateSudoku(invalidSudoku));
    }
}
