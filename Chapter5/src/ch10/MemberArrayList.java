package ch10;
import java.util.ArrayList;
import java.util.Iterator;



public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	// Array Lis도 Generic  class이다. < > 
	// method를  보면 iterator() 가 있는데  순회 할 수 있음  
	
	// Add를 하기 전에 ensureCapacity를 먼저 하게 된다 
	// Capa가 넘으면 더 큰 arryList 만들어서 복사함 
	
	public MemberArrayList() {
		
		arrayList=new ArrayList<>();
	}
	public MemberArrayList(int size) {
		
		arrayList=new ArrayList<>(size);		
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		for(int i=0;i<arrayList.size();i++) {
			Member member=arrayList.get(i);
			
			int tempId=member.getMemberId();
			
			if(tempId==memberId) {
				arrayList.remove(i);
				return true;
			}		
		}
		
		
	System.out.println(memberId+" is not in the arrayList");
		
		return false;		
	}
	
	public void showAllMember() {
		
		for(Member m:arrayList) {
			System.out.println(m);
		}
		System.out.println();
	}
	
	// iterator 사용  
	public boolean removeMemberIr(int memberId) {
		Iterator <Member>ir=arrayList.iterator();
		// <Member 안 하면 Objevt반환 
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				arrayList.remove(member);
				return true;				
			}
		}
		return false;
	}
	
	
	

	
}
