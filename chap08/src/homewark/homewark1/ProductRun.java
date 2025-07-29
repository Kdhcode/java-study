package homewark.homewark1;

public class ProductRun {
	public static void main(String[] args) {
		Product[] product = new Product[2];
		product[0] = new Food();
		product[1] = new Book();
		
		for (Product pro : product) {
			System.out.println(pro.getName() + "의 최종 가격: " + pro.calculatePrive());
		}
	}
}
