import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int nextMultipleOf100 = (number / 100 + 1) * 100;
        if (number % 100 == 0) {
            nextMultipleOf100 = number;
        }
        System.out.println("The next multiple of 100 is: " + nextMultipleOf100);
        scanner.close();
    }
}

    

