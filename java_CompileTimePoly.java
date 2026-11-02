//method overloading
class mathUtil{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class java_CompileTimePoly{
    public static void main(String[] args){
        mathUtil mu=new mathUtil();
        System.out.println(mu.add(2,3));
        System.out.println(mu.add(2,3,1));
        
    }
}