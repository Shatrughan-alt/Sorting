class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Linklist{
    Node head;
    public void print() {
        Node temp = head;
        while (temp!= null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void InsertatEnd(int k){
        Node n=new Node(k);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }


    public static void main(String[] args) {
        Linklist obj=new Linklist();
        Node n1=new Node(10);
        obj.head=n1;
        Node n2=new Node(20);
        n1.next=n2;
        Node n3=new Node(30);
        n2.next=n3;
        obj.InsertatEnd(40);
        obj.print();
    }
}
