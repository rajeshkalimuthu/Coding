package Programs;

import java.util.Scanner;

public class ReversePalindrome {
	
	public static void main(String[] args) {
		int n,a,f,b=0,c=0 ,g=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Reverse");
		n=sc.nextInt();
		a=n;
		while(a>0) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
		}
		System.out.println("reverseNumber");
		System.out.println(c);
		if(n==c) {
			
			System.out.println("palindrome");
			
		}else {
			System.out.println("Non Pali");
		}
		
		
		
		int i=234,j=0,k=0;
		
		while(i>0) {
			j=i%10;
			k=(k*10)+j;
			i=i/10;
			
		}
		
		System.out.println(k);
		
		
		
		//--------------//
		
		
		for(int x=1;x<=100;x++) {
			int y=0,z = 0;
			int w;
			w=x;
			while(w>0) {
				y=w%10;
				z=(z*10)+y;
				w=w/10;
				
				
			}
			if(x==z) {
				g++;
				System.out.println(z);
				
		}
			
			
		}
		
		System.out.println(g);
	}
	

}
