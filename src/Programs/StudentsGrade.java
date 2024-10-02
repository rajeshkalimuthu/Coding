package Programs;

import java.util.Scanner;

public class StudentsGrade {
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("t");
		n=sc.nextInt();
		if(100>=n&&n>=90) {
			System.out.println("A Grade");
		}
		else if(89>=n&&n>=80) {
			System.out.println("B Grade");
		}else if(79>=n&&n>=70) {
		System.out.println("c Grade");
		}
		else {
			System.out.println("S Grade");
		}
	}

}
