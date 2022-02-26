package lab18_2601;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputMismatch {
    public static void main(String[] args) {
        inputNum();
    }

    private static void inputNum() throws InputMismatchException {
        try {
            System.out.println("Please input two integers: ");
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("Sum: " + (num1 + num2));
            input.close();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input");
            inputNum();
        }
    }
}
