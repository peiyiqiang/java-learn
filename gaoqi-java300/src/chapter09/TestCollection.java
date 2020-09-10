package chapter09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class TestCollection {
	public static void main(String[] args) {
		Collection<String>        c          = new ArrayList<>();
		
		List<Integer>             list       = new ArrayList<>();
		ArrayList<Integer>        arrayList  = new ArrayList<>();
		LinkedList<Integer>       linkedList = new LinkedList<>();
		Vector<Integer>           vector     = new Vector<>();
		
		Map<String, Integer>      map        = new HashMap<>();
		HashMap<Integer, String>  hashMap    = new HashMap<>();
		Hashtable<String, String> hashTable  = new Hashtable<>();
		TreeMap<Integer, String>  treeMap    = new TreeMap<Integer, String>();
		
		Set<String>               set        = new HashSet<>(); 
		HashSet<Integer>          hashSet    = new HashSet<>();
		TreeSet<Integer>          treeSet    = new TreeSet<>();
		
		list.add(5);
		System.out.println(list.contains(5));
		
		hashMap.put(20, "aa");
		hashMap.put(30, "bb");
		hashMap.put(10, "cc");
		
		treeMap.put(20, "aa");
		treeMap.put(30, "bb");
		treeMap.put(10, "cc");
		
		treeSet.add(300);
		treeSet.add(100);
		treeSet.add(200);
		
		for(Integer temp: hashMap.keySet()) {
			System.out.println(temp + ":" + hashMap.get(temp));
		}

		for(Integer temp: treeMap.keySet()) {
			System.out.println(temp + ":" + treeMap.get(temp));
		}
		
		System.out.println(hashMap);
		System.out.println(treeMap);
		System.out.println(treeSet);

	}
}
