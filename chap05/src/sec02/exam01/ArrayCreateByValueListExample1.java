package sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		// 값 목록을 이용해서 배열 생성
		// 1. 배열 변수 선언과 동시에 값 대입
//		int [] scores = new int[] {83, 80, 87};
		int [] scores = {83, 80, 87}; //리터럴 방식(축약형)
		
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		
		// 반복문을 이요한 합계 구하기 
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0; //소수점까지 계산하기 위해 실수 타입으로 변환
		System.out.println("평균 : " + avg);
		
		
		// Quiz: 
//		아래와 같은 문자열을 담는 과일 배열을 만들고 반복문을 이용하여 배열의 모든 요소를 출력해보세요.
//		"사과", "바나나", "오렌지", "포도", "딸기"
		
		String [] fruits = {"사과", "바나나", "오렌지", "포도", "딸기"};
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
	}

}
