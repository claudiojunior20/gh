package ticTacToe.component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import ticTacToe.gui.Paintable;

public class Button extends AbstractComponent{
	
	public Button() {
		super();
	}
	 
	public Button(int x, int y){
		super(x,y);
	}
	
	public Button(int x, int y, int width, int height){
		super(x, y, width, height);
	}
	 

	@Override
	public void paint(Graphics g) {
		g.drawRect(position.x, position.y, dimension.width, dimension.height);
		
	}
	 
}
