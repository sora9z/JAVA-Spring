package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		set.add("kang");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set);
		//
		
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		Member member1=new Member(100,"어태은");
		Member member2=new Member(200,"또란 ");
		Member member3=new Member(300,"여자친구 ");
		Member member4=new Member(400,"뿡 ");
		Member member5=new Member(400,"뿡 뿡 뿡 ");
		
		memberTreeSet.addMember(member1);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member3);
		memberTreeSet.addMember(member4);
		memberTreeSet.addMember(member5);		
		
		memberTreeSet.showAllMember();
	
		

	}

}
