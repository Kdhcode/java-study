package sec01.quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz1 {
//	Quiz
//	문자열을 입력 받아 입력된 문자열 중 숫자들의 합계를 출력하시오.
//
//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45
//
//	[출력]
//	1) 15
//	2) 15
//	3) 15

	public static void main(String[] args) {

			System.out.print( "입력) ");
			Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			int sum = 0;
			char[] str = new char[str1.length()];
			
			for (int j = 0; j < str.length; j++) {
				str[j] = str1.charAt(j);
			}
			
			for (int i1 = 0; i1 < str.length; i1++) {
				if ('0'<= str[i1] && str[i1] <= '9') {
					sum += (int)str[i1] - '0';
				}
			}
			
			System.out.println("출력) " + sum);
		}
	}
	

