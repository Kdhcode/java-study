package homewark.homework02;

public class Rectangle {
	
	
	int calculateRound(int h, int m) {
		return h*2 + m*2;
	}
	
	int calculateArea(int h, int m) {
		return h*m;
	}
	
	void printlufo(int h, int m) {
		System.out.println("1. 사각형의 둘레");
		System.out.println(calculateRound(h, m) + "cm");
		System.out.println("2. 사각형의 넓이");
		System.out.println(calculateArea(h, m) + "cm");
		
	}
	
	
	
	
	
	
}
