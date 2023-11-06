package java;
import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("value of a is:"+ a );
        
        float fc=sc.nextFloat();
        System.out.println("the value of float is:"+fc);

        String name=sc.nextLine();
        System.out.println("the name of author is:"+ name);

        boolean bool=sc.nextBoolean();
        System.out.println("the value of boolean is"+bool);

        short sh=sc.nextShort(10);
        // System.out.println(sh);

        
        int a=sc.nextInt();
        int b=sc.nextInt();

        int product=a*b;
        System.out.println("the product of two value is :"+product);

        //A=πr2
        

        // System.out.println("the value of pi is:");
        float rad=sc.nextFloat();
        float area=3.14f*rad*rad;
        System.out.println("the area of circle is:"+ area);
    }
}