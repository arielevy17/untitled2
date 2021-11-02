import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("enter your second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        if (sum % 2 == 0){
            System.out.println("your sum is double!");
        }
        else {
            System.out.println("your sum is odd!");
        }
    }
}
