package homewark2_2.homewark02.model.vo;

import java.awt.print.Printable;

public class Person {
	
	private String name;
	private String stay;
	public String sell;
	public double ad;
	public double bo;
	
	public void Print(String sell,double ad, double bo) {
		this.sell = sell;
		this.ad = ad;
		this.bo = bo;
		System.out.println(sell + ad + bo);
	}
	
}
