package ch10;

public class BirthDay {
	
	private int day;
	private int year;
	private int month;
	// private를 하지 않으면 date.month=100 이렇게 넣을 수 있게 된다.
	// 맴버변수의 오류를 객체가 잘못 사용하게 될 수 있다. 
	// 이런 값들을 노출하게 되며 객체 사용에서 문제가 될 수 있다.
	// 이런 값은 private으로 막아주고 setter , getter method로 제어를 해주면
	// 오용을 막아줄 수 있다.
	
	private boolean isValid; // default는 false이다.
	
	//source->Generate getter & setter 에서 만들 수도 있다.
	// getter , setter 
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day=day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<1 || month >12)
			isValid=false;
		else {
			isValid=true;
			this.month=month;
		}
	}
	
	public void showData() {
		if(isValid) {
			System.out.println(year+"년"+month+"월"+day+"입니다 ");
		}
		else System.out.println(isValid+"입니다 ");
	}
	
public boolean getIsValid() {
	return isValid;
} // isValid의 경우 외부에서 수정항 일이 없으므로 get을  만들 필요는 없다 이런 경우 read only


	
	
	

}
