public class linearSearch {

    public static String linrSearch(String fruits[], String key){
        for(int i=0; i<=fruits.length; i++){
            if(fruits[i]==key){
                System.out.println(fruits[i]);
            
            }
        }
        System.out.println("not found");
        
    }

    public static int linrsrch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
            

    }
    return -1;
    }

    public static int getLargest(int[]number){
        int Largest=Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(Largest<number[i]){
                 Largest=number[i];
            }
            
        }
        return Largest;
    }
    
    public static void main(String[] args) {
        
       

         

        
        int number[]={1,5,8,3,9,2};
        int key=3;

        int index=linrsrch(number, key);
        if (key== -1) {
            System.out.println("not found");
        }else{
            System.out.println("given key is found in:" + index);
        }

        int number[]={1,2,3,4,6,8,9};

        System.out.println("largest number is:"+getLargest(number));


    }
}
