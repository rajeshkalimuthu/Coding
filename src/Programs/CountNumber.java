package Programs;

import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {
		int n=1235646;
		int a=0;
		while(n>0) {
			n=n/10;
			a++;
			
		}
		System.out.println(a);
		
		
		long i; long j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("counttheNumber");
		
		i=sc.nextLong();
		while(i>0) {
			i=i/10;
			j++;
			
		}
		System.out.println("countNumber:"+j);
		
	}

}
