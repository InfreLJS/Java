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
		/*System.out.println("��ǰ �̸�: "+camera.name);
		System.out.println("��ǰ ����: "+camera.price);
		System.out.println("��� ����: "+camera.numberOfStock);
		System.out.println("�ȸ� ����: "+camera.sold);*/
		camera.output();
		
	}
	
}




