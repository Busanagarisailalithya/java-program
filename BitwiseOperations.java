import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;

        System.out.println("\nBitwise Operation Results:");
        System.out.println("----------------------------");
        System.out.println("First number  (binary): " + Integer.toBinaryString(num1));
        System.out.println("Second number (binary): " + Integer.toBinaryString(num2));

        System.out.println("\nAND  (&) result: " + andResult + " (binary: " + Integer.toBinaryString(andResult) + ")");
        System.out.println("OR   (|) result: " + orResult + " (binary: " + Integer.toBinaryString(orResult) + ")");
        System.out.println("XOR  (^) result: " + xorResult + " (binary: " + Integer.toBinaryString(xorResult) + ")");

        scanner.close();
    }
}
