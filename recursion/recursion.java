package recursion;

public class one {
    public static void printdec(int n){
        //basecase
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
      
    }

    public static void printInc(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }

    public static int fact(int n){
        //base case
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn =n * fact(n-1);
        return fn;
    }

    public static int sum(int n){
          if(n==1){
            return 1;
          }
        int snm1= sum(n-1);
        int sn=n+snm1;
        return sn;
    }

    public static int fib(int n){

        //base case
        if(n==0 || n==1){
            return n;
        }

        int fnm1= fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }


    public static int firstocc(int[]arr, int key, int i){
        //basecase
        if(arr[i]==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
         return firstocc(arr, key, i+1);


    }

    public static void main(String[] args) {
        // int n=10;
        
        // printdec(n);

        // printInc(10);

        // System.out.println(fact(5));

        // System.out.println(sum(5));
        // System.out.println(fib(7));
        int arr[]={1,4,2,6,8,3,9,3,7,1};

        System.out.println(firstocc(arr, 7, 0));
    }
}
