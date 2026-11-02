class Person{
    private String name;
    private int age;
    public void setName(String PersonName){
        name=PersonName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int PersonAge){
        age=PersonAge;
    }
    public int getAge(){
        return age;
    }

}
public class java_encapsalation{
    public static void main(String[] args){
        Person p=new Person();
        // System.out.println(p.name);
        p.setName("Sinchana");
        p.setAge(22);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}