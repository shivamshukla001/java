package linkedlist;

public class linkedlistImp {

    // public static Node Nthnode(Node head, int n) {
    //     Node slow = head;
    //     Node fast = head;

    //     for (int i = 1; i <= n; i++) {
    //         fast = fast.next;
    //     }

    //     while (fast != null) {
    //         slow = slow.next;
    //         fast = fast.next;

    //     }
    //     return slow;
    // }

    // public static void display(Node Head) {
    //     // display a Node using Function
    //     Node temp = Head;
    //     while (temp != null) {
    //         System.out.print(temp.data + " ");
    //         temp = temp.next;
    //     }
    //     System.out.println();
    // }

    // // public static int length(Node head) {
    // //     int count = 0;

    // //     while (head != null) {
    // //         count++;
    // //         head = head.next;

    // //     }
    // //     return count;

    // // }

    // public static Node intersection(Node head1, Node head2 ){

    // Node length(Node head) {
    //      int count =0;

    //     while (head != null) {
    //         count++;
    //         head = head.next;

    //     }
    //     return count;

    // }

    // Node temp1 = head1;
    // Node temp2 = head2;



    // }
    // public static Node Middleelement(Node head, int n){
    //     Node fast = head;
    //     Node slow = head;

    //     // for(int i=1; i<=n; i++){
    //     //     fast= fast.next;
    //     // }

    //     while(fast.next!=null){
    //     slow= slow.next;
    //     fast= fast.next.next;
    //     }
    //     return slow;
    // }

    // public static void DeleteNthFromEnd(Node head, int n) {

    //     Node slow = head;
    //     Node fast = head;

    //     for (int i = 1; i <= n; i++) {
    //         fast = fast.next;
    //     }

    //     if (fast == null) {
    //         head = head.next;
    //         return;
    //     }
    //     while (fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next;

    //     }

    //     slow.next = slow.next.next;
    // }

    public static void display(Node Head) {
            // display a Node using Function
            Node temp = Head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }


    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

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
        

        // Node q = Nthnode(a,2);
        // System.out.println(q.data);

        // display(a);
        // DeleteNthFromEnd(a, 3);
        // display(a);
 
        Middleelement(a, 2);
        display(a);

    }
}
