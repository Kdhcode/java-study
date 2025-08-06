//package sec01.homework01;
//
//import java.util.Iterator;
//import java.util.Scanner;
//
//public class BookMenu {
//	Scanner sc = new Scanner(System.in);
//	BookController bc = new BookController();
//	
//	// Scanner 객체 생성
//	// BookController 객체 생성
//
//public void mainMenu(){
//	while (true) {			
//		System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");  
//		System.out.println("원하시는 업무의 번호를 선택하세요.");  
//		System.out.println("1. 새 도서 추가");  
//		System.out.println("2. 도서 전체 조회");  
//		System.out.println("3. 도서 검색 조회");  
//		System.out.println("4. 도서 삭제");  
//		System.out.println("5. 도서 오름차순 정렬");  
//		System.out.println("9. 종료");  
//		System.out.print("메뉴 선택: "); 
//		
//		int ck = sc.nextInt();
//		
//		switch (ck) {
//			case 1:
//				insertBook();
//				break;
//			case 2:
//				selectList();
//				break;
//			case 3:
//				searchBook();
//				break;
//			case 4:
//				deleteBook();
//				break;
//			case 5:
//				ascBook();
//				break;
//			case 9:
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			default:
//				System.out.println("잘못 입력하였습니다.다시 입력해주세요.");
//				break;
//		}
//	}
//}
//
//	// 1. 새 도서 추가 view 메소드
//public void insertBook(){}
//public void insertBook(String title,String author,String category,int price){
//	System.out.println("===도서 등록===");
//	System.out.print("도서명: ");
//	title = sc.nextLine();
//	System.out.print("저자명: ");
//	author = sc.nextLine();
//	System.out.print("장르: ");
//	int cck = sc.nextInt();
//	switch (cck) {
//		case 1:
//			category = "인문";
//			break;
//		case 2:
//			category = "자연과학";
//			break;
//		case 3:
//			category = "어린이";
//			break;
//		default:
//			category = "기타";
//			break;
//	}
//	System.out.print("가격: ");
//	price = sc.nextInt();
//    
//}
//
//	// 2. 도서 전체 조회 view 메소드
//public void selectList(){
//	System.out.println("=== 전체 조회 ===");
//	bc.selectList();
//	if (bc.bookList.isEmpty()) {
//		System.out.println("존재하는 도서가 없습니다.");
//	}else {
//		for (Book book : bc.bookList) {
//			System.out.println(book);
//		}
//	}
//}
//
//	// 3. 도서 검색 조회 view 메소드
//public void searchBook(){
//	System.out.println("=== 도서 검색 ===");
//	System.out.print("검색어: ");
//	String keyword = sc.nextLine();
//   
//    bc.searchBook(keyword);
//	
//    if (bc.searchBook(keyword).isEmpty()) {
//		System.out.println("검색 결과가 없습니다.");
//	} else {
//		for (Book scb : bc.s) {
//			
//		}
//	}
//    
//}
//
//	// 4. 도서 삭제 view 메소드
//public void deleteBook(){
//	System.out.println("=== 도서 삭제 ===");
//
//	System.out.print("도서명: ");
//	String title = sc.nextLine();
//	System.out.println("저자명: ");
//	String author = sc.nextLine();
//	bc.deleteBook(title, author);
//    // -> 같은 도서명을 가졌지만 저자명이 다른 경우
//    // 다른 도서명을 가졌지만 저자명이 같은 경우도 있을 수 있음
//    // 3. BookController의 deleteBook() 메소드로 title, author 전달
//    // -> 결과값을 임의의 Book(참조변수명 remove) 객체에 대입
//    // 4. 조건식 이용
//    // 4-1. remove가 존재하는 경우
//    // -> "성공적으로 삭제되었습니다." 문구 출력
//    // 4-2. remove가 존재하지 않는 경우
//    // -> "삭제할 도서를 찾지 못했습니다."라는 문구 출력
//}
//	// 5. 도서 오름차순 정렬 view 메소드
//public void ascBook(){
//	
//    // 1. BookController의 ascBook() 메소드 호출
//    // 2. 메소드 호출 결과가 1이면 성공, 그 외 실패
//    // 3. 성공시 "정렬에 성공하였습니다." 출력 후 전체 목록 조회
//    // 4. 실패시 "정렬에 실패하였습니다." 출력
//}
//}
