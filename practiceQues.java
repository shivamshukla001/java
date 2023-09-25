/*
 * Question1: Inaprogram,input3numbers:A,B and C.You have to output the average of these 3 numbers.(Hint : Average of N numbers  
 *  is sum  of those numbers divided by N)
 * 
 * Question2: In a program,input the side of a square.You have to output the area of the square.(Hint : area of a square is (side 
 *  x side))
 * 
 * 
 * Question3:Enter cost of 3 items from the user(using float data type)-a pencil,a pen and an eraser. You have to output the  
 *  total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the   bill  as  advanced problem)
 * 
 */

import java.util.Scanner;

public class practiceQues{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("average is:"+ avg);


        int side=sc.nextInt();
        int ans=side*side;
        System.out.println("Area of square is:"+ ans);


       float pencil=sc.nextInt();
       float pen=sc.nextInt();
       float eraser=sc.nextInt();
       float total=(pencil+pen+eraser);

       System.out.println(total);

       //with gst

       float newTotal=total+(0.18f*total);

       System.out.println("the bil is:"+ newTotal);

    int x, y, z;
    x = y = z = 2;
    x += y;
    y -= z;
    z /= (x + y);
    System.out.println(x + " " + y + " " + z);
       


    int x = 200,
    
    y = 50, z = 100;
    if(x > y && y > z){
        System.out.println("Hello");
    }
       if(z > y && z < x){
        System.out.println("Java");
    }
       if((y+200) < x && (y+150) < z){
        System.out.println("Hello Java");
       }

    int x = 9,
     y = 12;
     int a = 2, b = 4, c = 6;
     int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
     System.out.println(exp);
       


    int x = 10, y = 5;
    int exp1 = (y * (x / y + x / y));
    int exp2 = (y * x / y + y * x / y);
    System.out.println(exp1);
    System.out.println(exp2);
    }
 }