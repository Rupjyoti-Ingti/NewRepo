package Practice;
import java.util.Scanner;
public class P7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer value:");
        int a= sc.nextInt();
        System.out.println("Enter a character value:");
        char b= sc.next().charAt(0);
        System.out.println("Enter a float value:");
        float c= sc.nextFloat();
        System.out.println("Enter a boolean value(true/false):");
        boolean d= sc.nextBoolean();
        System.out.println("Integer value:"+a);
        System.out.println("Character value:"+b);
        System.out.println("Float value:"+c);
        System.out.println("Boolean value:"+d);
    }
}
