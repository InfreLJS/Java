package universalvm;

public class Product {

	String name;
	int stock;
	int price;

	public Product(String name, int stock, int price) {
		this.name = name;
		this.stock = stock;
		this.price = price;
	}

	@Override
	public String toString() {
		return (this.name + "/" + this.price + "원/" + this.stock + "개 남음");
	}
}
