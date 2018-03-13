package kh.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(4);
		ts.add(4);
		ts.add(3);
		
		System.out.println(ts); // 자동 정렬됨
		
		TreeSet<String> tstring = new TreeSet<>();
		tstring.add("Khan");
		tstring.add("Peanut");
		tstring.add("Bdd");
		tstring.add("PraY");
		tstring.add("GorillA");
		
		System.out.println(tstring);
		
		Iterator<String> itr = tstring.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
