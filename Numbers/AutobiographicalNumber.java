import java.util.*;
public class AutobiographicalNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to check whether it is autobiographical number or not: ");
        
        int count=0, digit;
        int sum=0;
        int num=sc.nextInt();
        int temp=num;
        
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            count++;
            num=num/10;
        }
        
        if(sum==count){
            System.out.println("Entered number is autobiographical number");
        }
        else{
            System.out.println("Entered number is not autobiographical number");
        }
    }
}