package java;
import java.util.Scanner;

public class method{

   //  public static void calculate(int num1, int num2){
   //     int sum= num1+num2;
       
   //     System.out.println("sum is:"+sum);
   //  }

      //  public static int multiply(int a, int b){
      //    int product=a*b;
      //    return product;
      //  }



      //factorial of n number :-

      public static int factorial(int n){
         int f=1;

         for (int i = 1; i <=n; i++) {
             f = f * i;

             

         }
         return f;
      }



      //binomial cofficient

      public static int bin_coff(int n, int r){
            
         int fact_n=factorial(n);

         int fact_r=factorial(r);

         int fact_nmr=factorial(n-r);

         int binoialCoff= fact_n/(fact_r-fact_nmr);

         return binoialCoff;
      }




      //check number is prime or not (important question on interview purpose)

      public static boolean isprime(int n){
         boolean isprime=true;

         for(int i=2; i<=n-1; i++){
            if(n % i== 0){
               isprime=false;
               break;
            }
         }
         return isprime;
      }

     // give prime number to a certan range

     public static void primeInRange(int n){
      for(int i=2; i<=n; i++){
         if(isprime(i)){
            System.out.print(i+ "  ");
         }
      }
      System.out.println();
     }

     public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            // int a=sc.nextInt();
            // int b=sc.nextInt();
            // calculate(a,b);




            //   int prod= multiply(3, 4);
            //   System.out.println(prod);


          
            // int fac=factorial(4);
            // System.out.println(fac);



            // System.out.println(bin_coff(10, 4));
   


            // System.out.println(isprime(7));

            

            primeInRange(25);


     }
}