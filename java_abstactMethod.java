abstract class Vehicle{
    abstract void start();

    void engine(){
        System.out.println("Engine started");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("car started");
    }
}
public class java_abstactMethod{
    public static void main(String[] args){
        Vehicle mycar = new Car();
        mycar.start();
        mycar.engine();
    }
}