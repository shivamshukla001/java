package backtracking;

public class gridways {

    public static int grid(int i, int j, int n, int m){
     //base case
     if( i==n-1 && j==m-1){
        return 1;
     }else if(i==n || j==m){
        return 0;
     }

        //work
        int w1=grid(i+1, j, n, m);
        int w2=grid(i, j+1, n, m);
        return w1+w2;
    }
    
    public static void main(String[] args) {
        int n=4, m=4;

        System.out.println(grid(0, 0, n, m));


    }
}
