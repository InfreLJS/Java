package mentoring;
abstract class Car{
	int money;
	abstract protected void run();
}

class KIA extends Car{
	public void run(){
		System.out.println("±â¾Æ~!");
	}
}

class Yongho extends Car{
	public void run(){
		System.out.println("¿ëÈ£ ¸ÛÃæÀ×");
		System.out.println("Do It android");
	}
}
public class mentoring {
	public static void main(String[] args){
		Car ex= new KIA();
		Car ex2= new Yongho();
		
		ex.run();
		ex2.run();
		
		
	}
	

}
















