import java.util.Scanner;

public class Ex5 {
    public static float employeeDetails(int salaryForHour, int employeeType, float numberOfHour, int numberOfArrivalsToDestination) {
        if (employeeType == 0) {
            salaryForHour = 50;
        }
        else if (employeeType == 1) {
            salaryForHour = 250;
        }
        else {
            System.out.println("Invalid number");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);