package homework.homework1;

import java.util.Iterator;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";

		String[] person = str.split("\n");
		String[] pe = new String[4] ;
		for (String ss : person) {
			pe = str.split(",");
			for (String string : pe) {
				
				System.out.println(ss);
			}
		}
	
}

}