package ch14;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2==0) return ERROR;
		
		return num1/num2;
	}
	
	// 추가 한 메서드
	public void showInfo() {
		System.out.println(" All Finished");
	}

	@Override
	public void description() {
//		super.description();
		System.out.println("Complete Calc overriding default function of Interface");
		
	
		
	}
	
	
	

}
