package Programs;

public class DesendingOrder {
	public static void main(String[] args) {
		
	
	int t;
	
	int[]a= {23,25,78,45,0,78,34,112,13};
	
	int g=a.length;
	System.out.println(g);
	for(int i=0;i<a.length;i++) {
		for(int j=1+i;j<a.length;j++) {
			if(a[i]<a[j]) {
				t=a[i];
				a[i]=a[j]; //swapping the number
				a[j]=t;
			}
		}
		
		System.out.println(a[i]);
		
	}
	System.out.println("the Maximun number is"+a[a.length-1]);
	}
}
