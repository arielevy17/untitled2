import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 'a' (the coefficient of X ^ 2):");
        int a = scanner.nextInt();
        System.out.println("Enter your b (the coefficient of X):");
        int b = scanner.nextInt();
        System.out.println("Enter your c (the free number):");
        int c = scanner.nextInt();
        double enser1 = ((b*-1) + Math.sqrt((Math.pow(b,2)) - 4*a*c))/ (2*a);
        double enser2 = ((b*-1) - Math.sqrt((Math.pow(b,2)) - 4*a*c)) / (2*a);
        if (enser1 == enser2) {
            System.out.println("there is just one answer: " + enser1);
        }
        else if (enser1 != enser2 && Math.sqrt((Math.pow(b,2)) - 4*a*c) < 0) {
            System.out.println("there is two answer: " + enser1 + "," + enser2);
        }
        else {
            System.out.println("there is no answer!");
        }

    }

}
