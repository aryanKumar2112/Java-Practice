package College_work;

public class MaxSubArray {
    public static void subArray(int numbers[]){
        int sum=0;
        int maxSum=0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];

                }
                if (sum>maxSum){
                    maxSum=sum;

                }
                System.out.println();

                sum=0;

            }



        }
        System.out.println("maximum sum of sub array is "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subArray(numbers);
    }
}
