import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you? :");
        int age = scanner.nextInt();
        if(age>0 && age<18){
            System.out.println("You can't buy alcohol");
        }
        else if(age<=0){
            System.out.println("Please enter a valid value");
        }
        else {
            System.out.println("Thank's for shopping");
        }
    }
}
