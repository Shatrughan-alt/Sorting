class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Stacklinklist{
    Node top;
    public boolean isEmpty(){
        if(top==null)
            return true;
        else
            return false;
    }
    public void push(int data){
        Node n=new Node();
        n.next=top;
        top=n;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else
            top=top.next;
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else
            System.out.println(top.data);
    }
    public static void main(String[]args){
        Stacklinklist obj= new Stacklinklist();
        obj.push(20);
        obj.push(30);
        obj.pop();
        obj.push(40);
        obj.peek();
    }

}