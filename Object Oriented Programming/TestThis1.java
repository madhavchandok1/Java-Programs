class Student{
    int rollno;
    String name;
    float fee;
    
    Student(int rollno,String name, float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    
    void display(){
        System.out.println("\n Roll No: "+rollno+"\n Name: "+name+"\n Fee: "+fee);
    }
}

public class TestThis1{
    public static void main(String args[]){
        Student s1=new Student(111,"Rahul", 100000);
        Student s2=new Student(112,"Rohit",200000);
        
        s1.display();
        s2.display();
    }
}