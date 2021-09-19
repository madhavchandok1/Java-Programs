class Student{
    int rollno;
    String name,course;
    float fee;
    
    Student(int rollno, String name, String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    
    Student(int rollno, String name, String course, float fee){
        this(rollno,name,course);
        this.fee=fee;
    }

    void display(){
        System.out.println("\n Roll No: "+rollno+"\n Name: "+name+"\n Course: "+course+"\n Fee: "+fee);
    }
}

public class TestThis5{
    public static void main(String args[]){
        Student s1=new Student(111,"Rahul","B.Tech");
        Student s2=new Student(112,"Rohit","B.Tech",100000);
        
        s1.display();
        s2.display();
    }
}