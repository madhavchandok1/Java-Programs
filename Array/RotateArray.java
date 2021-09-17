import java.util.*;

public class RotateArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter in the array: ");
        int num=sc.nextInt();
        
        int []arr= new int[num];
        
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Enter the number of rotations you want to do in this.");
        int rotation=sc.nextInt();
        
        for(int i=0;i<rotation;i++){
            int temp;
            temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println();
        System.out.println("Array after "+rotation+" rotation will be: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}