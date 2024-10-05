package Array___;

public class PrintGreatestElem {
    public static void main(String[] args) {
        int []arr={2,96,69,77,145,20};
        int max=arr[0];
        int index;
        for (int i = 1; i <arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
                index=i;

            }
        }
        System.out.println(max+" is greatest element in array");
    }
}
