public class OneToTen {
	public static void main(String[] args){
		int tot=0,tot2=0,tot3=0;
		int num=0,num2=0;
		for(int i=0;i<=10;i++){ //for¹®
			tot+=i;
		}
		System.out.println(tot);
		while(num<10){ //while¹®
			num++;
			tot2+=num;		
		}
		System.out.println(tot2);
		do{
			num2++;
			tot3+=num2;
		}
		while(num2<10); //do~while¹®
		System.out.println(tot3);
		
	}

}
