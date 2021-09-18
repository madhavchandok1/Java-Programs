import java.util.*;

class Factorial{
    void fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact=fact*i;
        System.out.print("\n The factorial of "+n+" will be: "+fact);
    }
}

public class AnonymousObject{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter the number whose factorial you want to find out: ");
        int num=sc.nextInt();
        new Factorial().fact(num);
    }
}