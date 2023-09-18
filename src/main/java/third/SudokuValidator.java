package third;

import java.util.Collection;
import java.util.List;

public class SudokuValidator {
    public boolean validateSudoku(List<List<Integer>> sudoku) {
        int rowCount = sudoku.size();
        int totalNumbers = (int) sudoku.stream()
                                       .mapToLong(Collection::size)
                                       .sum();

        if (rowCount < 1 || rowCount * rowCount != totalNumbers) {
            return false;
        }

        for (List<Integer> row : sudoku) {
            if (row.size() != rowCount) {
                return false;
            }
            List<Integer> distinctNumbers = row.stream()
                                               .distinct()
                                               .toList();
            if (distinctNumbers.size() != rowCount) {
                return false;
            }
        }
        return true;
    }
}
