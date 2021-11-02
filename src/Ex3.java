import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("enter your second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("enter your third number:");
        int thirdNumber = scanner.nextInt();
        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.print(firstNumber+ ","+ secondNumber+ ","+ thirdNumber);
        }
        else if (firstNumber > thirdNumber && thirdNumber > secondNumber) {
            System.out.print(firstNumber+","+thirdNumber+","+secondNumber);
        }
        else if (secondNumber > firstNumber && firstNumber > thirdNumber){
            System.out.println(secondNumber+","+firstNumber+","+thirdNumber);
        }
        else if (thirdNumber > firstNumber && firstNumber > secondNumber) {
            System.out.println(thirdNumber+","+firstNumber+ "," +secondNumber);
        }
        else if (thirdNumber > secondNumber && secondNumber > firstNumber) {
            System.out.println(thirdNumber+","+secondNumber+"," +firstNumber);
        }
        else {
            System.out.println(secondNumber+ "," +thirdNumber +","+ firstNumber);
        }
    }
}
