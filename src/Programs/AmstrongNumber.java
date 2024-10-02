package Programs;

import java.util.Scanner;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		int a, i=0,j=0,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Amstrong Number");
		a=sc.nextInt();
		k=a;
		
		
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			
		}
		if(j==k) {
			System.out.println("amstrong");
		}else {
			System.out.println("nonAnstrong");
		}
		
		
		int r=0;
		for(int x=1;x<=10000;x++) {
			 int m=0,n=0;
			 
			 int p;
			p=x;
			while(p>0) {
				m=p%10;
				n=n+(m*m*m);
				p=p/10;
				
			}
			if(x==n) {
				r++;
				System.out.println(n);
			}
		}
		
		System.out.println(r);
		
	}

}
