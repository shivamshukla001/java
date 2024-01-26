
package arraylist;

import java.util.*;

public class operation {
    public static void swap(ArrayList<Integer> hero, int idx1, int idx2){
        int temp= hero.get(idx1);
        hero.set(idx1, hero.get(idx2));
        hero.set(idx2, temp);

    }

    public static void main(String[] args) {

        // ArrayList<Integer> hero = new ArrayList<>();

        // add operation(time complexity is O(1))

        // hero.add(1);
        // hero.add(6);
        // hero.add(9);
        // hero.add(8);
        // hero.add(2);
      
        // System.out.println(hero);


        //get operation(time complexity is O(1))

        // System.out.println(hero.get(4));
        // System.out.println(hero.get(3));


        //remove operation(time complexity is O(n))

    //    System.out.println(hero.remove(2));
    //    System.out.println(hero);

       //set operation(time complexity is O(n))

    //    hero.set(3, 11);
    //    System.out.println(hero);

       //contain operations(time complexity is O(n));

    //    System.out.println(hero.contains(1));
    //    System.out.println(hero.contains(12));

    //size operations

    // System.out.println(hero.size());
    // for(int i=0; i<hero.size(); i++){
    //     System.out.print(hero.get(i)+ " ");
    // }
    // System.out.println();


     //reverse operations(time complxity id O(n))

    //  for(int i=hero.size()-1; i>=0; i--){
    //     System.out.print(hero.get(i)+ "  ");
    //  }
    //  System.out.println();
    // }


    //find maximum
//      int max=Integer.MIN_VALUE;
//     for(int i=0; i<hero.size(); i++){
//     if(max<hero.get(i)){
//         max=hero.get(i);
//     }
//  }
//     System.out.println("maximun number is:"+ max);
    
    // //Swap 
    //  int idx1=1, idx2=3;
    //  System.out.println(hero);
    //  swap(hero, idx1, idx2);
    //  System.out.println(hero);
    }

}
