package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		// 중첩 for문에서 break 사용시 가장 가까운 for문을 빠져나감
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j == 3) {
					break;
				}
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("프로그램 실행 종료");
		
		
		// 이름 붙은 반복문 
		Outter: for (char upper = 'A';  upper <= 'Z'; upper++) {
			for (char lower = 'a';  lower <= 'a'; lower++){
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}	
		
}


