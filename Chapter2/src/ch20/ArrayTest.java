package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr=new int[10]; // 0의 경우 0으로 초기화, double은 0.0 객페는 null로 초기화 됨 
		int total =0;
		
		for(int i=0,num=1;i<arr.length;i++) {
			arr[i]=num++; // 값을 할당 후 증가시킴
						
		}
		
		// inhanced for loop
		// 처음부터 끝까지 돌 때 사용한다 
		// num은 이 element의 dtype에 해당하는 변수 
		for(int num:arr ) {
			total+=num;
		}
		
		System.out.println(total);

	}

}
