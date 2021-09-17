import java.util.*;

public class SortArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of elements of the array: ");
        int num=sc.nextInt();
        
        System.out.print("Enter the elements of the array: ");
        int []arr=new int[num];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        
    }
}