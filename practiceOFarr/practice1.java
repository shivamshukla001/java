package practiceOFarr;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy" + marks[0]);
        System.out.println("chemistry " + marks[1]);
        System.out.println("math " + marks[2]);
  
        // marks[1] = marks[1] + 2;
        // System.out.println("chemistry" + marks[1]);
        
        int percentage=(marks[0]+marks[1]+marks[2])/3;

        System.out.println("percentage "+ percentage+"%");
    }
}
