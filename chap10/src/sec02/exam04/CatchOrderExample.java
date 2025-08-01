package sec02.exam04;

public class CatchOrderExample {
	
	public static void main(String[] args) {
		
		try {
			String data1 = args[0]; // 실행 예외 발생
			String data2 = args[1];			

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // "a20" 같이 문자가 섞이면 실행 예외 발생
			int result = value1 + value2;
			
			System.out.println(result);
			
		} 
//		catch (Exception e) {
//			System.out.println("실행에 문제가 있습니다.");
//		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 반환할 수 없습니다.");
		} catch (Exception e) {
			// 모든 예외는 Exception을 상속 받음, 다형성에 의해 모든 예외 객체가 대입 가능(제일 마지막에 위치해야 함)
			// Exception 타입을 쓰는 경우? 예외와 상관없이 고통적으로 예외 처리를 할 때(일반적으로 많이 씀) 
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
