
class Square {
	void Area(double side)
	{
		System.out.println("Area of the Square: "+ side * side);
	}
		void Area(float side)
	{
		System.out.println("Area of the Square: "+ side * side);
	}
}

class Rectangle {
	void Area(double l,double b)
	{
		System.out.println("Area of the Square: "+ l * b);
	}
		void Area(float l,float b)
	{
		System.out.println("Area of the Square: "+ l * b);
	}
}

class Area {
	public static void main(String[] args)
	{
		Square obj = new Square();

		obj.Area(10);
		obj.Area(3.2);

		Rectangle obj2= new Rectangle();
		obj2.Area(3, 5);
		obj2.Area(3.5, 5.5);
	}
}

    