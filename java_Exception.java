class BankAccount{
  double balance=5000.0;
  void withdraw(double amount) throws Exception{
    try{
        System.out.println("Trying of amount withdrawal");
        if(amount>balance){
            throw new Exception("doesnot have suffient balance");
        }
        balance=balance-amount;
        System.out.println("Amount withdrawed,remaining balance "+balance);
    }catch(Exception e){
        System.out.println("Error: "+e.getMessage());
    }
    finally{
        System.out.println("Transaction willterminated \n");
    }
  }  
}
public class java_Exception{
    public static void main(String[] args) throws Exception{
        BankAccount account=new BankAccount();
        System.out.println("-------first tansaction-------");
        account.withdraw(2000);

        System.out.println("-----seconf transaction------");
        account.withdraw(6000);
    }
}