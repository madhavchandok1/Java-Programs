class Student{
    int rollno;
    String name;
    static String college="IIMT College of Engineering";
    
    Student(int r, String n){
        rollno=r;
        name=n;
    }
    
    void display(){
        System.out.println("\n Roll No: "+rollno+"\n Name: "+name+"\n College Name: "+college);
    }
}

public class TestStaticVariable{
    public static void main(String args[]){
        Student s1=new Student(124342, "Madhav Chandok");
        Student s2=new Student(145435, "XYZ");
        
        s1.display();
        s2.display();
    }
}