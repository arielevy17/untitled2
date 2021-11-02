import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number:");
        int yourNumber = scanner.nextInt();
        if (yourNumber < 0){
            System.out.println("your absolut number is: " + yourNumber*(-1));
        }
        else {
            System.out.println("your absolut number is: " + yourNumber);
        }
    }
}
