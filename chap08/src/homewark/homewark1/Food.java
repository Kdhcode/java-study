package homewark.homewark1;

public class Food extends Product{
	int expirationDays;
	Food(){super("치킨", 20000);
	this.expirationDays = 3;}
	Food(String name, int price, int expiationDays){
		super("치킨", 20000);
		this.expirationDays = 3;
	}
	
	public int getExpirationDays() {
		return expirationDays;
	}

	int calculateDiscountRate() {
		if (expirationDays <= 1) {
			return (int) (getPrice() - getPrice()*0.8);
		} else if(2 <= expirationDays && expirationDays <= 5) {
			return (int) (getPrice() - getPrice()*0.5);
		} else if(6 <= expirationDays && expirationDays <= 10) {
			return (int) (getPrice() - getPrice()*0.2);
		}else {
			return getPrice();
		}
		
	}
	
	@Override
	public int calculatePrive() {
		return  calculateDiscountRate();
	}
	

}
