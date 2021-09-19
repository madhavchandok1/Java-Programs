class Student{
    int rollno;
    String name;
    static String college="IIT";
    
    static void change(){
        college="IIMT College of Engineering";
    }
    
    Student(int r, String n){
        rollno=r;
        name=n;
    }
    
    void display(){
        System.out.println("\n Roll No: "+rollno+"\n Name: "+name+"\n College: "+college);
    }
}

public class TestStaticMethod{
    public static void main(String args[]){
        Student s1=new Student(12432432,"Madhav Chandok");
        Student s2=new Student(335345,"XYZ");
        
        s1.display();
        s2.display();
        
        Student.change();
        
        s1.display();
        s2.display();
    }
}