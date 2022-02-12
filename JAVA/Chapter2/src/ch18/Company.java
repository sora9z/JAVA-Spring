package ch18;
// Singleton 회사라는 객체는 유일해야 한다.
// 한 개의 인스턴스만 존재하게 만드는데, 외부에서 회사를 여러 개 만들 수도 있다(default 생성자)
// 외부에서 생성자를 new 할 수 없도록 생성자를 private으로 제공한다.
public class Company {
	// 유일한 instance는 이 내부에서 만든다 static으로 
	private static Company instance=new Company();
	private Company() {
		
		
	}
	// 유일한 instance에 접근을 하기 위한 method
	// static을 하지 않으면 instance를 생성 하고나서 아래의 method를 호출할 수 있기 때문에 
	// static을 해준다 그래야 외부에서 class 이름으로 method호출이 가능하기 때문 
	public static Company getInstance() {
		
		if(instance==null) 
			instance=new Company();
		
		return instance	;
	}
	// 여기까지가 싱글
	
	
	

}
