 class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Queue{
    Node front;
    Node rear;
    public boolean isEmpty(){
        if(front==null)
            return true;
        else
            return false;
    }
    public void enQueue(int data){
        Node n1=new Node(data);
        if(isEmpty()){
           front=n;
        rear=n;}
        else {
            front.next = n1;
            front = n1;
        }
    }
    public void deque(){
        if(isEmpty()){
            System.out.println("Queue empty");
            }
        else
        {
            int x=rear.data;
            rear=rear.next;
    }
}
    public void print(){
        Node temp;
        temp=rear;
    while (temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }

    }
    public static void main(String[]args){
        Queue obj=new Queue();
        obj.deque();
        obj.enQueue(10);
        obj.enQueue(20);
        obj.display();
    }
}


