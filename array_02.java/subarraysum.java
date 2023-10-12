public class subarraysum {
     public static void sumsubarray(int[]number){
        int curr=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
             for(int j=i+1; j<number.length; i++){
                curr=0;
                for(int k=i; k<=j; k++){
                    curr+=number[k];
                }

             }
             System.out.println(curr);
             if(curr>maxsum){
               curr=maxsum;

             }
        }
     
        System.out.println(maxsum);
     } 
     

    public static void main(String[] args) {
         int number[]={1,2,3,5,7,9};

         sumsubarray(number);
    }
}
