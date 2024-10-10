package Java1;

public class LinearRecursion {

    // Linear recursion: Factorial calculation
    public static int factorial(int n) {
        if (n == 1) {
            return 1;  // Base case
        }
        return n * factorial(n - 1);  // Recursive call with linear structure
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }


}
