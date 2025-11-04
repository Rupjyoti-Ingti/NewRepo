package Practice;
import java.util.Scanner;
public class P8 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to distance converter!");
        System.out.println("1.Convert kilometers to miles");
        System.out.println("2.Convert miles to kilometers");
        System.out.println("Enter your choice(1 or 2):");
        System.out.println("Enter distance in kilometers:");
        int d= sc.nextInt();
        if(d<0){
            System.out.println("Distance cannot be negative. Please restart the program.");
            return;
        }
        float x=(float)d;
        System.out.println("Distance in miles:"+x*0.63);
    }
}
