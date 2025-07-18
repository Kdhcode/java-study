package homework;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수 : ");
		int a = sc.nextInt();
		System.out.print("소프트웨어개발 점수 : ");
		int b = sc.nextInt();
		System.out.print("데이터베이스구축 점수 : ");
		int c = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수 : ");
		int d = sc.nextInt();
		System.out.print("정보시스템구축관리 점수 : ");
		int e = sc.nextInt();
		
		int avg = (a + b + c + d + e)/5;
		
		if ((40 <= a && a <= 100) && (40 <= b && b <= 100) 
				&& (40 <= c && c <= 100) && (40 <= d && d <= 100) 
				&& (40 <= e && e <= 100) && avg >= 60) {
			System.out.println("합격을 축하합니다.");
			
		} else if ((40 <= a && a <= 100) && (40 <= b && b <= 100) 
				&& (40 <= c && c <= 100) && (40 <= d && d <= 100) 
				&& (40 <= e && e <= 100) && avg < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
			
		} else if ((0 > a || a > 100) || (0 > b || b > 100)
				|| (0 > d || d > 100) || (0 > c || c > 100) 
				|| (0 > e || e > 100) ){
			System.out.println("잘못 입력하였습니다.");
			
		}else if (40 > a) {
			System.out.println("소프트웨어 설계 과목 과락으로 불합격입니다.");
		} else if (40 > b) {
			System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
		} else if (40 > c) {
			System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
		} else if (40 > d) {
			System.out.println("프르그래밍언어활용 과목 과락으로 불합격입니다.");
		} else if (40 > e) {
			System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
		} 
		
	}

}
