package ticTacToe.gui;

import java.net.URL;

import javax.swing.ImageIcon;

import ticTacToe.model.Mark;



public class AppTableModelTableViewTest {

	 TableModel tablemodel = new SimpleTableModel();
	 
	 MainWindow window = new MainWindow();
	 TableView tableview = createTableView();
	 
	 private ImageIcon loadImage(String fileName) {
		 String path = "../ticTacToe/images/";
		 URL url = getClass().getResource(path + fileName);
		 return new ImageIcon(url);
	 }
	 
	 private TableView createTableView() {
		 
		 ImageIcon icon = loadImage("tic-tac-toe.png");
		 TableView table = new TableView(50,50,50,200,icon);
		 
		 icon = loadImage("markX.png")
		 table.setIconX(icon);
		 
		 icon = loadImage("mark0.png");
		 table.setIconO(icon);
		 
		 return table;
	 }
	 
	 public AppTableModelTableViewTest() {
		 
		 tableview.setTableModel(tablemodel);
		 
		 ImageIcon icon = loadImage("background.jpg");
		 window.setBackground(icon);
		 
		 window.add(tableView);
		 
	 }
	 
	 private void play() throws Exception {
		 Thread.sleep(1000);
		 tableModel.setMark(1,1,Mark.X);
		 Thread.sleep(1000);
		 tableModel.setMark(0,0,Mark.O);
		 Thread.sleep(1000);
		 tableModel.setMark(0,1,Mark.X);
		 Thread.sleep(1000);
		 tableModel.setMark(2,1,Mark.O);
		 Thread.sleep(1000);
		 tableModel.setMark(2,0,Mark.X);
		 Thread.sleep(1000);
		 tableModel.setMark(0,2,Mark.O);
		 Thread.sleep(1000);
		 tableModel.setMark(1,0,Mark.X);
		 Thread.sleep(1000);
		 tableModel.setMark(1,2,Mark.O);
		 Thread.sleep(1000);
		 tableModel.setMark(2,2,Mark.X);
		 Thread.sleep(1000);
	 }
	 
	 public static void main(String[] args) throws Exception {
		 
		 AppTableModelTableViewTest app = new AppTableModelTableViewTest();
		 app.play();
	 }
	 
}
