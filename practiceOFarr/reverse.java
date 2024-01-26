package practiceOFarr;

import java.first;

public class reverse {
    // public static void revrse(int number[]){
    //     int first=0;
    //     int end=number.length-1;

    //      while (first < end) {
    //         int temp = number[end];
    //         number[end]=number[first];
    //         number[first]=temp;

    //         first++;
    //         end--;
    //      }
    // }

  public static void ulta(int number[]){
    int start=0;
    int end=number.length-1;

    while (start<end) {
        int temp=number[end];
        number[end]=number[start];
        number[start]=temp;

        start++;
        end--;

    }

  }
    
    public static void main(String[] args) {
        int [] number={1,3,5,7,9,20};
        ulta(number);

        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");

        }
        

    }
}
