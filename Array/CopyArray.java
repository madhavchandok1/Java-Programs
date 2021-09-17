public class CopyArray{
    public static void main(String args[]){
        int []arr1=new int[]{1,2,3,4,5};
        int arr2[]=new int[arr1.length];
        
        System.out.print("Array 1 Elements: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(" "+arr1[i]);
            arr2[i]=arr1[i];
        }
        System.out.print("\nArray 2 Elements: ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(" "+arr2[i]);
        }
    }
}