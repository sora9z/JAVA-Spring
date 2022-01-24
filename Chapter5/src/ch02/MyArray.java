package ch02;

public class MyArray {
	
	int[] intArr; // int array
	int count;// 개수 
	
	public int ARRAY_SIZE;  //capacity
	public static final int ERROR_NUM = -99999999;
	
	public MyArray() {  // 기본은 10개 
		count=0;
		ARRAY_SIZE=10;
		intArr=new int[ARRAY_SIZE];
	}
	
	public MyArray(int size){
		count=0;
		ARRAY_SIZE=size;
		intArr=new int[size];
	}
	
	public void addElement(int num) {
		// 맨뒤에 값 add  
		if(count>=ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++]=num; // 넣고나서 count 증가 
	}
	
	public void insertElement(int position,int num) {
		// 원하 위치에 삽입 
		
		int i;
		
		if(count >= ARRAY_SIZE) { // memory full
			System.out.println("not enough memory");
			return;
			
		}
		 if(position<0||position>count) {  // index err
			 System.out.println("insert Error");
			 return;
		 }
		 
		 for(i=count-1;i>=position;i--) {
			 intArr[i+1]=intArr[i]; // 하나씩 이
		 }
		 intArr[position]=num;
		 count++;
		
	}
	
	public int removeElement(int position) {
	// 원하는 위치에서 값 제거  
		int ret=ERROR_NUM;
		
		if(isEmpty()) {
			System.out.println("Array is emply");
			return ret;
		}
		// position abailablity check 지우는 positio이 0보다 작거나 ARRAY_SIZE보다 크면 out of rang
		if(position <0 || position >count-1) {
		System.out.println("Position Out of range");
			return ret;
		}
		// error가 아닌 경우 답을 return에 assigi해서 반
		ret=intArr[position];
		
		
		for(int i=position;i<count-1;i++) {
			intArr[i]=intArr[i+1];
		}
		count--;
		
		return ret;	
	}
		
	
		public int getSize() {
			// 몇 개의 인자가 들었는지 
			return count;
		
		}
	
		public boolean isEmpty() {
			if(count==0)
				return true;
			else return false;
		
		}
		
		public int getElement(int position) {
			if(position<0 || position > count-1);{
				System.out.println("Search position is out of range. Current list count is "+count);
				return ERROR_NUM;
			}
		}
		
		public void printAll() {
			if(count==0) {
				System.out.println("The list in empty now");
				return;
			}
			for(int i=0;i<count;i++) {
				System.out.println(i+":"+intArr[i]);
			}
		}
		
		public void removeAll() {
			if(count==0) {
				System.out.println("The list in empty now");
				return;
				
			}
			
			for(int i=0;i<count;i++) {
				intArr[i]=0;
			}
		}
		
	
}
	
	
	
	
	
	




