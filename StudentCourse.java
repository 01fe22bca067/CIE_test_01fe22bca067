public class StudentCourse {
    public String name;
    public String sem;
    public String Course;
    public double marks;
    public StudentCourse(String name,String sem,String Course, double marks){
        this.name=name;
        this.sem=sem;
        this.Course=Course;
        this.marks=marks;
    }
    public void Display(){
        System.out.println("Name:"+name);
        System.out.println("Semester :"+sem);
        System.out.println("Course :"+ Course);
        System.out.println("Marks: "+marks);
    }
    public static void main (String[] args){
        StudentCourse s=new StudentCourse("John", "4th sem", "DevOps", 74.2);
        StudentCourse s2=new StudentCourse("Eddy", "4th sem", "MachineLearning", 94.2);
        s.Display();
        s2.Display();
    }
}
