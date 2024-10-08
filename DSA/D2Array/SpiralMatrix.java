package DSA.D2Array;

public class SpiralMatrix {
    public static void printSpiral(int nums[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = nums.length-1;
        int endcol = nums[0].length-1;
        while (startrow <= endrow && startcol <= endcol) {
            //top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(nums[startrow][j]+" ");
            }
            for (int i = startrow+1; i <= endrow; i++) {
                System.out.print(nums[i][endcol]+" ");
            }
            for (int j = endcol-1; j >= startcol; j--) {
                if(startrow==endrow){
                    break;
                    }

                System.out.print(nums[endrow][j]+" ");

            }
            for (int i = endrow-1; i >= startrow+1; i--) {
                if(startcol==endcol) {
                    break;
                }
                System.out.print(nums[i][startcol]+" ");
            }
            System.out.println();
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }

    public static void main(String[] args) {
        int nums[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(nums);
    }
}
