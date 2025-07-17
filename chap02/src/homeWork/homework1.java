package homeWork;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg): ");
		double kg = sc.nextDouble();
		System.out.print("키(m): ");
		double m = sc.nextDouble();
		
		double bmi = kg / (m * m);
		System.out.printf("BMI 지수: %.1f\n", bmi);
		System.out.println("BMI 지수: " + (int) (bmi * 10) / 10.0);
		System.out.println("BMI 지수: " + Math.floor(bmi*10) / 10);
		
	}

}
