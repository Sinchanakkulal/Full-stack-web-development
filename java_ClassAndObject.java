class Car{
    String name;
    int  age;
    String brandName="Toyoto";
    int price=20000;
    Car(String name,int age){
        this.name=name;
        this.age=age;
    }
    void startCar(){
        System.out.println(name+" car engine started succesfully "+age);
    }
}
public class java_ClassAndObject{
    public static void main(String[] args){
        Car myCar=new Car("sinchana",28);
        Car myCar2=new Car("Sahana",22);

        System.out.println("Car company :"+myCar.brandName);
        myCar.startCar();
        myCar2.startCar();
        
    }
}