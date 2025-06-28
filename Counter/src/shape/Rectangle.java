package shape;

public class Rectangle {
	
	  private final float width ; 
	  
	  private final float height;
	  
	  public Rectangle( float width, float height) {
		 this.width = width; 
		 this.height = height;
		 
	  }
	  
	  public float area() {
		  return height * width;
	  }
	  
    
	  public float perimeter() {
		  return 2 * (height + width);
	  }
}
