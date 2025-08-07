//package sec01.homework02;
//
//import java.util.Scanner;
//
//public class LotteryMenu {
//	Scanner sc = new Scanner(System.in);
//	LotteryController lc = new LotteryController();
//	
//	public void mainMethod() {
//		while (true) {
//		System.out.println("===== 로또 번호 추첨 =====");
//		System.out.println("원하시는 메뉴의 번호를 입력하세요.");
//		System.out.println("1. 추첨 대상 추가");
//		System.out.println("2. 추첨 대상 삭제");
//		System.out.println("3. 추첨 대상 목록 조회");
//		System.out.println("4. 당첨 대상 구성");
//		System.out.println("5. 정렬된 당첨 대상 확인");
//		System.out.println("6. 당첨 대상 검색");
//		System.out.println("9. 종료");
//		
//		int num = sc.nextInt();
//		
//		switch (num) {
//			case 1: insertObject(); break;
//			case 2: deleteObject(); break;
//			case 3: searchObject(); break;
//			case 4: winObject(); break;
//			case 5: sortedWinObject(); break;
//			case 6: searchWinner(); break;
//			case 9: break;
//			default: System.out.println("잘못 입력하였습니다. 다시입력해주세요."); break;
//			}
//		}
//	}
//	
//	// 1. 추첨 대상 추가용 view 메소드
//	public void insertObject() {
//		System.out.print("추가할 추첨 대상 수: ");
//		int num = sc.nextInt();
//		for (int i = 0; i < num; i++) {
//			System.out.print("이름 : ");
//			String name = sc.nextLine();
//			System.out.print("휴대폰 번호(-빼고) : ");
//			String phone = sc.nextLine();
//			Lottery lottery = new Lottery(name, phone);
//		}
//		// 1. 추가할 추첨 대상 수를 입력 받음
//		// 2. 입력 받은 수만큼 추첨자 이름과 핸드폰 번호 입력 받음
//		// 3. 매개변수 생성자를 이용해서 Lottery 객체에 추첨자 정보 저장
//		// 4. Lottery 객체를 lc의 insertObject 메소드로 전달
//		// * 중복된 추첨 대상인 경우
//		// -> "중복된 대상입니다. 다시 입력하세요." 출력
//		// -> 이어서 다시 객체 입력하도록 해줌
//		// 5. 모든 입력이 완료되면 "n 명추가 완료되었습니다." 출력
// 	}
//	
//	// 2. 추첨 대상 삭제용 view 메소드
//	public void deleteObject() {
//		// 1. 삭제할 대상의 이름과 휴대폰 번호 입력 받음
//		// 2. 매개변수 있는 Lottery 생성자를 이용해 객체 구성
//		// 3. lc에 있는 deleteObject에 전달
//		// 4. 전달받은 값 true면 "삭제 완료되었습니다."
//		// 5. false면 "존재하지 않는 대상입니다." 출력
//	}
//	// 3. 추첨 대상 목록 조회 view 메소드
//	public void searchObject() {
//		// lc에 있는 searchObject에게 
//		// 당첨 가능성이 있는 대상(추첨 대상) 목록 조회 요청
//	}
//	
//	// 4. 당첨 대상 확인용 view 메소드
//	public void winObject() 
//		// lc에서 받아온 Set 객체를 표준 출력
//		// lc의 winObject 리턴값이 null이면 
//		// "추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다."출력
//	}
//	
//	// 5. 정렬된 당첨 대상 확인
//	public void sortedWinObject() {
//		// lc에서 받아온 Set 객체를 Iterator를 통해 출력
//	}
//	
//	// 6. 당첨 대상 검색용 view 메소드
//	public void searchWinner() {
//		// 1. 검색할 대상의 이름과 핸드폰 번호 받기
//		// 2. Lottery의 매개변수 생성자를 이용
//		// 3. 정보 담긴 객체를 lc의 searchWinner에 보내기
//		// 4. 받은 결과가 true면 "축하합니다. 당첨 목록에 존재합니다."
//		// 5. false면 "다음 기회에!" 출력 
//	}
//}
//
