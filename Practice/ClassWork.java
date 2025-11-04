package Practice;

class Sum{
    int a;
    int b;
    Sum(int a ,int b){
        this.a = a;
        this.b =b;
    }
    int sum(){
        return a+b;
    }
        }
class Mul{
    int a;
    int b;
    Mul(int a, int b){
        this.a = a;
        this.b =b;
    }
    public int mul(){
        return a*b;
    }
}
class Div{
    int a;
    int b;
    Div(int a , int b){
        this.a = a;
        this.b = b;
    }
    public int div(int a, int b){
        return a/b;
    }
}
public class ClassWork {
    public static void main(String[] args) {
        Sum s = new Sum(2, 3);
        System.out.println(s.sum());
        Mul m = new Mul(3,4);
        System.out.println(m.mul());
        Div d = new Div(12,6);
        System.out.println(d.div(30,5));
    }


}