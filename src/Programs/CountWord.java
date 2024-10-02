package Programs;

import java.util.HashMap;
import java.util.Map;

public class CountWord {
	
	public static void main(String[] args) {
		String g="Neelakandarajeshwaran";
		
//		for(int i=0;i<g.length();i++) {
//			
//			char c=g.charAt(i);
//			System.out.println(c);
//			
//			
//		}
//		int h=g.length();
//		System.out.println(h);
		
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		char[] ch=g.toCharArray();
		for(char c:ch) {
			if(mp.containsKey(c)) {
				int x=mp.get(c);
				mp.put(c, x+1);
			}else {
				mp.put(c, 1);
			}
			
		}
		System.out.println(mp);
	}

}
