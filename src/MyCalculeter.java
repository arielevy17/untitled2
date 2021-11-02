import java.util.Scanner;

public class MyCalculeter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("enter your secend number: ");
            int secendNumber = scanner.nextInt();
            System.out.println("enter your third number: ");
            int thirdNumber = scanner.nextInt();
            int sum = firstNumber + secendNumber;
            System.out.println("the sum of your all number is: " + sum);
        }
}