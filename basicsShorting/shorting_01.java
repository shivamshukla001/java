

package basicsShorting;

import java.lang.reflect.Array;
import java.util.*;

public class shorting_01 {
    

    // //helper array
    public static void printarr(int[] arr){
        for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
      


     public static void bubbleShort(int []arr){
         
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    
     }


     public static void selectionShort(int[]arr){
        for(int i=0; i<arr.length-1; i++){
            int minpos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap

            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
     }
      

    //  public  static void insertinShort(int[]arr){
    //     for(int i=1; i<arr.length; i++){
    //         int curr=arr[i];
    //         int prev=i-1;
    //         while(prev >= 0 && arr[prev] > curr){
    //          arr[prev+1]= arr[prev];
    //          prev--;
    //         }
    //         //insertion
        //    arr[prev+1]= curr;

        }
        

     
    //  }

    public static void main(String[] args) {
        Integer arr[]={1,9,4,2,8};
        // printarr(arr);
        

        // //bubbleShort 
        // bubbleShort(arr);
        // printarr(arr);


        //selectionShort
        // selectionShort(arr);
        // printarr(arr);


        //insertionShort
        // insertinShort(arr);
        // printarr(arr);


        //inbuilt method
        Arrays.sort(null, 0, 0, null);



    }
}
