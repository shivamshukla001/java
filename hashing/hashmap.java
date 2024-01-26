
package hashing;

import java.util.*;

public class hashmap {

    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hp = new HashMap<>();

        // insert-0(1)
        hp.put("tea", 20);
        hp.put("samosa", 30);
        hp.put("magii", 45);

        System.out.println(hp);

        // // get-0(1)
        // System.out.println(hp.get("samosa"));

        // // contains-0(1)
        // System.out.println(hp.containsKey("magii"));
        // System.out.println(hp.containsKey("chai"));

        // // remove-0(1)
        // System.out.println(hp.remove("magii"));

        // System.out.println(hp);

        //size
         System.out.println(hp.size());


         //is Empty
         hp.clear();
         System.out.println(hp.isEmpty());
         System.out.println(hp);

    }

}
