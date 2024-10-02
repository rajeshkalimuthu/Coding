package constructor;

public class Const {

	public  Const() {
		this(10);
		System.out.println("rajesh");
		
	}
	public Const(int i) {
		this("neelu");
		System.out.println(45);
	}
	
	public Const(String g) {
		
		System.out.println("mani");
	}
	
	public void Const(int k) {
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		Const c=new Const();
		c.Const(12);
		
		
	}
	
	
}
