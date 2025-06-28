package shape;

public class Circle {
    
	private final float radius;
	
	public Circle(float radius) {
		this.radius = radius;
	}
	
	public float area() {
	 return (float)(Math.PI * (radius * radius));	
	}
	
	public float perimeter() {
	 return (float)(2 * Math.PI * radius);	
	}
	
}


