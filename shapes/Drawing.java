package shapes;

public class Drawing implements Drawable {

	@Override
	public void draw(Shape s) {
		// TODO Auto-generated method stub
		if(s instanceof Rectangle) {
			System.out.println("Drawing Rectangle");
		}
		
		else if(s instanceof Square) {
			System.out.println("Drawing of Square");
		}

	}

}
