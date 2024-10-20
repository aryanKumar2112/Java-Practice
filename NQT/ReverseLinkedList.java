package NQT;

public class ReverseLinkedList {
    public class Node{

        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
           head=newNode;
           return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }
    public void reverse(){
      Node prev=null;
      Node curr=head;
      Node next;
      while(curr!=null){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
      }
      head=prev;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseLinkedList r1=new ReverseLinkedList();
        r1.addFirst(2);
        r1.addFirst(1);
        r1.addLast(3);
        r1.addLast(4);
        r1.reverse();
        r1.printList();

    }
}
