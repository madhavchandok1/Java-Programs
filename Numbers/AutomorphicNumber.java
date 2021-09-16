import java.util.*;

public class AutomorphicNumber{
    static boolean checker(int num){
        int square=num*num;
        while(num>0){
            if(num%10!=square%10)
                return false;
            num=num/10;
            square=square/10;
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check whether is a Automorphic Number or not: ");
        int num=sc.nextInt();
        
        boolean flag=checker(num);
        
        if(flag){
            System.out.println("Entered number is Automorphic Number");
        }
        else{
            System.out.println("Entered number is not a  Automorphic Number");
        }
    }
}