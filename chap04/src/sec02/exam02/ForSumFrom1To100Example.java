package sec02.exam02;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ 100 합: " + sum);
//		System.out.println("1 ~ " + (i-1) + " 합: " + sum); //i는 for문 내부에서만 사용 가능한 지역변수
	
	}

}
