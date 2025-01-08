import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the next multiple of 100
        int nextMultipleOf100 = (number / 100 + 1) * 100;

        // If the number is already a multiple of 100, it should not move up
        if (number % 100 == 0) {
            nextMultipleOf100 = number; // If already a multiple of 100, output the number itself
        }

        // Output the result
        System.out.println("The next multiple of 100 is: " + nextMultipleOf100);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

    

