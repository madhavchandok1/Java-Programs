import java.lang.Math;
public class RandomNumber{
    public static void main(String args[]){
        int min=200;
        int max=400;
        
        System.out.print("Random Double Value: ");
        double a=Math.random()*(max-min+1)+min;
        System.out.println(a);
        
        System.out.print("Random Integer Value: ");
        int b=(int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}