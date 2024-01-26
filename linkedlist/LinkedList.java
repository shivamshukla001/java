package linkedlist;

public class LinkedList {

    public static class Node{
     int data;
     Node next;

     public Node(int data){
        this.data=data;
        this.next=null;
     } 
   
    }
     public static Node head;
     public static Node tail;
     public static int size;
 
     //time complexcity of addFirst is O(1)
     public void addFirst(int data){
        //create new node 
        Node newNode = new Node(data);
        size++;
        //basecase
        if(head==null){
            head=tail=newNode;
            return;
        }

        //new node's next=head
        newNode.next=head;


        //head=new node
        head=newNode;
     }
     
     //time complexity of addLast is O(1)
     public void addlast(int data){
     //create a node
     Node newNode=new Node(data);
       size++;

     if(head==null){
        head=tail=newNode;
        return;

     }

     //new node's next=tail
     tail.next=newNode;

     //tail=newnode
     tail=newNode;
     }
     

     //time complexity of print fnx is O(n)
     public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
           temp= temp.next;
        }
        System.out.println("null");
     }
    

     public int itrSearch(int key){
        Node temp=head;
        int i=0;

    while (temp!=null) {
        if(temp.data==key)
        { 
            return i;

        }
        temp=temp.next;
        i++;
    }
    return -1;
     }

     public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode=new Node(data);
          size++;
        Node temp=head;
        int i=0;

        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
      
        newNode.next=temp.next;
        temp.next=newNode;


     }
    public static void main(String[] args) {
        LinkedList li=new LinkedList();
        li.addFirst(2);
        li.addFirst(1); 
        li.addlast(3);
        li.addlast(4);
        li.add(2, 9);
        li.print();
        System.out.println(li.itrSearch(3));
        // System.out.println(li.size);
        // System.out.println(li);
    }
}
