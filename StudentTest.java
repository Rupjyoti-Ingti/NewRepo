
class Student{
    private String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
public class StudentTest {
    public static void main(String[] args){
        Student s= new Student();
        s.setName("Amit");
        System.out.println("Student Name:"+s.getName());
    }

}
