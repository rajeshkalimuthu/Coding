package Absraction;

public class ChildInterface implements fullyAbsraction {

	@Override
	public  void rate() {
		System.out.println("3434");
		
	}

	@Override
	public void ram() {
		System.out.println("8gb");
		
	}

	@Override
	public void processor() {
		System.out.println("12th gen");
		
	}
	public static void main(String[] args) {
		 ChildInterface ci=new ChildInterface();
		 ci.ram();
		 ci.processor();
		 ci.rate();
		 
	}

}
