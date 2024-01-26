package linkedlist;


public class LinkedListA {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) {
    // step 1-create a new node
    Node newnode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newnode;
      return;
    }

    // step2- newnode.next=hade
    newnode.next = head;

    // step 3-head=newnode
    head = newnode;
  }

  public void addlast(int data) {
    // step1- create a new node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = null;
      return;
    }

    // step2- tail.next=newnode
    tail.next = newNode;

    // step3- tail=newnode
    tail = newNode;
  }

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

  public void add(int idx, int data) {
    // create a new node
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;

    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }
    // step2-
    newNode.next = temp.next;
    temp.next = newNode;

  }

  public int remove() {
    if (size == 0) {
      System.out.println("ll is emprty");
      return Integer.MIN_VALUE;

    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    int val = head.data;
    head = head.next;
    return val;
  }

  public int removeLast() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    // prev: size-2;
    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;

  }

  public int itrSearch(int key) {
    Node temp = head;
    int i = 0;

    while (temp != null) {
      if (temp.data == key) {
        return i;
      }
      temp = temp.next;
      i++;

    }
    return -1;

  }

  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;
    }
    int idx = helper(head.next, key);
    if (idx == 0) {
      return -1;
    }
    return idx + 1;

  }

  public int recSearch(int key) {
    return helper(head, key);
  }

  public void reverse() {
    // 3 value 4 step solution

    Node prev = null;
    Node next;
    Node curr = tail = head;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }



  //floy's Cycle finding algorithm(Cfa)
  public static boolean isCycle(){
    Node slow=head;
    Node fast=head;

    while (fast!=null && fast.next != null) {
      slow=slow.next;//+1
      fast=fast.next.next; //+2
      if (slow==fast) {
        return true;
      }
    
    }
    return false;
  }

    public static void removeCycle(){
      Node slow=head;
      Node fast=head;
      Boolean cycle=false;

      while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if (fast==slow) {
          cycle=true;
          break;
        }
      }
      if (cycle==false) {
        return;
      }
       
      //meeting point
      slow=head;
      Node prev=null;
      while (slow!=fast) {
        prev=fast;
        slow=slow.next;
        fast=fast.next;

      }

      prev.next=null;

    }

  public static void main(String[] args) {
  //   LinkedListA li = new LinkedListA();
  //   li.addFirst(1);
  //   li.addFirst(2);
  //   li.addlast(3);
  //   li.addlast(4);
  //   li.add(2, 8);

  //   li.print();

  //  li.reverse();
  //  li.print();

   
  head=new Node(1);
  Node temp=new Node(2);
  head.next=temp;
  head.next.next=new Node(3);
  head.next.next.next=temp;

  System.out.println(isCycle());
  removeCycle();
  System.out.println(isCycle());
  }
}
