package divideAndConquror;

public class mergeSort {

    public static void printarray(int []arr){
        for (int i=0; i<arr.length; i++){
          System.out.println(arr[i]+ " "); 
        }
    }

    public static void mergesort(int[] arr, int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // work
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);

    }

    public static void merge(int[] arr, int si, int ei, int mid) {
        int[] temp = new int[ei - si + 1];
        int i = si;       // iterator for left

        int j = mid + 1;   //iterator for right


        int k = 0;  //iterator for temp arr


        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
         

        //left part
        while(i<=mid)
        {
         temp[k++]=arr[i++];
        }
        //right part

        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }

        //cop temp arr into original arr
        for(k=0, i=si; k<temp.length; k++, i++){
          arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        mergesort(arr, 0, arr.length-1);
        printarray(arr);


    }
}
