package ch10;

public class TypeConversionTeset {

	public static void main(String[] args) {
		
		
		byte bNum=125;
		int iNum=bNum;
		int jNum =300; // byte가 표현못함
//		byte bNum2=jNum; cast를 하가로 error가 나온다.
		byte bNum2=(byte)jNum; // range 만큼만 나옴.
		
		System.out.println(bNum);
		System.out.println(iNum);
		System.out.println(jNum);
		System.out.println(bNum2); 
		
		double dNum=3.14;
		int inum=(int)dNum;
		System.out.println(inum);
		
		// type conversion이 일어났을 때 
		// 오류가 발생할 수 있는 경우
		
		double dNum2=1.2;
		float fNum=0.9f;
		
		int iNum3=(int)dNum2+(int)fNum;
		// 먼저 integer로 변경이 되어서 1+0이 되
		int iNum4=(int)(dNum2+fNum);
		//2.1 에서 정수로 변환되어서 2가출력
		
		System.out.println(iNum3); 
		System.out.println(iNum4);
		


	}

}
