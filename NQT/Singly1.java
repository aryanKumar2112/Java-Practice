package NQT;

import LinkedList.Singly;

public class Singly1 {
    public class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;

    public  void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public  void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("NULL");
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void addBetween(String data,int loca){
        Node newNode =new Node(data);
        if (loca == 0) {  // Insert at the beginning if loca is 0
            addFirst(data);
            return;
        }
        int count=0;
        Node currNode=head;
        while (currNode != null && count < loca - 1) {
            currNode = currNode.next;
            count++;
        }
        if (currNode == null) {
            System.out.println("Location out of bounds");
            return;
        }
        newNode.next=currNode.next;
        currNode.next=newNode;

    }
    public static void main(String[] args) {
        Singly1 s1=new Singly1();
        s1.addFirst("is");
        s1.printList();
        s1.addFirst("This");
        s1.printList();
        s1.addLast("a");
        s1.printList();
        s1.addBetween("link",3);
        s1.printList();

    }
}
