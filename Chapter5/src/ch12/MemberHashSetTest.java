package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet MemberHashSet=new MemberHashSet();
		
		Member member1=new Member(100,"어태은");
		Member member2=new Member(200,"또란 ");
		Member member3=new Member(300,"여자친구 ");
		Member member4=new Member(400,"뿡 ");
		
		MemberHashSet.addMember(member1);
		MemberHashSet.addMember(member2);
		MemberHashSet.addMember(member3);
		MemberHashSet.addMember(member4);
		
		MemberHashSet.showAllMember();
	
		
		//중복 체크를 해주어야 한다 안해주면 아래의 코드 들어간다  		
		Member member5=new Member(400,"뿡 뿡 뿡 ");
		MemberHashSet.addMember(member5);		
		MemberHashSet.showAllMember();

	}

}
