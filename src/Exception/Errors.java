package Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Exception:
//1. Unchecked exception(Run time exception)
//2. Checked exception(Compile time exception)
//Unchecked exception:
//1. ArithmaticException
//2. NullPointException
//3. InputMismatchException
//4. ArrayIndexOutOfBoundExcepion
//5. StringIndexOutOfBoundExcepion
//6. IndexOutOfBoundExcepion
//7. NumberFormatException
//Checked exception:
//1. IOException
//2. SQLException
//3. FileNotFoundException
//4. ClassNotFoundExceptio

public class Errors {
	public static void main(String[] args) {
//		System.out.println(12/2);
//		//System.out.println(10/0);//Arithmetic Exception -If we are trying to give any number divided by zero, we get Arithmatic exception
//		
//		
//		String s=null;
//		//System.out.println(s.length());//Null Point Exception-If we give Null in the string, it will throw the Null point exception. Because default value 
//		//of string is Null
//		
//		
//		Scanner r=new Scanner(System.in);
//		System.out.println("how are you");
//		String i=r.next();
//		System.out.println(i);
//		
//		int []num=new int[5];
//		System.out.println(num[6]);
		
		
//		String l="java";
//		char v=l.charAt(8);
//		System.out.println(v);// String out of bound Exception
		
//		List<Integer> ex = new ArrayList<Integer>();
//		ex.add(10);
//		ex.add(20);
//		ex.add(30);
//		ex.add(40);
//		System.out.println(ex.get(3));
//		System.out.println(ex.get(10)); // Index out of bound Exception
		
		
		String s="1234";
		System.out.println(s+5);// string +5
		int i = Integer.parseInt(s);
		System.out.println(i+5);// Integer +5
		 String s1="123Abc45";
		int j = Integer.parseInt(s1);
		System.out.println(j+5);// number format exception
		
		

		
		
		
	}
	
	

}
