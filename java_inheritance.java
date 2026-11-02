class GrandParents{
    public void grandAnimal(){
        System.out.println("Grand animal made sound");
    }
}
class parents extends GrandParents{
    public void animal(){
        System.out.println("animal made sound");
    }
}
class Child extends GrandParents{
    public void bark(){
        System.out.println("dog made sound");
    }
}
public class java_inheritance{
    public static void main(String[] args){
        Child c=new Child();
        parents p=new parents();
        c.bark();
        c.grandAnimal();

        p.animal();
        p.grandAnimal();

    }
}