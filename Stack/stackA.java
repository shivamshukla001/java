package Stack;

import java.util.ArrayList;

public class stackA {
    static class Stack {
        static ArrayList<Integer> sh = new ArrayList<>();

        // isEmpty()
        public static boolean isEmpty() {
            return sh.size() == 0;
        }
        
        // push
        public static void push(int data) {
            sh.add(data);
        }
        
        // pop
        public static int pop(int data) {
            int top = sh.get(sh.size() - 1);
            sh.remove(sh.size() - 1);
            return top;

        }
        
        // peak
        
        public static int peak() {
            return sh.get(sh.size() - 1);
        }
    }
         
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peak());
             s.pop();

        }

    }
}