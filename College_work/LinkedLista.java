package College_work;

import DSA.LinkedList.LinkedList;

public class LinkedLista {
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
    public void addFirst(int data){
        //step1 create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2 newNode ka next =head
        newNode.next=head;//link

        //step3 head=newNode
        head=newNode;
    }
    public void print(){
        if (head==null){
            System.out.println("linkedList is emport");
            return;
        }
        LinkedLista.Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedLista ll=new LinkedLista();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
    }
}
