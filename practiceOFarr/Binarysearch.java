package practiceOFarr;

public class Binarysearch {
    // public static int binrserch(int number[], int key){
    //     int start=0;
    //     int end=number.length-1;

    //     while (start <= end) {
    //         int mid=(start+end)/2;
    //         if (number[mid] == key) {
    //             return mid;
    //         }
    //         if (number[mid] < key)
    //         {
    //             start=mid+1;
    //         }
    //         else 
    //         {
    //          end=mid-1;
    //         }
    //     }
    //     return -1;
    // }


    public static int searchbinry(int[]arr,int key){
        int start =0; 
        int end= arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if (arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key){
            start=mid+1;
            }else{
                end=mid-1;
            }
        }
      return -1;
    }
    
    public static void main(String[] args) {
        // int number[]={2,4,5,7,9,20};
        // int key = 90;


        int arr[]={2,4,6,8,10,45};
        int key=8;

        System.out.println(searchbinry(arr, key));

    //    System.out.println(binrserch(number, key));
    }
}
