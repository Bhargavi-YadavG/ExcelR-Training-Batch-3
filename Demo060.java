public class Demo060 {
    public static void printFibonacci(int n) {
        long a = 0, b = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        int n = 20;
        printFibonacci(n);
    }
}

