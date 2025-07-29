package homewark.homewark2;

public abstract class Menu {
	String name;
	int price;
	
	Menu(){}
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "메뉴명은"  + name + "이고, 가격은 " + price + "원입니다.";
	}
	
	abstract void cook();
	
}
