package sec04.exam05.quiz;

public class Rectangle {
	int area;
	int length;
	int width;
	int height;
	
	
	void area() {
		area = width * height;
		System.out.println("면적 : " + area);
	} 
	void length() {
		length = width * 2 + height * 2;
		System.out.println("둘레 : " + length);
	} 
	
	
	
}
