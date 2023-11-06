package recursion;

public class two {
    public static int tilingProb(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //work
        //virtical 
        int fnm1=tilingProb(n-1);
        
        //horozontal
        int fnm2=tilingProb(n-2);

        int totalWays=fnm1+fnm2;
        return totalWays;
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        //basecase
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        //work
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            if(map[currChar-'a']= true){
                removeDuplicate(str, idx+1, newStr.append(currChar), map);
            }
        }
    }
    public static void main(String[] args) {
        //  System.out.println(tilingProb(5));
        String str="aapnnacollege";
        // System.out.println(removeDuplicate(null, 0, null, null););
         removeDuplicate(str, 0, new StringBuilder(""),new boolean[26]);
    }
}
