package homewark2_1;

import java.util.Scanner;

public class homewark1Example {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();		
		int num2 = sc.nextInt();
		
		String sumname1= sc.nextLine();		
		String sumname2= sc.nextLine();
		
		String sumname3= sc.nextLine();		
		String sumname4= sc.nextLine();
		
		homewark1 homewark1 = new homewark1();
		String line1 = homewark1.sum(sumname1,sumname2);
		int line2 = homewark1.num(num1, num2);
		String line3 = homewark1.same(sumname3,sumname4);
		
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		
		
		
		
		
	
		
		
		
	}
		
}
