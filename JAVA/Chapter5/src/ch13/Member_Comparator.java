package ch13;

import java.util.Comparator;

public  class Member_Comparator implements Comparator<Member_Comparator>{
	
	private int memberId;
	private String memberName;
	
	
	public Member_Comparator(int memberId,String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}
	
	public Member_Comparator() {}


	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " s ID is "+memberId;
	}




	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member_Comparator) {
			
			Member_Comparator member=(Member_Comparator)obj;
			if(this.memberId==member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return memberId;
		
	}



	@Override
	public int compare(Member_Comparator member1, Member_Comparator member2) {
		// 매개변수가 2개이다.한 개는 this이고 한 개는 비교 대상이라는 의미이다. 
		return (member1.memberId-member2.memberId)*(-1);
		// Comprator를 쓰려면 MemberTreeSet 의 기본 생성자가 있어야 한다.
		
	}	

	
	

}
