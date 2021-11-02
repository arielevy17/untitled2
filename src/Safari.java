import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int safariCloseTime = 20;
        int safariOpenHour = 10;
        System.out.println("enter your visit hour: ");
        int myVisitHour = scanner.nextInt();
        if (myVisitHour > safariCloseTime || myVisitHour < safariOpenHour) {
            System.out.println("the safari is close now!");
        } else if (myVisitHour >= safariOpenHour && myVisitHour < safariCloseTime) {
            System.out.println("your time left is: " + (safariCloseTime - myVisitHour) + " hours");
        } else {
            System.out.println("You entered an invalid character or an incomplete number!");
        }
    }
    }

