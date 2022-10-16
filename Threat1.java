import java.util.*;
public class Threat1{
    public static void main(String[] args) {
       ArrayList q= new ArrayList();
       q.add("aaa");
        q.add("bbb");
        q.add("ccc");
        q.add("aaa");
        q.add(10);
        HashSet i=new HashSet(q);
        System.out.println(i);


}}