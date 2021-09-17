import java.util.*;

public class ReverseArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of elements you want to enter in the array: ");
        int num=sc.nextInt();
        
        
        System.out.print("Enter the elements of the array: ");
        int []arr=new int[num];
        for(int i=0;i<num;i++)
            arr[i]=sc.nextInt();
        
        System.out.print("Original Array: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
        
        System.out.print("\nArray in Reverse Order: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }
    }
}