package homework;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("실행할 기능을 선택하세요.");
			System.out.println("1. 놀이동산 입장료 계산하기");
			System.out.println("2. 일기예보");
			System.out.println("3. 세개의 정수 비교하기");
			System.out.println("4. 철수네 공장");
			System.out.println("5. 헬스 마니아 철수");
			System.out.println("6. 합격인가? 불합격인가?");
			System.out.println("7. 종료");			
			System.out.print("선택 ");
			
			int ck = sc.nextInt();
			switch (ck) {
				case 1:
					System.out.println("===놀이동상 입장료 계산하기===");
					int a = sc.nextInt();
					if (a < 3) {
						System.out.println("당신의 놀이동산 요금은 무료 입니다.");
					} else if (a <= 3 && a < 13) {
						System.out.println("당신의 놀이동산 요금은 10000 입니다.");
					} else if (a <= 13 && a < 19) {
						System.out.println("당신의 놀이동산 요금은 20000 입니다.");
					} else if (a <= 19 && a <65 ) {
						System.out.println("당신의 놀이동산 요금은 30000 입니다.");
					} else {
						System.out.println("당신의 놀이동산 요금은 무료입니다.");
					}
					continue;
					
				case 2:
					System.out.println("===일기예보===");
					System.out.print("월: ");
					int a1 = sc.nextInt();
					System.out.print("기온: ");
					int b = sc.nextInt();
					if ((a1 == 1 || a1 == 2 ||a1 == 12) && b <=-15) {
						System.out.println("겨울 한파 경보");
					
					} else if ((a1 == 1 || a1 == 2 || a1 == 12) 
							&& (b <= -12 && b > -15)) {
						System.out.println("겨울 한파 주의보");
					
					} else if (a1 >= 3 && a1 <= 5) {
						System.out.println("봄");
					
					} else if ((a1 >= 6 && a1 <= 8) && b > 35) {
						System.out.println("여름 폭염 경보");
						
					} else if ((a1 >= 6 && a1 <= 8) 
							&& (b >= 33 && b <35)) {
						System.out.println("여름 폭염 주의");
					
					} else if (a1 >= 9 && a1 <= 11) {
						System.out.println("여름 폭염 경보");
	
					} else if (!(a1 <= 1 && a1 <=12)) {
						System.out.println("해당하는 계절이 없습니다.");
					}
					continue;
					
				case 3:
					System.out.println("===세개의 정수 비교하기===");
					System.out.print("첫번째 정수: ");
					int a2 = sc.nextInt();
					System.out.print("두번째 정수: ");
					int b1 = sc.nextInt();
					System.out.print("세번째 정수: ");
					int c = sc.nextInt();
					int d = 0;
					
					if (a2 <= b1 && a2 <= c) {
						d = a2;
					} else if (b1 <= a2 && b1 <= c) {
						d = b1;
					} else if (c <= a2 && c <= b1) {
						d = c;
					}
					System.out.println("세수 중에서 가장 작은 수는 " + d + "입니다.");
					continue;
					
				case 4:
					System.out.println("===철수네 공장===");
					System.out.print("수집된 코드 : ");
					int a3 = sc.nextInt();
					
					switch (a3) {
						case 400:
							System.out.println("잘못된 요청입니다.");
							break;
						case 404:
							System.out.println("요청하신 서비스를 찾을 수 없습니다.");
							break;
						case 500:
							System.out.println("처리 방법을 알수 없는 문제가 발생했습니다.");
							break;	
						case 503:
							System.out.println("일시적인 서버 오류가 발생하였습니다.");
							break;
						default:
							System.out.println("알수 없는 오류가 발생하였습니다.");
							break;
					}
					continue;
					
				case 5:
					System.out.println("===헬스 마니아 철수===");
					System.out.println("1. 스퀴트");
					System.out.println("2. 데드리프트");
					System.out.println("3. 벤치 프레스");
					System.out.println("4. 풀업");
					System.out.println("5. 종료");
					System.out.print("선택 : ");
					int a4 = sc.nextInt();
					
					if (a4 == 1) {
						System.out.println("스쿼트 운동 시간입니다.");
					} else if (a4 == 2) {
						System.out.println("데드리프트 운동 시간입니다.");
					} else if (a4 == 3) {
						System.out.println("벤치 프레스 운동 시간입니다.");
					} else if (a4 == 4) {
						System.out.println("풀업 운동 시간입니다.");
					} else if (a4 == 5) {
						System.out.println("오늘도 수고하셨습니다");
					} else if (a4 <= 0 ) {
						System.out.println("양수만 입력해주세요.");
					} else {
						System.out.println("목록에 있는 숫자만 입력해주세요.");
					}
					continue;
					
				case 6:
					System.out.println("===합격인가? 불합격인가?===");
					System.out.println("각 과목의 점수를 입력하세요.");
					System.out.print("소프트웨어설계 점수 : ");
					int a5 = sc.nextInt();
					System.out.print("소프트웨어개발 점수 : ");
					int b2 = sc.nextInt();
					System.out.print("데이터베이스구축 점수 : ");
					int c1 = sc.nextInt();
					System.out.print("프로그래밍언어활용 점수 : ");
					int d2 = sc.nextInt();
					System.out.print("정보시스템구축관리 점수 : ");
					int e = sc.nextInt();
					
					int avg = (a5 + b2 + c1 + d2 + e)/5;
					
					if ((40 <= a5 && a5 <= 100) && (40 <= b2 && b2 <= 100) 
							&& (40 <= c1 && c1 <= 100) && (40 <= d2 && d2 <= 100) 
							&& (40 <= e && e <= 100) && avg >= 60) {
						System.out.println("합격을 축하합니다.");
					} else if ((40 <= a5 && a5 <= 100) && (40 <= b2 && b2 <= 100) 
							&& (40 <= c1 && c1 <= 100) && (40 <= d2 && d2 <= 100) 
							&& (40 <= e && e <= 100) && avg < 60) {
						System.out.println("평균 점수 60점 미만으로 불합격입니다.");
					} else if ((0 > a5 || a5 > 100) || (0 > b2 || b2 > 100)
							|| (0 > d2 || d2 > 100) || (0 > c1 || c1 > 100) 
							|| (0 > e || e > 100) ){
						System.out.println("잘못 입력하였습니다.");
					}else if (40 > a5) {
						System.out.println("소프트웨어 설계 과목 과락으로 불합격입니다.");
					} else if (40 > b2) {
						System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
					} else if (40 > c1) {
						System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
					} else if (40 > d2) {
						System.out.println("프르그래밍언어활용 과목 과락으로 불합격입니다.");
					} else if (40 > e) {
						System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
					} 
					continue;
					
				case 7:					
					System.out.println("종료합니다");
					break;
					
				default:
					System.out.println("입력이 잘못되었습니다.");
					break ;
			}
		
			if(ck==7) {
			break;
		
			} 
		}
	}

}
