package NQT;

public class TwoPointersforFindDistinctElem {
    public static void main(String[] args) {
        int i = 0;

        int arr[] = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        for (int j = 0; j < arr.length; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        for (int j = 0; j <= i; j++) {
            System.out.println(arr[j]);
        }
    }
}
