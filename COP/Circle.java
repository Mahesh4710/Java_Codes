
// Calculate area and circumference of circle using multiple classes
class AreaCircle{
    int radius=5;
    double pi=3.142,area,cir;
    
    double areaCircle(){
    area=pi*radius*radius;
    return area;
    }
}

    class CircumferenceCircle{
        int radius=5;
        double pi=3.142,area,cir;
       
        double circumferenceCircle(){
            cir=2*pi*radius;
            return cir;
        }
               
        }    


public class Circle {

    public static void main(String[] args) {
        
        AreaCircle obj=new AreaCircle();

        CircumferenceCircle obj2=new CircumferenceCircle();
       
        System.out.println("Area of Circle is :"+obj.areaCircle());
        System.out.println("Area of circumference is :"+obj2.circumferenceCircle());

    }
}


