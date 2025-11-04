package Practice;
import java.util.*;
public class P10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();
        System.out.println("Enter the second number:");
        int b= sc.nextInt();
        System.out.println("Addition:"+a+"+"+b+"="+(a+b));
        System.out.println("Subtraction:"+a+"-"+b+"="+(a-b));
        System.out.println("Multiplication:"+a+"*"+b+"="+(a*b));
        System.out.println("Division:"+a+"/"+b+"="+(a/b));
    }
}
