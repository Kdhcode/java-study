package test04;

public class test0403 {

	public static void main(String[] args) {
		
		int sum = 0;
		int max = 60;
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (x * 4 + y * 5 == max) {
					System.out.println("x :" + x + " y: " + y);
				}
			}
		}
	
	
	
	}
}
