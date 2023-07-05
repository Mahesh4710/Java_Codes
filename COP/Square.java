//Area of square
public class Square{
    void area(float side){
        System.out.println(side*side);
    }
    void area(double side){
        System.out.println(side*side);
    }
    public static void main(String[] args) {
        Square obj1 =new Square();
        obj1.area(6);
        obj1.area(5.5);
    }
}