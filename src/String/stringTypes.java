package String;

public class stringTypes {
	
	public static void main(String[] args) {
		String n="Neelakandan"; //literal&non Mutabul
		String m="Neelakandan";
		System.out.println(System.identityHashCode(m));
		System.out.println(System.identityHashCode(n));
		
		StringBuffer g=new StringBuffer("Neelakandan");//non literal &mutabul
		StringBuffer h=new StringBuffer ("Neelakandan");
		System.out.println(System.identityHashCode(h));
		System.out.println(System.identityHashCode(g));
		
		String b=n.concat(m);
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		
		g.append(h);
		System.out.println(g);
		System.out.println(System.identityHashCode(g));
		
	}

}
