package shape;

public class Triangle {
    private final float sideA ;
    private final float sideB ;
    private final float sideC ;
    public Triangle(float sideA, float sideB, float sideC) {
    	this.sideA = sideA;
    	this.sideB = sideB;
    	this.sideC = sideC;
    }
    
    
    public float perimeter() {
    	return  sideA + sideB + sideC;
    	
    }
    public float area() {
    	float s = perimeter() / 2;
		return (float) Math.sqrt(s * (s - sideA) * (s - sideB) * ( s - sideC )) ;
    	
    }
}
