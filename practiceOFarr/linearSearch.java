package practiceOFarr;

public class linearSearch {
    public static int linearsrch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }

    // public static int lgstSearch(int arr[]){
    //   int largest=Integer.MIN_VALUE;
    //   for(int i=0; i<arr.length; i++){
    //     if (largest < arr[i]) {
    //         largest=arr[i];
    //     }
    //   }
    //  return largest;

    // }
    public static int largestSearch(int arr[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
          if (largest<arr[i]) {
            largest=arr[i];
          }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 6, 8, 1, 9 };
        int key = 6;

        int index = linearsrch(numbers, key);
        if (index == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("key found in the index of" + index);
        }


        // int arr[]={3,5,8,1,9,10};
        // int largest=lgstSearch(arr);
        // if (largest==-1) {
        //     System.out.println("key not found");
        // }else{
        //     System.out.println(largest);
        // }

        int arr[]={2,5,7,3,9,14};
        System.out.println(largestSearch(arr));
    

    }
}
