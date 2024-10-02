package Programs;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
	
	public static void main(String[] args) {
		String g="can be wait until what we need";
		String []f=g.split(" ");
		
		Map<String, Integer>mp=new HashMap<String, Integer>();
		for(String h:f) {
			if(mp.containsKey(f)) {
				int x=mp.get(f);
				mp.put(h, x+1);
			}else {
				mp.put(h, 1);
			}
		}
		System.out.println(mp);
	}

}
