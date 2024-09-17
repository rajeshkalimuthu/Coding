package Absraction;

//It will support abstract method and non-abstract method.
// We can’t create object for abstract class because in the method signature we didn't
//mention any business logic. so
// In abstract method, we only mention abstract signature, won't create business logic
// It have 2 class, abstract class(sub class) and super class. we create object and business
//logic only in super class, won't create in abstract class

public abstract class PartialAbsraction {
	abstract void savings();
	public static void money() {
		System.out.println("needed");
	}
	abstract void bank();
		
	

}
