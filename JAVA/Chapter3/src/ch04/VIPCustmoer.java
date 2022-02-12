package ch04;

public class VIPCustmoer extends Customer{
	
	
	public VIPCustmoer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		bounusRatio=0.05;
		salesRatio=0.1;
		customerGrade="VIP";
	}

	double salesRatio; // 할인률  
	private int agentID; // 담당 agent

	public int agentID() {
		return agentID;
	}

	@Override
	public int calPrice(int price) { //@overiid가 붙으면 override라고 인식하고 명칭이나 정의등이 바뀌면 err
		// TODO Auto-generated method stub
		bounusPoint+=price*bounusRatio;
		price-=(int)price*salesRatio;
		return price; // original return	
		
	}
	
	

}
