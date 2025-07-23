package sec03.exam04.quiz;

public class Animal {
	String kind;
	int age;
	// Quiz
	// 다른 생성자를 호출하는 this()를 써서 리팩토링 해보세요.
	
	public Animal(String kind , int age) {
    	this.kind = kind;
    	this.age = age;
	}
    public Animal(String kind) {
    	this(kind,1);
    	
    }
    public Animal(int age) {
    	this("사람",age);
    }
    
    // 출력 메소드
    public void info() {
    	System.out.println(kind + ": " + age + "살");
    }
}