package practiceOFarr;

public class parsOFarr {
    public static void sbary(int number[]){
        for(int i=0; i<number.length-1; i++){
            int current=number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("("+current+","+ number[j]+")");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int number[]={2,3,4,6,8,9};
         sbary(number);

    }
}
