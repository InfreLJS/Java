public class Pro2 {
	public static int sub(int num1, int num2){
		int sum;
		sum=num1-num2;
		return sum;
	}
	public static int mul(int num1, int num2){
		int sum_1;
		sum_1=num1*num2;
		return sum_1;
	}
	public static int div(int num1, int num2){
		int sum_2;
		sum_2=num1/num2;
		return sum_2;
	}
	

	public static void main(String[] args) {
    int tot;
    //tot= sub(5,3); ----교체가 가능하다.
    System.out.println(sub(5,3));
    tot= mul(4,6);
    System.out.println(tot);
    tot= div(10,2);
    System.out.println(tot);
    
    
		
	
	}

	

}
