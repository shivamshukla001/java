package java;
/*
 * Question1:Write a Java program to get a number from the user and print whether it is positive or negative
 * 
 * Question2: Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints 
 *  You don't have a fever.
 * 
 * Question5:Write a Java program that takes a year from the user and print whether that year is a leap year or not
 */
 import java.util.*;

 public class conditions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //Question 1
        // int x=sc.nextInt();
        // if(x%2==0){
        //   System.out.println(x + " is a positive number");
        // }
        // else{
        //     System.out.println("given number is negative type");
        // }

        //Question2

        // double fever = sc.nextDouble();
        // if(fever>=100){
        //   System.out.println("you have a high fever");
        // }else{
        //     System.out.println("you are normal");
        // }
        
        //Question 5

        int year=sc.nextInt();

        if(year%4==0){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }
        
    }
 }