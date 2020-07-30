class testGoods {
	int price;
	String name;
	int numberOfStock;
	int sold;
	
	testGoods(String name, int price, int numberOfStock, int sold){
		this.price=price;
		this.name=name;
		this.numberOfStock=numberOfStock;
		this.sold=sold;
	}
	void output(){
		System.out.println(name);
		System.out.println(price);
		System.out.println(numberOfStock);
		System.out.println(sold);
	}
}

public class Goods{
	public static void main(String[] args){
		testGoods camera=new testGoods("Nikon",200000,75,300);
		/*System.out.println("상품 이름: "+camera.name);
		System.out.println("상품 가격: "+camera.price);
		System.out.println("재고 수량: "+camera.numberOfStock);
		System.out.println("팔린 수량: "+camera.sold);*/
		camera.output();
		
	}
	
}




