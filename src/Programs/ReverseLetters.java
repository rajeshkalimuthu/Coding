package Programs;

import java.util.Scanner;

public class ReverseLetters {
	
	public static void main(String[] args) {
		String g="Neelakandan";
		
		String h="";
		for(int i=g.length()-1;i>=0;i--) {
			char c=g.charAt(i);
			h=h+c;
			
		}
		System.out.println(h);
		
		
		String k;
		Scanner sc=new Scanner(System.in);
		System.out.println("reverse");
		String l="";
		k=sc.next();
		for(int j=k.length()-1;j>=0;j--) {
			char ch=k.charAt(j);
			l=l+ch;
		}
		
		System.out.println("reverseletter:"+l);
		
	}

}
