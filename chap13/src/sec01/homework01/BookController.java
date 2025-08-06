//package sec01.homework01;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//
//public class BookController implements Comparable{
//		List<Book> bookList = new ArrayList<Book>();
//    public BookController(){
//    	Book book = new Book("느리게 나이드는 습관", "정희원", "인문", 16200);
//    	Book book1 = new Book("코스모스", "칼 세이건", "자연과학", 17910);
//    	Book book2 = new Book("나에게 들려주는 예쁜 말", "김종원", "어린이", 15610);
//    	Book book3 = new Book("혼자 공부하는 자바", "신용권", "기타", 25240);
//        
//    	bookList.add(book);
//    	bookList.add(book1);
//    	bookList.add(book2);
//    	bookList.add(book3);
//
//    }
//
//    public void insertBook(Book bk){
//        bookList.add(bk);
//    }
//
//    public List<Book> selectList(){
//        return bookList;
//    }
//
//    public List<Book> searchBook(String keyword){
//    	List<Book> searchList = new ArrayList<>();
//        
//    	for (Book search : bookList) {
//			if (bookList.contains(keyword))  {
//				searchList.add(search);
//			}
//		}
//		return searchList;
//    }
//
//    public Book deleteBook(String title, String author){
//    	List<Book> removeBook = null;
//        for (int i = 0; i < bookList.size(); i++) {
//			if (bookList.get(i).equals(title) && bookList.get(i).equals(author)) {
//				removeBook.add(bookList.remove(i));
//				break;
//			}
//		} 
//		return (Book) removeBook;
//    }
//
//    public int ascBook(){
//    	Collections.sort(bookList);
//		    // Collections.sort와 Comparable활용
//		    // 책 이름 기준으로 오름차순 정렬 후 1 반환
//    	return 1;
//    }
//
//	@Override
//	public int compareTo(Object other) {
//		return this.Boo - other ;	
//	}
//}