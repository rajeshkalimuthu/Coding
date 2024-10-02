package Programs;

public class SumNumber {
	
	public static void main(String[] args) {
		int g=4578933;
		int f=0;
		int n=0;
		while(g>0) {
			n=g%10;
			f=f+n;
			g=g/10;
			
		}
		System.out.println("Sum of given Number:"+f);
	}

}
