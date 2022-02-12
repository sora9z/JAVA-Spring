package ch13;

public  class Member implements Comparable<Member>{
	
	private int memberId;
	private String memberName;
	
	
	public Member(int memberId,String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}


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
		
		if(obj instanceof Member) {
			
			Member member=(Member)obj;
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


	// 음수, 양수를 바꿔서 오름차순 , 내림차순 가능
	@Override
	public int compareTo(Member member) {
		
		return (this.memberId-member.memberId);
//		return (this.memberId-member.memberId)*(-1); // 내림차순  
		
//		if(this.memberId>member.memberId) {
//			return -1;
//		}
//		else if(this.memberId<member.memberId) {
//			return 1;
//		}
//		else return 0;		
	}	
	
	//Comparator의 경우 
//	@Override
//	public int compare(Member member1, Member member2) { // 이건 내개변수가 두 개 . 한 개는 나 한 개는 비교 대상
//		return (member1.memberId-member2.memberId)
//	}
//	
//	

}
