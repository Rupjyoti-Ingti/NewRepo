package Practice;
import java.util.*;
public class P9 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for variable a:");
        int a= sc.nextInt();
        System.out.println("Enter the value for variable b: ");
        int b = sc.nextInt();
        System.out.println("Before swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
