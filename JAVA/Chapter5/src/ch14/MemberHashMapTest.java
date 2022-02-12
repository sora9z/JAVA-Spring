package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap=new MemberHashMap();
		
		Member memberKang= new Member(1004,"kang");
		Member memberKim= new Member(1005,"kim");
		Member memberYang= new Member(1006,"yang");
		Member memberBang= new Member(1009,"bang");
	
		

		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberBang);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberBang);
		memberHashMap.addMember(memberYang);
		
		memberHashMap.showAll();
		
		HashMap<Integer,String> hashMap=new HashMap<>();
		hashMap.put(1001,"KK");
		hashMap.put(1002,"SK");
		hashMap.put(1004,"DK");
		hashMap.put(1006,"FK");
		
		System.out.println(hashMap); // key - value 쌍 으로 나옴 
		
		
	}

}
