package linkedlist;

public class linkedlistBasics {

    public static void RecursiveDisplay(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        RecursiveDisplay(head.next);
    }

    public static void display(Node Head) {
        // display a Node using Function
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
           System.out.println();
    }
    public static void insertAtEnd(Node Head, int val ){
        Node temp = new Node(val);
        Node t = Head;

        while (t.next!=null) {
            t= t.next;
        }
        t.next=temp;

    }
    public static void reverse(Node Head){
        while (Head==null) return;
        reverse(Head.next);
        System.out.print(Head.data+" ");
    }


    public static int length(Node Head){
       int count = 0;

       while (Head != null)
       {
        count++;
        Head = Head.next;
       }
       
      return count;
    }

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            // this.next=null;

        }

    }

    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(2);
        Node f = new Node(23);
        Node g = new Node(45);

        // System.out.println(a.data);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        // System.out.println(b);
        // System.out.println(a.next.next.next.data);

        Node temp = a;

        // display a Node using for loop

        // for(int i=1; i<=5; i++){
        // System.out.print(temp.data + " ");
        // temp=temp.next;
        // }

        // display a Node using While Loop
        // while (temp!=null) {
        // System.out.print(temp.data + " ");
        // temp=temp.next;
        // }

        // display a Node using Function
        // display(a);

        // we can not pass head directle if we pass we lose our head and also this is
        // not a good manner of writing code
        // while (a != null) {
        // System.out.print(a.data + " ");
        // a = a.next;
        // }
        // System.out.println(a.data);

        // display(a);
        // System.out.println();
        // RecursiveDisplay(a);


        // reverse(a);

        // System.out.println(length(a));
        insertAtEnd(a, 89);
        display(a);

    }
}
