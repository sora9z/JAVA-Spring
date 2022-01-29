package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2)*(-1);
		
		
	}
	
}
public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<>();
		
		set.add("sora");
		set.add("taen");		
		set.add("hong");
		
		System.out.println(set);
		//
		
		TreeSet<String> set2=new TreeSet<String>(new MyCompare());
		set2.add("Parkl");
		set2.add("Kang");
		set2.add("Mill");
		
		System.out.println(set2);
		
	
		

	}

}
