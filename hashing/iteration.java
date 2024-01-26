package hashing;

import java.util.*;

public class iteration {

    public static void main(String[] args) {

        // we can iterate in hashmap by 2 ways
        // 1 is keySet()- 0(1)
        // 2nd is entryset()- 0(1)

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 20);
        hm.put("us", 40);
        hm.put("japan", 80);
        hm.put("america", 19);
        hm.put("taiwan", 45);

        // System.out.println(hm);

        Set<String> keys = hm.keySet();

        for (String k : keys) {

            System.out.println("key=" + k + ",value " + hm.get(k));
        }

        System.out.println(hm.entrySet());

    }

}
