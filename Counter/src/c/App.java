package c;

import java.util.Scanner;

public class App {

	Scanner scanner = new Scanner(System.in);
	Counter counter = new Counter();
	
	private void exercise_1() {
		counter = new Counter(1,10,1);
          counter.count(value->System.out.println(value));
	}
	
	private int readInt(String message) {
		System.out.println(message);
		int value = scanner.nextInt();
		return value;
	}
	
	private void exercise_2() {
	
		int x = readInt("Valor de x:");
		int y = readInt("Valor de y:");
		 Counter counter = new Counter(x,y,2);
		 counter.count();
	}
	public static void main(String[]args) {
		 
	 App app = new App();
	 app.exercise_1();
	 app.exercise_2();
	}
}
