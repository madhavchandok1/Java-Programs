class A{
    void m(){
        System.out.println(" Hello M");
    }
    void n(){
        System.out.println(" Hello N");
        this.m();
    }
}

public class TestThis2{
    public static void main(String args[]){
        A a1=new A();
        
        a1.n();
    }
}