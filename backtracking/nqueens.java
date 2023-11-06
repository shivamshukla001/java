package backtracking;

public class nqueens {


    public static boolean issafe(char board[][], int row, int col){
        //vertical 
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }



        //left diagonal

        for(int i=row-1, j=col-1; i>=0  && j>=0; j--, i-- ){
         if(board[i][j]=='Q'){
            return false;
         }
        }


        //right diagonal
        for(int i=row-1, j=col+1;  i>=0 && j<board.length; i--,j++ ){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void queen(char[][]board,int row ){
        //base case
        if(row==board.length)
        {
          printboard(board);
          return;
        }

        //column loop
        for(int j=0; j<board.length; j++){
             if(issafe(board, row,j))
       {
           board[row][j]='Q';
           queen(board, row+1);//function call
           board[row][j]='X';//backtracking
       }
        }
    }
    public static void printboard(char[][]board){
        System.out.println("-----------chess board-------");
      for(int i=0; i<board.length; i++){
        for(int j=0; j<board.length; j++){
            System.out.print(board [i] [j] + " ");
        }
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='x';
            }
        }
      queen(board, 0);
    }
}
