package sec02.exam03;

public class KumhoTire extends Tire{
	

	// 생성자
		public KumhoTire(String location, int maxRotaion) {
			super(location, maxRotaion);
		}
		
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotaion) {
			System.out.println(location + " KumhoTire 수명 : " + ( maxRotaion - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}