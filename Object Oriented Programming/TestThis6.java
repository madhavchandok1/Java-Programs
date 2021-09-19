class A{
    void m(A obj){
        System.out.println(" Method is invoked");
    }
    void p(){
        m(this);
    }
}

public class TestThis6{
    public static void main(String args[]){
        A a1=new A();
        a1.p();
    }
}