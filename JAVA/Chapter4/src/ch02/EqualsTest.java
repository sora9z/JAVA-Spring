package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1=new Student(100,"sora");
		Student std2=new Student(100,"sora");
		Student std3=std1;
		
		
		System.out.println(std1==std2); // false 다른 객체이므로		
		System.out.println(std1.equals(std2)); // 재정의 했으므로 true
		System.out.println(std1==std3); // 주소가 같으므로 같음 
		
		System.out.println(std1.hashCode()); // 재정의 해서 같
		System.out.println(std2.hashCode());
		
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.hashCode()); // 96354
		System.out.println(str2.hashCode()); // 96354
		
		Integer i=100; // new X
		System.out.println(i.hashCode()); //  정수값 100 이 나옴.
		
		
		// 진짜 해시는?
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		
		// clone
		std1.setName("kkkk"); // 생성이아니라 인스턴스의 상태를 그대로 복제.
		Student copyStudent=(Student)std1.clone(); // clone의 리턴은 Object이므로 donwncasting
		System.out.println(copyStudent);
		

	}

}
