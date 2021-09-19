class Calculate{
    static int cube(int x){
        return x*x*x;
    }
}

public class TestStaticMethod2{
    public static void main(String args[]){
        int result=Calculate.cube(5);
        System.out.println("The cube of 5 is: "+result);    
    }
}