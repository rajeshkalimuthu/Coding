package String;

public class StringMethod {
	
	public static void main(String[] args) {
		String s="Rajesh";
		String a="Neelakandarajeshwaran";
		char c=s.charAt(5);
		System.out.println(c);
		
		boolean b=s.equals("Rajesh");
		System.out.println(b);
		boolean b2=s.equalsIgnoreCase("rajesh");
		System.out.println(b2);
		
		boolean b3=s.contains("je");
		System.out.println(b3);
		
		String[]s1=a.split("a");
		System.out.println(a.length());
		System.out.println(s1.length);
		System.out.println(s1[6]);	
//		for(int i=0;i<s1.length;i++) {
//			System.out.println(s1[i]);
//			
//		}
		for(String x:s1) {
			System.out.println(x);
		}
		
		String u=a.toLowerCase();
		System.out.println(u);
		
		String t=a.toUpperCase();
		System.out.println(t);
		
		String d=a.substring(4);
		System.out.println(d);
		
		String f=a.substring(4, 17);
		System.out.println(f);
		
		int l=a.indexOf("k");
		System.out.println(l);
		int l2=a.indexOf("x");
		System.out.println(l2);
		
		int l3=a.lastIndexOf("a");
		System.out.println(l3);
		
		String g=a.replace("rajesh", "vighnes");
		System.out.println(g);
		
		 boolean fg=a.startsWith("N");
		 System.out.println(fg);
		 
		 boolean gf=a.endsWith("n");
		 System.out.println(gf);
		 
	}

}
