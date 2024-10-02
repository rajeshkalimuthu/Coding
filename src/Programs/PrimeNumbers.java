package Programs;

import java.util.Scanner;

public class PrimeNumbers {

	
	public static void main(String[] args) {
//		int n;
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("check the number");
//		 n=sc.nextInt();
//		 int count=0;
//		 for(int i=2;i<n/2;i++) {
//			 if(n%2==0) {
//				 count=1;
//			 }}
//			 if(count==0) {
//				 System.out.println("prime");
//			 }else {
//				 System.out.println("non prime");
//			 
//		 }
		
		int count;
		for(int i=0;i<=100;i++) {
			count=0;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					count++;
				}
				}
				if(count==0) {
					System.out.println(i);
					
				
				
			}
		}
	}
}

