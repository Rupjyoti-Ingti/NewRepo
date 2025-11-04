import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();
        System.out.println("Enter the second number:");
        int b= sc.nextInt();
        System.out.println("Enter the third number:");
        int c=  sc.nextInt();
        int Sum=a+b+c;
        System.out.println("The result is"+Sum);
        int Sub=a-b-c;
        System.out.println("The result is"+Sub);

    }
}
