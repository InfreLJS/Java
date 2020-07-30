package universalvm;

import java.util.HashMap;

public class MyUVM {
	public static final int MAX_PRODUCTS = 10;
	public static final int MAX_EACH_PRODUCTS = 50;

	private int money = 0;

	HashMap<String, Product> productMap = new HashMap<String, Product>();

	public String addProduct(String name, int stock, int price) {
		if (productMap.containsKey(name)) {
			return (name + "에 해당하는 제품이 이미 있습니다!");
		} else {
			if (productMap.size() < MAX_PRODUCTS) {
				productMap.put(name, new Product(name, stock, price));
				return (name + "이 성공적으로 추가되었습니다.");
			} else {
				return ("자판기가 꽉 차서 추가할 수 없습니다!");
			}
		}
	}

	public String refillProduct(String name, int amount) {
		if (productMap.containsKey(name)) {
			if (productMap.get(name).stock < MAX_EACH_PRODUCTS) {
				productMap.get(name).stock += amount;
				return (name + "이 성공적으로 리필되었습니다.");
			} else {
				return ("해당 제품 칸이 꽉 차서 리필할 수 없습니다!");
			}
		} else {
			return (name + "에 해당하는 제품이 없습니다!");
		}
	}

	public String removeProduct(String name) {
		if (productMap.containsKey(name)) {
			productMap.remove(name);
			return (name + "이 성공적으로 제거되었습니다.");
		} else {
			return (name + "에 해당하는 제품이 없습니다!");
		}
	}
}
