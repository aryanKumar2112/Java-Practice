package Array___;

public class ForEachLoop {
    public static void main(String[] args) {
        int arr[]={45,66,77,88,90};
      /*  for(int element :arr){
            System.out.println(element);
        }*/
       /* int sum=0;
        for(int elements :arr){
            sum=sum+elements;
        }
        System.out.println(sum);*/
        int n=66;
        boolean isInArray=false;
        for(int element :arr){
            if(n==element){
                isInArray=true;
            }
        }
        if(isInArray){
            System.out.println("the number n is in array");
        }
        else
            System.out.println("The number is not in array");
    }
}
