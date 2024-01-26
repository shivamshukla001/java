package linkedlist;

import linkedlist.LinkedList.Node;
import java.util.LinkedList;


public class LinkedListZ {
    public static Node head;


    public void print() {
        if (head == null) {
          System.out.println("ll is empty");
          return;
        }
        Node temp = head;
        while (temp != null) {
          System.out.print(temp.data + "->");
          temp = temp.next;
        }
        System.out.println();
      }

      public void zigzag(){
        
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null) {
              slow=slow.next;
              fast=fast.next;

        }
        Node mid=slow;
        
        //reverse a node 
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;


        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }


        //alternate merging

        Node left=head;
        Node right=prev;
        Node nextL, nextR;

        while (left!=null && right!=null) {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;


            right=nextR;
            left=nextL;
        }
      }

    public static void main(String[] args) {
       
     LinkedListZ ll = new LinkedListZ();
     

    

    }
    
}
