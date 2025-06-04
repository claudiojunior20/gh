package appTest;

import java.awt.Button;

import ticTacToe.gui

public class AppButtonPaintableTest {
   public static void main(String[]args) {
	   
	   MyWindow window = new MyWindow();
	   Button button = new Button();
	   window.add(button);
	   
	   
	   button = new Button(100,150);
	   window.add(button);
	   
	   button = new Button(200,200,50,50);
	   window.add(button);
   }
}
