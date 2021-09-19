class A{
    A(){
        System.out.println(" Hello A");
    }
    A(int x){
        this();
        
        System.out.println(" "+x);
    }
}

public class TestThis3{
    public static void main(String args[]){
        A a1=new A(10);
    }
}