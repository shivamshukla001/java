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


       

       
    }
 }