package NQT;

import java.util.ArrayList;
import java.util.Scanner;

public class Input4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers (enter any non-integer to terminate):");

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                list.add(number);
            } else {
                // If the input is not an integer, terminate the loop
                System.out.println("Non-integer input detected. Terminating...");
                break;
            }
        }

        System.out.println("Input list: " + list);
    }
}

