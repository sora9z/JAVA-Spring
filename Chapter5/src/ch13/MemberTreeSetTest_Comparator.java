package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest_Comparator {

	public static void main(String[] args) {
		
	
		
		MemberTreeSet_Comparator memberTreeSet=new MemberTreeSet_Comparator();
		
		Member_Comparator member1=new Member_Comparator(100,"어태은");
		Member_Comparator member2=new Member_Comparator(200,"또란 ");
		Member_Comparator member3=new Member_Comparator(300,"여자친구 ");
		Member_Comparator member4=new Member_Comparator(400,"뿡 ");
		Member_Comparator member5=new Member_Comparator(400,"뿡 뿡 뿡 ");
		
		memberTreeSet.addMember(member1);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member3);
		memberTreeSet.addMember(member4);
		memberTreeSet.addMember(member5);		
		
		memberTreeSet.showAllMember();
	
		

	}

}
