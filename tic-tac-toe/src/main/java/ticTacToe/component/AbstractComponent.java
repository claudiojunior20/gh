package ticTacToe.component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import ticTacToe.gui.Paintable;
import ticTacToe.gui.util.MouseListenerAdapter;

public abstract class AbstractComponent implements Paintable {
	 protected Point position;
	 protected Dimension  dimension;

	 
	 
	 
	 public AbstractComponent() {
      this.position = new Point(0,0);
      this.dimension = new Dimension(20,20);	 
	 }
	 
	 
	 public AbstractComponent(int x , int y) {
	    this();
	    setPosition(x, y);
	 }
	 
	

	public AbstractComponent(int x, int y, int width, int height) {
		 this();
		 setSize(width, height);
		 
	 }
	
	public void setPosition(int x, int y) {
		 this.position = new Point (x , y);
	 }
	 
	 
	 public Point getPosition() {
		 return (Point) this.position.clone();
	 }
	 
	 
	 public void setSize(int width, int height) {
		 this.dimension = new Dimension(width, height);
	 }
	 
	 public Dimension getsize() {
		 return (Dimension) this.dimension.clone();
	 }
	 
	 public int width() {
		 return this.dimension.width;
	 }
	 
	 public int height() {
		 return this.dimension.height;
	 }


	 public boolean isOver(Point point) {
	 int xLeft = this.position.x;
	 int yTop = this.position.y;
	 int xRight = xLeft + this.width();
	 int yBotton = yTop + this.height();

	 return ( (point.x > xLeft && point.x < xRight) &&
	 (point.y > yTop && point.y < yBotton) );
	 }
	 
	 public MouseListener mouseListener() {
		 return (MouseListener) new MouseListenerAdapter() {
			 @Override
			 public void mouseClicked(MouseEvent me) {
			 if(!isOver(me.getPoint()))
			 return;
			 onMouseClick(me);
		 }
    };
  }
	 
	 protected void onMouseClick(MouseEvent me) {
		 dispatchButtonClickEvent(me);
		}

}
