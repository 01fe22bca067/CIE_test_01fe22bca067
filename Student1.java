import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student1 {

    public String name;
    public LocalDate dateofBirth;
    
    public Student1(String name, CharSequence dateofBirth){
        this.name=name;
        this.dateofBirth=LocalDate.parse(dateofBirth,DateTimeFormatter.ofPattern("YYYY-MM-DD"));
    }
    public void display(){
        System.out.println("Student Detail");
        System.out.println("Name : "+ name);
        int age=LocalDate.now().getYear()- dateofBirth.getYear();
        System.out.println("Age : "+age);
    }
    public static void main(String[] args){
        Student1 s1=new Student1("John", "2017-04-23");
        s1.display();
    }
}