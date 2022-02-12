package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member member1=new Member(100,"어태은");
		Member member2=new Member(200,"또란 ");
		Member member3=new Member(300,"여자친구 ");
		Member member4=new Member(400,"뿡 ");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(member4.getMemberId());
		memberArrayList.showAllMember();
		
		memberArrayList.removeMemberIr(member2.getMemberId());
		memberArrayList.showAllMember();

	}

}
