package sec01.exam05;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.toString());  // 클새스 이름 @ 16진수 해시코드
		// 객체를 출력하려고 하면 tostring()이 자동 호출됨
		System.out.println(obj1);
		
		Date obj2 = new Date();
		System.out.println(obj2.toString()); // Date 클래스에서 날자 정보가 나오도록 재정의 한 것 
		System.out.println(obj2);
		
	}
}
