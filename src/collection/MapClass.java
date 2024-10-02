package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClass {

	public static void main(String[] args) {
		Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
		mp.put(12, 34);
		mp.put(null, 34);
		mp.put(22, null);
		mp.put(null, 34);
		System.out.println(mp);
		
		
		Map<String,Integer> pm=new LinkedHashMap<String, Integer>();
		pm.put("neelu", 67);
		pm.put("yugan",23);
		pm.put("ranjani", null);
		pm.put(null, 56);
		System.out.println(pm);
		
		Integer d=pm.get("neelu");
		System.out.println(d);
		
		Integer f=pm.get(null);
		System.out.println(f);
		 Set<String> l=pm.keySet();// Print the key only
		System.out.println(l);
		Collection<Integer> n=pm.values();//print the value only
		System.out.println(n);
		
		Set<Entry<String, Integer>> b=pm.entrySet();
		for(Entry<String,Integer>x:b) {
			System.out.println(x);
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
		
	}
}
