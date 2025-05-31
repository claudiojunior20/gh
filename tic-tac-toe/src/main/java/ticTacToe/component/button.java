package ticTacToe.component;

import java.awt.Dimension;
import java.awt.Point;

public class button {
	
	 private Point position= null;
	 private Dimension  dimension= null;
	 
	 
	 public button() {
      this.position = new Point(0,0);
      this.dimension = new Dimension(20,20);	 
	 }
	 
	 
	 public button(int x , int y) {
	    this();
	    setPosition(x, y);
	 }
	 
	 public button(int x, int y, int width, int height) {
		 this();
		 setSize(width, height);
		 
	 }
	 
	 public void 
}
