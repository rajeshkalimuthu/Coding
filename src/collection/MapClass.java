package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
		
	}
}
