package Programs;

import java.util.Scanner;

public class EvenOdd {
	
	//evennumber
	public static void main(String[] args) {
		int i=45;
		if(i%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		int n=0;
		int m=0;
		for(int j=0;j<=100;j++) {
			if(j%2==0) {
				System.out.println(j);
				n=n+j;//total of even Number
				m=m+1;// count of even number
				
			}
			
		}
		
		System.out.println(n);
		System.out.println(m);
		
		
		//--------------------------------------------//
		//Odd Number//
		
		int k=0;
		int l=0;
		for(int o=0;o<100;o++) {
			if(o%2==1) {
			System.out.println(o);
			k=k+o;
			l=l+1;
			}
		}
		System.out.println(k);
		System.out.println(l);
		
		
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		if(d%2==0) {
			System.out.println("evennumber");
		}else {
			System.out.println("oddNumber");
		}
		
		
	}

}
