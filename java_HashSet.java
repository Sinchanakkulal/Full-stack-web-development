import java.util.HashSet;
public class java_HashSet{
    public static void main(String[] args){
        HashSet<String> hs=new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Carrot");
        hs.add("Dora");
        hs.add("Era");
        System.out.println("Hash set collections: "+hs);
        // System.out.println("remove the last element(Era): "+hs.remove());
        System.out.println("remove the specific  element(Banana): "+hs.remove("Banana"));
        System.out.println("whether it contains the word 'Dragon' : "+hs.contains("Dragon"));
        System.out.println("size of hs: "+hs.size());



   
    }
}