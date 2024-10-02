package Programs;

public class AscendingOrder {
	
	public static void main(String[] args) {
		int[]a={12,23,46,76,56,45};
		int t;
		int g=a.length;
		System.out.println(g);
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			System.out.println(a[i]);
		}
		
	}

}
 //12,23,46,76,56,45
//23,46,76,56,45