package ticTacToe.component.button;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Set;

import ticTacToe.component.AbstractComponent;
import ticTacToe.component.button.ButtonClickEvent.MouseButton;
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
	//Observer Pattern 
	Set<ButtonClickListener> buttonClickListeners = new HashSet<>();
	
	public void addButtonClickListener(ButtonClickListener listener) {
		buttonClickListners.add(listener);
		
	}
	public void removeButtonClickEvent(MouseEvent me) {
		
		MouseButton button = ((me.getButton() == MouseEvent.BUTTON1) ? MouseButton.LEFT :
			                  (me.getButton() == MouseEvent.BUTTON2) ? MouseButton.MIDDLE :
			                   MouseButton.RIGHT);
		
		  ButtonClickEvent event = new ButtonClickEvent(this, button);
		  buttonClickListeners.forEach(listener->listener.onClick(event));
		
		
		
	}
	}

