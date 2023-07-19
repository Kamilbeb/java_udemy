import java.util.Scanner;

public class Calculator {
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

            if (chNumber == 1) {
                int addResult = firstNumber + secondNumber;
                System.out.println("Addition result: " + addResult);

            } else if (chNumber == 2) {
                int subResult = firstNumber - secondNumber;
                System.out.println("Substraction result: " + subResult);

            } else if (chNumber == 3) {
                int multiResult = firstNumber * secondNumber;
                System.out.println("Multiplication result: " + multiResult);

            } else if (chNumber == 4) {
                int divResult = firstNumber / secondNumber;
                System.out.println("Division result: " + divResult);

            } else {
                System.out.println("Choose from available operations");
        }
    }
}
