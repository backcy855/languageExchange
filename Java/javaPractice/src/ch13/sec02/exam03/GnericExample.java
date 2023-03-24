package ch13.sec02.exam03;

public class GnericExample {
	public static void main(String[] args) {
		BOx box1 = new BOx();
		box1.content = "100";
		
		BOx box2 = new BOx();
		box2.content = "100";
		
		BOx box3 = new BOx();
		box3.content = 100;
		
		boolean result1 = box1.compare(box2);
		System.out.println("resut1: " + result1);
		
		boolean result2 = box1.compare(box3);
		System.out.println("resut2: " + result2);
		
	}
}
