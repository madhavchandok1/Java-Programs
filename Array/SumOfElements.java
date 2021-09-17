import java.util.*;

public class SumOfElements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of elements you want to enter in the array: ");
        int num=sc.nextInt();
        
        System.out.print("Enter the elements of the array: ");
        int []arr=new int[num];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        
        System.out.print("The sum of the elements of the array: "+sum);
    }
}