class A{
    A(){
        this(5);
        System.out.print(" Hello A");
    }
    A(int x){
        System.out.println(" "+x);
    }
}

public class TestThis4{
    public static void main(String args[]){
        A a1=new A();
    }
}