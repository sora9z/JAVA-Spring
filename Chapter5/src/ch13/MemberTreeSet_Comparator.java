package ch13;

import java.util.Iterator;
import java.util.TreeSet;



public class MemberTreeSet_Comparator {
	
	private TreeSet<Member_Comparator> treeSet;
	
	
	
	// 그리고 이거 사용하려면 default constructo를 만들어주어야 한다 Member에 
	
	public MemberTreeSet_Comparator() {
		//Comparator의 경우 어떤 것으로 구현을 해놨는지 Comparator 되는 대상을 써줘야 한다. 
		// TreeSet<Member_Comparator>(    )  이 안에 !@ 
		
		treeSet=new TreeSet<Member_Comparator>(new Member_Comparator()); 
		// Member_Comparator() 으로Comparator가 구현이 되어있으므로 이 클래스의  compare 함수 호출하여 
		//비교를 하라는 의미  
		//그리고 Member_Comparator는 defaut constructor가 있어야 한다.
		// TreeSet생성자 에는 Comparator 를 parameter 로 받는 것이 있다. 그것을 쓴 것. 
		
	}

	
	public void addMember(Member_Comparator member) {
		treeSet.add(member);
	}
	

	
	public void showAllMember() {
		
		for(Member_Comparator m:treeSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	
	// iterator 사용  
	public boolean removeMember(int memberId) {
		Iterator <Member_Comparator>ir=treeSet.iterator();
		// <Member 안 하면 Objevt반환 
		while(ir.hasNext()) {
			Member_Comparator member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				treeSet.remove(member);
				return true;				
			}
		}
		return false;
	}
	

	
}
