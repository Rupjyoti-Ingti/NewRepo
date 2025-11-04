
package Practice;
import java.util.Scanner;
public class Bank {
    int AccountNumber;
    String Name;
    double AmountDeposit;
    double AmountWithdrawal;
    double AvailableBalance;
    Scanner sc= new Scanner(System.in);
    void BankAccount(int a, String b){
        AccountNumber=a;
        Name=b;
    }
    void AmountDeposit(){
        System.out.println("Enter amount deposit:");
        AmountDeposit=sc.nextDouble();
    }
    void AmountWithdrawal(){
        System.out.println("Enter amount withdrawal:");
        AmountWithdrawal=sc.nextDouble();
        AvailableBalance=AmountDeposit-AmountWithdrawal;
    }
    void display(){
        System.out.println("The account number:"+AccountNumber);
        System.out.println("The holder name="+Name);
        System.out.println("The amount deposit="+AmountDeposit);
        System.out.println("The amount withdrawal="+AmountWithdrawal);
        System.out.println("Available amount="+AvailableBalance);
    }
}
class Prog1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account number:");
        int x=sc.nextInt();
        System.out.println("Enter the name:");
        String n=sc.nextLine();
        BankAccount Acc1=new BankAccount(x,n);
        Acc1.AmountDeposit();
        Acc1.AmountWithdrawal();
        Acc1.display();
    }
}
