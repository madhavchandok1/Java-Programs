import java.util.*;

public class PetersonNumber{
    static int factorial(int num){
        if(num==1 || num==0)
            return 1;
        else
            return num*factorial(num-1);
    }
    
    static boolean checker(int num){
        int sum=0, digit;
        int temp=num;
        while(temp>0){
            digit=temp%10;
            sum=sum+factorial(digit);
            temp=temp/10;
        }
        
        if(sum==num)
            return true;
        else
            return false;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to check whether it is Peterson Number or not: ");
        int num=sc.nextInt();
        
        boolean flag=checker(num);
        
        if(flag)
            System.out.println("Entered number is a Peterson Number.");
        else
            System.out.println("Entered number is not a Peterson Number.");
    }
}