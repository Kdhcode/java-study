package homewark2_1;

public class homewark1 {
	
	String sum;
	int num;
	String same;
	String sumname1;
	String sumname2;
	
	int num(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		} else {
			num = num1 * num2;
		}
		return num;
	}
	
	String sum(String sumname1, String sumname2){
		sum = sumname1 + sumname2;
		return sum;
	}
	
	
	String same(String sumname3, String sumname4) {
		if(sumname3.equals(sumname4)) {
			same = "true";
		}else {same = " false";}
		return same;
	
	}
}