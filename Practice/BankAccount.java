package Practice;
import java.util.Scanner;
public class BankAccount {
    int accountNumber;
    String name;
    double AmountDeposited;
    double AmountWithdrawal;
    double AvailableBalance;
    Scanner sc= new Scanner(System.in);
    BankAccount(int a,String b){
        accountNumber=a;
        sc.nextLine();
        name=b;
    }
    void AmountDeposit(){
        System.out.println("Enter Amount Deposited:");
        AmountDeposited=sc.nextDouble();
    }
    void AmountWithdrawal(){
        System.out.println("Enter Amount Withdrawal:");
        AmountWithdrawal=sc.nextDouble();
        AvailableBalance= AmountDeposited-AmountWithdrawal;
    }
    void display(){
        System.out.println("The Account Number="+accountNumber);
        System.out.println("The Holder Name="+name);
        System.out.println("The Amount Deposited="+AmountDeposited);
        System.out.println("The Amount Withdrawal="+AmountWithdrawal);
        System.out.println("Available Balance="+AvailableBalance);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Number:");
        int x = sc.nextInt();
        System.out.println("Enter the Name:");
        String y= sc.nextLine();
        BankAccount Acc1= new BankAccount(x,y);
        Acc1.AmountDeposit();
        Acc1.AmountWithdrawal();
        Acc1.display();
    }
}
