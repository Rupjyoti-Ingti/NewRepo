import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatchDemo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter a number:");
            int num= sc.nextInt();
            System.out.println("You enter:"+num);
        }catch(InputMismatchException e){
            System.out.println("Error:Please enter a valid integer.");
        }finally{
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}
