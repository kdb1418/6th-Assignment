
public class Triangle extends Shape{
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw-> x: "+this.x+" y: "+this.y+
				" base: "+this.base+" height: "+this.height);
	}
	Triangle(int x, int y, int base, int height){
		super.x = x;
		super.y = y;
		this.base = base;
		this.height = height;
		
	}
}
