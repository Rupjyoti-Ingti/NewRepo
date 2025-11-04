package Practice;

public class SumOfEvens {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=50;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers are:"+sum);
    }
}
