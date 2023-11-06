package java;
import java.util.Scanner;

public class pattern {
       

    public static void main(String[] args) {
        
        // for(int line=1; line<=4; line++){
        //     for(int star=1; star<=line; star++){
        //          System.out.print("*");
        //     }
        //    System.out.println();
        // }
         
         
        //inverted star pattern
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();

        // for(int lines=1; lines<=n; lines++){
        //     for(int star=1; star<=n-lines+1; star++){
        //              System.out.print("*");
        //     }
        //     System.out.println();
        // }

       
        //  int n=4;
        // for(int lines=1; lines<=n; lines++){
        //     for(int number=1; number<=lines; number++){
        //        System.out.print(number);
        //     }
        //     System.out.println();
        // }

        int n=4;
        char ch='A';
        for(int lines=1; lines<=n; lines++){
            for(int chara=1; chara<=lines; chara++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }



        
    }
}
 