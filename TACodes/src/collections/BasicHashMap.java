package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BasicHashMap 
{
	public static void main(String args[])
	{
		Map<String,Integer> wc = new HashMap<String, Integer>();
		
		wc.put("University of zihad", 12);
		wc.put("Dr. Zakir Naik", 3);
		wc.put("Dr. Zakir Naik", 18);
		
		System.out.println(wc.get("Dr. Zakir Naik"));
		
		Iterator<Map.Entry<String, Integer>> i = wc.entrySet().iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}
