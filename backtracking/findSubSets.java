package backtracking;

public class findSubSets {

    public static void findSets(String str, int i, String ans){
      //basecase
      if(i==str.length())
      {
       if(str.length()==0){
        System.out.println("null");
       }else
       {
        System.out.println(ans);
       }
       return;
      }


      //work
    //yes choice
    findSets(str, i+1, ans+str.charAt(i));
    
    //no choice
    findSets(str, i+1, ans);


    }
    public static void main(String[] args) {
        
      String str="abc";
      findSets(str, 0, " ");
    }
}
