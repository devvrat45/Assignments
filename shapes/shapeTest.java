package shapes;

public class shapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape box = new Rectangle(10,20);
		box.computeArea();
		box.computePerimeter();
		
		System.out.println(box);
		
		Shape cube= new Square(10);
		cube.computeArea();
		cube.computePerimeter();
		System.out.println(cube);
		
		draw(new Drawing(),box);
		draw(new Drawing(),cube);
	}
	
	public static void draw(Drawable d, Shape s) {
		d.draw(s);
	}

}
