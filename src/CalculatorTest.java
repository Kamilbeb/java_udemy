import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Calculator--------");
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("What math operation do you want to perform");
        System.out.print("0-exit, 1-add, 2-sub, 3-multi, 4-div ? :");
        int chNumber = scanner.nextInt();
        Calculator result = new Calculator();

            if (chNumber == 1) {

                System.out.println("Result: " + result.addNumbers(firstNumber,secondNumber));

            } else if (chNumber == 2) {
                System.out.println("Result: " + result.subNumbers(firstNumber,secondNumber));

            } else if (chNumber == 3) {
                System.out.println("Result: " + result.multiNumbers(firstNumber,secondNumber));

            } else if (chNumber == 4) {
                System.out.println("Result: " + result.divNumbers(firstNumber,secondNumber));

            } else {
                System.out.println("Choose from available operations");
        }
    }
}
