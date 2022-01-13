package ch03;

public class VIPCustmoer extends Customer{
	
	
	public VIPCustmoer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		bounusRatio=0.05;
		salesRatio=0.1;
		customerGrade="VIP";
		System.out.println("VIPCumtomer(int,String) is called");
	}

	double salesRatio; // 할인률  
	private int agentID; // 담당 agent

	// constructor
	/*public VIPCustmoer() { 
	 * super(0,"noname"); 이렇게 해도 되지만 ,,
		
		bounusRatio=0.05;
		salesRatio=0.1;
		customerGrade="VIP";
		
		System.out.println("VIPCumtomer(int,String) is called");
	}
	*/
	public int agentID() {
		return agentID;
	}
	
	

}
