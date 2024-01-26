package Stack;

import java.util.ArrayList;

public class stack {

    static class Stack {

      static ArrayList<Integer> list = new ArrayList<>();

      public static Boolean isempty(){
         return list.size()==0;

      }
      //push

      public static void push(int data){
         list.add(data);
      }
     
      //pop
      public static int pop(){
         int top=list.get(list.size()-1);
         list.remove(list.size()-1);
         return top;
      }

      //peek
      public static int peek(){
         return list.get(list.size()-1);
      }
     
    }
    
    public static void main(String[] args) {
      Stack sh = new Stack();
      sh.push(1);
      sh.push(2);
      sh.push(3);
      
      while (!sh.isempty()) {
         System.out.println(sh.peek());
         sh.pop();
      }
      
    }
}
