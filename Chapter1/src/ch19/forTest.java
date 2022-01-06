package ch19;

public class forTest {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=0,count=1;i<10;i++,count++) {			
			sum+=count; //이렇게도 가능 하지만 되도록 깔끔하게 
			
		}
		
		System.out.println(sum);
		
		// while로 하기
		int num=1;
		int total=0;
		
		while(num<=10){
			total+=num;
			num++;
		};
		
		System.out.println(total);
	
		

	}

}
