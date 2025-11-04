package Practice;
import java.util.*;
public class Function2 {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Sum of the numbers:");
        int sum=calculateSum(a,b);

        System.out.println(sum);

    }
}
