package shape;

public class Hexagon {
    private final float side;
    
    public Hexagon(float side) {
    	this.side = side;
    	
    }
    
    public float area() {
    	
    	return (float) ((3 * Math.sqrt(3)*(side * side))/2);
    }
    
    public float perimeter() {
    	 return 6 * side;
    }
    
    public float getSide() {
    	return side; 
    }
    
}
