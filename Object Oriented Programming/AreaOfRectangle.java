class Rectangle{
    int length;
    int breadth;
    void insert(int l, int b){
        length=l;
        breadth=b;
    }
    
    void calculateArea(){
        System.out.print("\n The area of the rectagle: "+length*breadth);
    }
}

public class AreaOfRectangle{
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        
        r1.insert(11,5);
        r2.insert(50,5);
        
        r1.calculateArea();
        r2.calculateArea();
    }
}