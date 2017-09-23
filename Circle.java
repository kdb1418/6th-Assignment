
public class Circle extends Shape{
	private int radius;
	public void draw() {
		System.out.println("Circle Draw-> x: "+this.x+" y: "+this.y+
				" radius: "+this.radius);
	}
	Circle(int x, int y, int radius){
		super.x = x;
		super.y = y;
		this.radius = radius;
		
	}
}
