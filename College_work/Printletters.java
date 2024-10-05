package College_work;

import java.util.Arrays;

public class Printletters {
    public static void main(String[] args) {
//
      int arr[]={4,8,2,5,19,23};
      int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[i];

        }
        System.out.println(min);



        }
}
