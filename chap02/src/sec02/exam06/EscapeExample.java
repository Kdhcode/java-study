package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		//이스케이프 문자: 역스래쉬가 붙은 문자로 특수한 용도로 사용된다.
		// 보통 문자열 작성할 때 이용
				
		System.out.println("변호\t이름\t직업");
		System.out.println("변호\n이름\n직업"); // println 에서 ln 은 개행을 뜻함
		System.out.print("행 단위 출력");
		System.out.print("행 단위 출력");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.print("우리는 \"개발자\" 입니다.");
		System.out.print("봄\\여름\\가을\\겨울");
		
	}

}
