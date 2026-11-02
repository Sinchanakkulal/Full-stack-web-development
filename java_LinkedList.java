import java.util.LinkedList;

public class java_LinkedList{
    public static void main(String[] args){
        LinkedList<String> LL =new LinkedList<>();
        LL.add("A");
        LL.addFirst("B");
        LL.addLast("Last");
        System.out.println("first element: "+LL.getFirst());
        System.out.println("list: "+LL);
    }
}