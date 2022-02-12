package ch12;
import java.util.HashSet;
import java.util.Iterator;



public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	// Array Lis도 Generic  class이다. < > 
	// method를  보면 iterator() 가 있는데  순회 할 수 있음  
	
	// Add를 하기 전에 ensureCapacity를 먼저 하게 된다 
	// Capa가 넘으면 더 큰 arryList 만들어서 복사함 
	
	public MemberHashSet() {
		
		hashSet=new HashSet<>();
	}
	public MemberHashSet(int size) {
		
		hashSet=new HashSet<>(size);		
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	

	
	public void showAllMember() {
		
		for(Member m:hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	
	// iterator 사용  
	public boolean removeMember(int memberId) {
		Iterator <Member>ir=hashSet.iterator();
		// <Member 안 하면 Objevt반환 
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				hashSet.remove(member);
				return true;				
			}
		}
		return false;
	}
	

	
}
