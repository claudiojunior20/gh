package c;

public class Counter {
	
	private int start;
	private int end;
	private int step;
	
	public Counter() {
		this.start=1;
		this.end = 10;		
		this.step = 1;
	}
	public Counter(int start, int end, int step) {
		this.start = start;
		this.end = end;		
		this.step = step;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public void setEnd(int end) {
		this.end = end;
	}
	
	public void setStep(int step) {
		this.step = step;
	}
	public void count() {
		for(int value=start;value<=end;value+=step) {
			System.out.println(value);
		}
	}

}
