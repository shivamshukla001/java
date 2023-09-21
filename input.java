import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();

        // System.out.println("value of a is:"+ a );
        
        // float fc=sc.nextFloat();
        // System.out.println("the value of float is:"+fc);

        String name=sc.nextLine();
        System.out.println("the name of author is:"+ name);

        boolean bool=sc.nextBoolean();
        System.out.println("the value of boolean is"+bool);

        short sh=sc.nextShort(10);
        System.out.println(sh);

        

    }
}