package second;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitsTransformer {

    public void transform() {
        Long number = getInputNumber();
        ArrayList<Long> digit = new ArrayList<>();
        while (number >= 10) {
            digit.add(number % 10);
            number /= 10;
        }
        digit.add(number);
        System.out.print("Your transformer number is: ");
        for (int i = digit.size() - 1; i >= 0; --i) {
            System.out.print(digit.get(i) + 1);
        }
    }

    private Long getInputNumber() {
        long inputNumber;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter any number: \n");
            inputNumber = scanner.nextLong();
        } catch (InputMismatchException ex) {
            throw new InputMismatchException("Invalid input. Please write a valid number.");
        }
        return inputNumber;
    }
}
