package arraylist;
import java.util.ArrayList;

public class containWater {


  
    //brute force(time complexity O(n^2))
    // public static int StoreWater(ArrayList<Integer> Container){
    //       int maximum=0;  
    //     for(int i=0; i<Container.size(); i++){
    //         for(int j=i+1; j<Container.size(); j++){
    //           int ht=Math.min(Container.get(i), Container.get(j));
    //           int width=j-i;
    //           int currSurface=ht*width;
    //           maximum=Math.max(maximum, currSurface);

    //         }
    //     }
    //     return maximum;
    // }
   
     //2 pointer approach(time complexity is O(n)
    public static int StoreWater(ArrayList<Integer> Container){
      int max=0;
      int lp=0;
      int rp=Container.size()-1;

      while(lp < rp){
        int ht=Math.min(Container.get(rp),Container.get(lp));
         int width = rp-lp;
         int currlist=ht*width;
         max=Math.max(max,currlist);
      
      if (Container.get(lp) < Container.get(rp)) {
         lp++;
      }else{
        rp--;
      }
    }
      return max;
    }
  

     public static void main(String[] args) {
        ArrayList<Integer> Container = new ArrayList<>();

        Container.add(1);
        Container.add(8);
        Container.add(6);
        Container.add(2);
        Container.add(5);
        Container.add(4);
        Container.add(8);
        Container.add(3);
        Container.add(7);

         System.out.println(StoreWater(Container) );
     }
}
