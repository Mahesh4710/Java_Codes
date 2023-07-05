// Calculate area of rectangle

public class Rectangle{
    void area(float l,float b){
        System.out.println(l*b);
    }
    void area(double l,double b){
        System.out.println(l*b);
    }
    public static void main(String[] args) {
        Rectangle obj1 =new Rectangle();
        obj1.area(6,5);
        obj1.area(5.5,5.5);
    }
}