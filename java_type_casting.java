public class java_type_casting{
    public static void main(String[] args){
        //widening casting
        //smaller type size to larger type size
        //narrowing casting=manual(larger tpe size to smaller type size)
        
        int myage=21;      //int to double
        double myDouble_age=myage;
        System.out.println("int to double(automatic conversion): "+myDouble_age);

        //narrowing casting
        //double to int
        //manual conversion
        double price=24.67;
        int int_price= (int) price ;
        System.out.println("double to int manual conversion: "+int_price); //24


    }
}