import java.util.HashMap;
public class java_HashMap{
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Apple");
        hm.put(2,"Banana");
        hm.put(3,"carrot");
        hm.put(4,"Dragon");
        System.out.println("get the value based on key=2: "+hm.get(2));
        System.out.println("List: "+hm.keySet());
        for(int item:hm.keySet()){
            System.out.println(item+":"+hm.get(item));
        }
        
       

    }
}