package homewark2_2.homewark01.model.vo;

import java.awt.print.Printable;

public class Employee {
	
	public String name;
	public String team;
	private String job;
	private int money;
	int bo;
	
	public void Print(String name,String team) {
		this.name = name;
		this.team = team;
		System.out.println(name + team);
	}
	
}
