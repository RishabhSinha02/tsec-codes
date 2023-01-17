import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffRead {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first integer: ");
        int num1 = Integer.parseInt(reader.readLine());

        System.out.print("Enter second integer: ");
        int num2 = Integer.parseInt(reader.readLine());

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (double)(num1 + num2) / 2;
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Extracting digits of num1
        System.out.print("Digits of num1: ");
        while (num1 > 0) {
            System.out.print(num1 % 10 + " ");
            num1 = num1 / 10;
        }
        System.out.println();

        // Extracting digits of num2
        System.out.print("Digits of num2: ");
        while (num2 > 0) {
            System.out.print(num2 % 10 + " ");
            num2 = num2 / 10;
        }
    }
}
