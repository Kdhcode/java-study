package sec04.test;

import java.net.MulticastSocket;
import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = sc.next();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String ag = sc.next();
		
		System.out.print("3. 전화번호: ");
		String coll = sc.next();
		System.out.println("\n");
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + name);
		System.out.println("2. 주민번호 앞 6자리: " + ag);
		System.out.println("3. 전화번호: " + coll);
		
	}

}
