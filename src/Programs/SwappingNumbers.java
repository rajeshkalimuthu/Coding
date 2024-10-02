package Programs;

import java.util.Scanner;

public class SwappingNumbers {
	
	public static void main(String[] args) {
		int a=123, b=213;
		int c;
		//swapping numbers using third variables
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		int w;
		int x;
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("the numbers are");
		w=sc.nextInt();
		x=sc.nextInt();
		y=w;
		w=x;
		x=y;
		System.out.println("swipping numbers are");
		System.out.println(w);
		System.out.println(x);
		
		//Swapping variables without using third variables
		int e,q;
		Scanner ds=new Scanner(System.in);
		System.out.println("the numbers are");
		e=ds.nextInt();
		q=ds.nextInt();
		e=e+q;
		q=e-q;
		e=q-e;
		System.out.println("swapping Numbers are");
		System.out.println(e);
		System.out.println(q);
		
		
		
		
		
		
		
		
		
	}

}
