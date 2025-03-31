public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 35;  // Adjust n for performance test
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
