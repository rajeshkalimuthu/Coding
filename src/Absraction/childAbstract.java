package Absraction;

public class childAbstract extends PartialAbsraction{

	@Override
	void savings() {
		System.out.println("not now");
	}

	@Override
	void bank() {
		System.out.println("canara");
		
	}
	public static void main(String[] args) {
		money();
		childAbstract cc=new childAbstract();
		cc.savings();
		cc.bank();
	}

}
