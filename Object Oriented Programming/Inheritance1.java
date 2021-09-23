class Employee{
    float salary=40000;
}

class Programmer extends Employee{
    float bonus=10000;
}

public class Inheritance1{
    public static void main(String args[]){
        Programmer p=new Programmer();
        
        System.out.println(" Programmer Salary: "+p.salary);
        System.out.println(" Bonus of Programmer: "+p.bonus);
    }
}