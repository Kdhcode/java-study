package homework;

import java.util.Scanner;
// 문제 : https://devkgn24.notion.site/14afda8bae578074bad4f9c76f5f50b9
public class homeWork1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		String input = sc.nextLine();
		
		//변수 쪽에 equals()를 호출하면, intput이 null일 경우 예외(NPE)가 발생할 수 있음 
//		String output = input.equals("간다")  ? "온다" : "간다";
		//리터럴이나 상술를 앞에 두면, input이 null이어도 안전하게 비교 가능 (null - safe)
		String output = "간다".equals(input)  ? "온다" : "간다";

		System.out.println("앵무새 : " + output);
	}

}
