public class java_String{
    public static void main(String[] args){
        String greetings="Hello,welcome to bangalore";

        //string length
        System.out.println("string length :"+ greetings.length());

        //uppercase
        System.out.println("uppercase :"+greetings.toUpperCase());

        //lowercase
        System.out.println("lower case :"+greetings.toLowerCase());

        //Finding a Character in a String
        System.out.println("Finding a Character in a String :"+greetings.indexOf("welcome"));

        //finding the character
        System.out.println("finding the character: "+greetings.charAt(1));

        //equals
        String txt1 = "Greetings";
        String txt2 = "Great things";

        System.out.println(txt1.equals(txt2)); //false

        //removing the white space by trim()
        String txt ="   Hello,World    ";
        System.out.println("removing the white space by trim(): "+ txt.trim());

        //Java Special Characters
        String txt5="my name is \"Sinchana\" ";
        String txt6="It\'s alright ";
        System.out.println(txt5);
        System.out.println(txt6);



    }
}