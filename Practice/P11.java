package Practice;
import java.util.*;
public class P11 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();
        System.out.println("Enter the second number:");
        int b= sc.nextInt();
        System.out.println("Enter the third number:");
        int c= sc.nextInt();
        if(a>b&&a>c){
            System.out.println("The largest number is:"+a);
        }else if(b>a&&b>c){
            System.out.println("The largest number is:"+b);
        }else {
            System.out.println("The largest number is:"+c);
        }
        System.out.println();
        if(a<b&&a<c){
            System.out.println("The smallest number is:"+a);
        }else if(b<a&&b<c){
            System.out.println("The smallest number is:"+b);
        }else{
            System.out.println("The smallest number is:"+c);
        }
    }
}
