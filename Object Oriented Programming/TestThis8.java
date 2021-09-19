class A{
    A getA(){
        return this;
    }
    void msg(){
        System.out.println(" Hello World");
    }
}

public class TestThis8{
    public static void main(String args[]){
        new A().getA().msg();
    }
}