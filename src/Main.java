import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        do {
            int n = rand.nextInt(41) + 1; // Generate a random number between 1 and 41
            System.out.println("Randomly generated n: " + n);
            System.out.println("Fibonacci number at position " + n + ": " + fibonacci(n));
        } while (true);

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
