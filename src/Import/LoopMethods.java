package Import;

public class LoopMethods {
	public static void main(String[] args) {
		int n=21;
		if(n<=21&n==20) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		//For loop
		int s=32;
		for(int i=10;i>5;i--) {
			for(int j=3;j<=10;j++) {
				System.out.println(i);
			}
			
			
		}
		
		for(int i=0;i<20;i++) {
			if(i==7) {
				break;
				
				
			}
			
			System.out.println(i);
			System.out.println("break");
			
		}
		
		for(int i=1;i<11;i++) {
			if(i==7) {
				continue;
			}
			System.out.println(i);
		}
		
		
		//////////////////////////
		
		//do 
		int i=11;
		while(i>5) {
			System.out.println(i);
			i--;
			
		}
		
		//do/whileLoop
		
	}

}
