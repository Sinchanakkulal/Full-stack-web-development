class Animal{
    void bark(){
        System.out.println("Animal bark!");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class java_polymorphism{
    public static void main(){
        Animal mydog=new Dog();
        Animal myanimal=new Animal();
        mydog.bark();
        myanimal.bark();
    }
}