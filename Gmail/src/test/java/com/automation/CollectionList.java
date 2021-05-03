package com.automation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;



public class CollectionList {

	public static void main(String[] args) throws Exception {
		
		List<String> list = new ArrayList<String>();      //these r not synchronized
//		List<String> list = new LinkedList<String>();  //these r not synchronized
//		List<String> list = new Vector<String>();      //these r  synchronized
		
//		Set<String> list = new HashSet<String>(); //these r unordered
//		Set<String> list = new TreeSet<String>(); // these r alphabetical ordered
		list.add("HI");
		list.add("Name");
		list.add("BTL");
		list.add("GAD");
		list.add("FGT");
		list.add("BTL");
		
//		list.remove("HI");
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.contains("BTL")); //contains is used to check whether avaliable or not
		for (String string : list) {
			System.out.println(string);
		}
		

	}

}
