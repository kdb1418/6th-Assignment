
public class ShapeTest {
	private static Shape arrayOfShapes[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		drawAll();
	}
	public static void init() {
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Rectangle(1, 2, 7, 8);
		arrayOfShapes[1] = new Triangle(3, 4, 9, 10);
		arrayOfShapes[2] = new Circle(5, 6, 11);	
	}
	public static void drawAll() {
		for(int i=0; i<arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
	}

}
