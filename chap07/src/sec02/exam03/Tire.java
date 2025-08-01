package sec02.exam03;

public class Tire {
	// 필드
	public int maxRotaion; // 최대 회전수(최대 수명)
	public int accumulatedRotation; // 누적 회전수(누적 회전수 == 최대 회전수) 같아지면 타이어 펑크 
	public String location; // 타이어의 위치 
	
	
	// 생성자
	public Tire(String location, int maxRotaion) {
		this.location = location;
		this.maxRotaion = maxRotaion;
	}
	
	// 메소드
	// 타이어를 1회전 시키는 메소드 
	// 회전할 수 있다면 true, 펑크가 나서 회전할수 없다면 false
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotaion) {
			System.out.println(location + " Tire 수명 : " + ( maxRotaion - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
