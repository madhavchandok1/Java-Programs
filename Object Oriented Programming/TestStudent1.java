import java.util.*;

class Student{
    int id;
    String name;
}

class TestStudent1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        
        System.out.print(" Enter the Roll Number of the student ");
        s1.id=sc.nextInt();
        
        sc.nextLine();
        System.out.print("\n Enter the name of the student: ");
        s1.name=sc.nextLine();
        
        System.out.print("\n Name of Student: "+s1.name+"\n Roll Number of Student: "+s1.id);
    }
}