package shape;

public class Square {
    
	 private final float width; 
	  
	
	  
	  public Square(float width ) {
		this.width = width;
	
		  
	  }
	  
	  
	  public float area() {
		  return width * width;
	  }
	  
	  public float perimeter() {
		  return width * 4;
	  }
}
