package Polymorphism;

//Class name-differ(using extends)
//Method-same
//Argument- same
// In a different class , the method name should be same and argument name should be
//same is called overriding

public class MethodOverriding extends ExtendOverriding{
	public static void work() {
		System.out.println("Tcs");
	}
	
	public static void main(String[] args) {
		work();
	}

}
