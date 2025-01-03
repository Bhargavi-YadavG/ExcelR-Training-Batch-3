 import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Get user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Clear the buffer (because nextInt() doesn't consume the newline character)
        scanner.nextLine();
        
        // Get user's phone number
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        
        // Output the user's information
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        
        // Close the scanner
        scanner.close();
    }
}
