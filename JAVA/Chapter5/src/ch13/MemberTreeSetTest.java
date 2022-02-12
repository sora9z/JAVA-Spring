package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		set.add("kang");
		set.add("Kim");
		set.add("Lee");
		
		
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		Member member1=new Member(200,"KIM");
		Member member2=new Member(400,"Kang ");
		Member member3=new Member(500,"Taeng ");
		Member member4=new Member(100,"AIKI ");
		Member member5=new Member(300,"ZㅐZ ");
		
		memberTreeSet.addMember(member1);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member3);
		memberTreeSet.addMember(member4);
		memberTreeSet.addMember(member5);		
		
		memberTreeSet.showAllMember();
	
		

	}

}
