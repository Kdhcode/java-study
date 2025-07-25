package homewark.homework01;

public class Member {
	String memberld;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	
	Member (){}
	
	void changeName(String name){
		this.memberName = name;
	}
	
	void printName() {
		System.out.println(memberName);
	}
		
	
	
	
}
