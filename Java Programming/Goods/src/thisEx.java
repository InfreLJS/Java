public class thisEx {
	int id;
	public thisEx(int x) {this.id=x;}
	public void set(int x) {this.id=x;}
	public int get() {return this.id;}
	
	public static void main(String[] args){
		thisEx ob1 = new thisEx(3);
		thisEx ob2 = new thisEx(3);
		thisEx ob3 = new thisEx(3);
		
		System.out.println(ob1.get());
		System.out.println(ob2.get());
		System.out.println(ob3.get());
		
		ob1.set(5);
		ob1.set(6);
		ob1.set(7);
	}

}
