package linkedlist;

public class linkedlistImplementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void insertAthead(Node Head, int val) {

    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }

            tail = temp;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;

            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtFirst(val);
                return;
            }

            for (int i = 1; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

        }

        int getElement(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx){
            Node temp = head;

            for(int i=1; i<idx-1; i++){
                temp=temp.next;
            }

            temp.next=temp.next.next;
        }

        void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAtFirst(int val) {
            Node temp = new Node(val);

            if (head == null) {// empty case
                temp = head;
            } else {
                temp.next = head;
                head = temp;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.insertAtEnd(4);
        // ll.display();
        ll.insertAtEnd(6);
        // ll.display();

        ll.insertAtEnd(18);
        // ll.display();
        // ll.display();
        // System.out.println();

        ll.insertAtFirst(9);

        // ll.display();

        ll.insertAtFirst(12);

        ll.insertAt(2, 90);

        ll.insertAt(0, 100);

        ll.display(); //100 12 90 9 4 6 18 

        // System.out.println(ll.getElement(3));

        ll.deleteAt(3); //100 12 9 4 6 18 
        ll.display();

        // System.out.println(ll.size());

    }
}
