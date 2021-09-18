class Function{
    int a1,b1,c1;
    Function(int a, int b){
        System.out.println("Multiplication of two numbers: "+a*b);
    }
    
    Function(int a, int b, int c){
        System.out.print("Addition of two numbers: "+(a+b+c));
    }
}
public class ConstructorOverloading{
    public static void main(String args[]){
        Function f1=new Function(10,20);
        Function f2=new Function(10,20,30);
    }
}