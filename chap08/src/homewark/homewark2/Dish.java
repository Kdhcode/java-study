package homewark.homewark2;

public class Dish extends Menu{
	String ingredients;
	
	Dish(){}
	public Dish(String name, int price,String ingredients) {
		super("스테이크", 20000);
		this.ingredients = "소고기";
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	void cook() {
		
		return  + "재료는" + ingredients + "입니다";
	}

	
	
}
