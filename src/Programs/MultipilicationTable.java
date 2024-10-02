package Programs;

import java.util.Scanner;

public class MultipilicationTable {
	
	public static void main(String[] args) {
		int n;
		Scanner Sc=new Scanner(System.in);
		System.out.println("table");
		n=Sc.nextInt();
		for(int i=1;i<=16;i++) {
			int c=n*i;
			System.out.println(c);
		}
	}

}
