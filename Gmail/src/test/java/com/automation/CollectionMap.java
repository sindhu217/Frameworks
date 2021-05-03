package com.automation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionMap {

	public static void main(String[] args) {
		Map<String, String> value = new HashMap<>();
//		Map<String, String> value = new TreeMap<String, String>(); //BASED ON KEY ALAPHABETICAL ORDER
//		Map<String, String> value = new  Hashtable<String, String>();
		value.put("NAME", "SINDHU");
		value.put("sss", "hhh");
		value.put("ggg", "jjj");
		value.put("nnn","mmm");
		System.out.println(value.size());
		System.out.println(value.isEmpty());
		System.out.println(value);
		System.out.println(value.get("sss"));
		Set<String> set =value.keySet();   //to get all keyset use set
		for (String string : set) {
			System.out.println(string);
		}
Collection<String> nam =value.values();  //to get values use collection
for (String string : nam) {
	System.out.println(string);
}
value.remove("NAME");
System.out.println(value);
	}

}
