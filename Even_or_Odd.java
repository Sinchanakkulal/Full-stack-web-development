import java.util.Scanner;

public class Even_or_Odd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.printf("%s is even",n);
        }else{
            System.out.printf("%s is odd",n);
        }
    }
}