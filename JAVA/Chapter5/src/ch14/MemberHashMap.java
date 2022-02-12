package ch14;

import java.util.HashMap;
import java.util.Iterator;


public class MemberHashMap {
	
	// key : integer 	Value : Member
	
	private HashMap<Integer,Member> hashMap;
	
	// constructor
	public MemberHashMap() {
		hashMap=new HashMap<>();
		
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(),member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
		System.out.println("no element");
		return false;
	}
	
	public void showAll() {
		// iterator는 key 또는 val에서  
		Iterator<Integer> ir=hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=hashMap.get(key);
			System.out.println(member);
			// 그냥 hashmap 출력해도 된다 .
		}
	}

}
