package homewark;

public class homewark1 {

	public static void main(String[] args) {
		int[] stu = {152, 180, 165, 158, 171};
		int highstu = 0;
		for (int i = 0; i < stu.length; i++) {
			for (int j = 1; j < stu.length; j++) {
				if(stu[i] > stu[j]) {
					highstu = stu[i];
					stu[i] = stu[j];
					stu[j] = highstu;
				}
				
			}
			System.out.println(stu[i]);
		}
	}

}
