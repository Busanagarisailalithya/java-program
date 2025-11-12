import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        // Find the largest number
        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        // Display the result
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
