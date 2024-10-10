package Java1;

public class TailRecursion {

    // Tail recursion: Simple countdown
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Done!");
            return;  // Base case
        }
        System.out.println(n);
        countdown(n - 1);  // Tail-recursive call, no further operation after
    }

    public static void main(String[] args) {
        countdown(5);  // Starts countdown from 5
    }


}
