package Array___;

public class FindAllDuplicatesElement {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,4,5,6,7};
        int count=0;
        int dup[]=new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && dup[count-1]!=arr[i]){
                  dup[count++]=arr[i];
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(dup[i]+" ");
        }

    }
}
