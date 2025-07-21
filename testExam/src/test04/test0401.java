package test04;

public class test0401 {

	public static void main(String[] args) {
		int num1 = 0; 
		int num2 = 0;
		while (num1 + num2 != 5) {
			num1 = (int) (Math.random()*6) + 1;
			num2 = (int) (Math.random()*6) + 1;
		}
		System.out.println("5가 나오는 조합 :" + num1 +", "+ num2);
	}

}
