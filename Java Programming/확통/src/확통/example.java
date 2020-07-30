package Θ®Ελ;

import java.util.Scanner;
import java.lang.Math;

public class example{
	
	static double expectValue(int[] values){
		
		double expectvalue=0;
		double amount=values.length;
		int[] counts=new int[6];
		
		for(int i=0;i<values.length;i++){
			counts[values[i]-1]++;
		}
		double[] P=new double[6];
		
		for(int c=0;c<counts.length;c++){
			P[c]=counts[c]/amount;
		}
		
		for(int a=0;a<P.length;a++){
			System.out.println(P[a]);
			expectvalue+=P[a]*(a+1);
		}
		
		double dispersion=0;
		
		for(int b=0;b<P.length;b++){
			dispersion=dispersion+Math.pow((b+1-expectvalue), 2)*P[b];
		}
		System.out.println(dispersion);
		System.out.println(Math.sqrt(dispersion));
		
		return expectvalue;
	}
	
	public static void main(String[] args) {
		
		int[] value=new int[500000];
		for(int i=0;i<value.length;i++){
			value[i]=(int)(Math.random()*6)+1;
		}
		
		double a=expectValue(value);
		
		System.out.println(a);
		
	}
}
