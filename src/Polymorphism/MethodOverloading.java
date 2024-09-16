package Polymorphism;

//Taking more than one forms is called polymorphism or one task completed by many ways


public class MethodOverloading {
//	in single Class-same
//	Method-same
//	Argument-differ
//
//	 In a same class method name is same and the argument is different is called method
//	overloading
//	 the argument is depends on
//	 data types
//	 data types count
//	 data type order
	
	public static void family(int menbers) {
		System.out.println(3);
	}
	
	public static void family(String name) {
		System.out.println("Rajesh");
		
	}
	
	public static void family(int age,String name) {
		System.out.println(29);
		System.out.println("neelu");
		
	}
	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		
		m.family(0);
		family("name");
		family(29,"neelu");
		
	}
	

}
