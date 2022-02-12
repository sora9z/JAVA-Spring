package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest_Comparator {

	public static void main(String[] args) {
		
	
		
		MemberTreeSet_Comparator memberTreeSet=new MemberTreeSet_Comparator();
		
		Member_Comparator member1=new Member_Comparator(200,"Kim");
		Member_Comparator member2=new Member_Comparator(400,"Kang ");
		Member_Comparator member3=new Member_Comparator(500,"Taeng ");
		Member_Comparator member4=new Member_Comparator(100,"AIKI ");
		Member_Comparator member5=new Member_Comparator(300,"ZㅐZ ");
		
		memberTreeSet.addMember(member1);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member3);
		memberTreeSet.addMember(member4);
		memberTreeSet.addMember(member5);		
		
		memberTreeSet.showAllMember();
	
		

	}

}
