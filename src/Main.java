class Node{
    Node left;
    Node right;
    int key;
    Node(int data){
        data=key;
    }
}
class tree{
    Node root;
    int height=0;
    public int treeheight(Node root){
        if(root!=null){
            height++;
            treeheight(root.left);
            treeheight(root.right);
        }
        return height;
    }
}
public class Main{
    public static void main(String[]args)
    {
        tree obj=new tree();
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(30);
       root.right=new Node(40);
      root.right.right=new Node(50);
       root.right.right.right=new Node(50);
        root.left.left.left=new Node(30);
        System.out.println("The height of the tree is-"+obj.treeheight(root));
    }
}
