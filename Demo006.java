import java.util.Scanner;
public class UserInfo {
    public static void main(String[] args) {
        String Name;
        int Age;
        long PhoneNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter ur Name");
        Name = sc.nextLine();
        System.out.println("plz enter ur Age");
        Age = sc.nextInt();
        System.out.println("plz enter ur PhoneNumber");
        PhoneNumber = sc.nextLong();
        System.out.println("Hello" +Name+ "ur Age is" +Age+ "ur PhoneNumber is" +PhoneNumber);
    }
    
}
