package shapes;

public class Rectangle extends Shape {
	
	public Rectangle(double length, double width) {
		super(length, width);
	}

	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		System.out.println("Area="+length*width);

	}

	@Override
	public void computePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimete="+2*(length + width));
		
		

	}

	@Override
	public String toString() {
		return "Shape is rectangle";
	}

}
