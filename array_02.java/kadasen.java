public class kadasen {
   
    public static void kadasen1(int[]number){
      
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0; i<number.length; i++){
            cs=cs+number[i];
            if(cs<0){
                cs = 0;
            }
            ms=Math.max(cs, ms);
        }

        System.out.println(ms);
    }
    
    public static void main(String[] args) {
        int number[]={-3,-2,4,-1,-2,1,5,-3};
        kadasen1(number);


    }
}
