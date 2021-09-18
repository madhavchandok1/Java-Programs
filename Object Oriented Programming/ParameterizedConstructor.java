class Student{
    int id;
    String name;
    
    Student(int i, String n){
        id=i;
        name=n;
    }
    
    void display(){
        System.out.println("ID: "+id+" Name: "+name);
    }
}

public class ParameterizedConstructor{
    public static void main(String args[]){
        Student s1=new Student(12443564,"Madhav Chandok");
        Student s2=new Student(3253456, "Rohit");
        s1.display();
        s2.display();
    }
}