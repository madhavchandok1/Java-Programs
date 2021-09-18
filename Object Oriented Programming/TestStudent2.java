import java.util.*;

class Student{
    int id;
    String name;
}

public class TestStudent2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        Student s1=new Student();
        System.out.print("\n Enter the Roll Number of First Student: ");
        s1.id=sc.nextInt();
        System.out.print(" Enter the name of First Student: ");
        sc.nextLine();
        s1.name=sc.nextLine();
        
        Student s2=new Student();
        System.out.print("\n Enter the Roll Number of Second Student: ");
        s2.id=sc.nextInt();
        System.out.print(" Enter the name of Second Student: ");
        sc.nextLine();
        s2.name=sc.nextLine();
        
        System.out.print("\n Name of First Student: "+s1.name+"\n Roll Number of First Student: "+s1.id);
        System.out.print("\n Name of Second Student: "+s2.name+"\n Roll Number of Second Student: "+s2.id);
        
        sc.remove();
        sc.close();
    }
}