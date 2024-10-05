package DSA.Backtracking;

public class NQueens {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for (int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag left up
        for (int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diag right up
        for (int i=row-1,j=col+1;i>=0 && j< board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        //base
        if(row== board.length){
            printBoard(board);
            count++;
            return;
        }
        //column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'x';
            }
        }
    }
       public static void printBoard(char bord[][]){
           System.out.println("----------chess board-----------");
           for (int i = 0; i < bord.length; i++) {
               for (int j = 0; j < bord.length; j++) {
                   System.out.print(bord[i][j]+" ");
               }
               System.out.println( );
           }
       }
        static int count=0;

    public static void main(String[] args) {
        count=0;//reset count
        int n=5;
        char board[][]=new char[n][n];
        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='x';
            }
        }
        nQueens(board,0);
        System.out.println("total ways to solve n queens = "+count);
    }
}