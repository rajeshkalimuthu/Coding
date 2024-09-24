package Array;

public class ArrayMethods {
	
	public static void main(String[] args) {
		int[]i=new int[5];
		System.out.println(i[2]);
		i[0]=23;
		i[1]=45;
		i[2]=56;
		i[3]=65;
		i[4]=12;
		//i[5]=56;
		System.out.println(i[4]);
		int len=i.length;
		System.out.println(len);
//		for(int j=0;j<i.length;j++) {
//			System.out.println(i[j]);
//		}
		
		for(int k:i) {
			System.out.println(k);
		}
	}

}


// In a single variable we can store multiple values
//Disadvantage of arrays:
// It support only similar data types
// It is a fixed size
// Memory wastage is high
// To overcome these we go for collections