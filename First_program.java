public class First_program{
    public static void main(String[] args){
        //print  the name  
        String name ="Sinchana";
        System.out.println("Hello"+name);

        //print the numbers
        System.out.println(3+5);

        //asinging the variable first
        //use  of final to unchange the variable values
        // final int myNum;
        int myNum;
        myNum=22;
        System.out.println("myNum: "+myNum);

        System.out.println("Change the value of myNum from 15 to 20:");
        myNum=20;
        System.out.println("myNum: "+myNum);

        //use of the + oprtator to add the variable 
        String fullName ="Sinchana";
        String LastName="Kulal";
        String FullName=fullName+" "+LastName;
        System.out.println("FullName: "+FullName);

        //combining text and numbers
        int x=5;
        int y=6;
        System.out.println("the sum is: "+x+y); //56
        System.out.println("the sum is: "+(x+y));  //11   

        //Declare Many Variables
        int a=2,b=3,c=4;
        System.out.println("Declare Many Variables: "+(a+b+c));  //9  

        //One Value to Multiple Variables
        // int m,n,o =2; 
        int m,n,o;
        m=n=o=2;
        System.out.println("One Value to Multiple Variables: "+(m+n+o));

        //floating values should be end with f
        //double values end with d
        float name1=3.14f;
        System.out.println("Flaot: "+name1);

        //use of var keyword
        var m1=5;
        System.out.println("m1: "+m1);  //it automaticlly found the types of m1
        var myNum = 5;         // int
        var myDouble = 9.98;   // double
        var myChar = 'D';      // char
        var myBoolean = true;  // boolean
        var myString = "Hello"; // String

        

    }
}