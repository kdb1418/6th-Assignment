
public class Rectangle extends Shape{
	private int width, height;
	public void draw() {
		System.out.println("Rectangle Draw-> x: "+this.x+" y: "+this.y+
				" width: "+this.width+" height: "+this.height);
	}
	Rectangle(int x, int y, int width, int height){
		super.x = x;
		super.y = y;
		this.width = width;
		this.height = height;
		
	}
}
