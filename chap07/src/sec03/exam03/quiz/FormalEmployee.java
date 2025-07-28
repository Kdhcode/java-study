package sec03.exam03.quiz;

public class FormalEmployee extends Employee{
	private int empNo;
	private int Salary;
	
	public FormalEmployee(String name, String dept, int empNo, int salary) {
		super("정규직",name, dept);
		this.empNo = empNo;
		Salary = salary;
	}
	@Override
	public int getPay() {
		return Salary/12;
	}
	@Override
	public String getInfo() {
		return getType() + ", " + getName() + ", " + getDept() + ", " + empNo + ", " + Salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	
	public int getSalary() {
		return Salary;
	}
	

	


	
	
}
