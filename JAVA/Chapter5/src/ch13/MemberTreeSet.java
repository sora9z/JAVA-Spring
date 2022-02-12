package ch13;

import java.util.Iterator;
import java.util.TreeSet;



public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;
	// Array Lis도 Generic  class이다. < > 
	// method를  보면 iterator() 가 있는데  순회 할 수 있음  
	
	// Add를 하기 전에 ensureCapacity를 먼저 하게 된다 
	// Capa가 넘으면 더 큰 arryList 만들어서 복사함 
	
	public MemberTreeSet() {
		
		treeSet=new TreeSet<>();
	}
	
	//Comparator의 경우 어떤 것으로 구현을 해놨는지 Comparator 되는 대상을 써줘야 한다. 
	// 그리고 이거 사용하려면 default constructo를 만들어주어야 한다 Member에 
	
//public MemberTreeSet() {
//		
//		treeSet=new TreeSet<Member>(new Member());
//	}

	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	

	
	public void showAllMember() {
		
		for(Member m:treeSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	
	// iterator 사용  
	public boolean removeMember(int memberId) {
		Iterator <Member>ir=treeSet.iterator();
		// <Member 안 하면 Objevt반환 
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				treeSet.remove(member);
				return true;				
			}
		}
		return false;
	}
	

	
}
