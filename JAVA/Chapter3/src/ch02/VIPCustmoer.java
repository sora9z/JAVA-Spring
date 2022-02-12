package ch02;

public class VIPCustmoer extends Customer{
	
	
	double salesRatio; // 할인률  
	private int agentID; // 담당 agent

	// constructor
	public VIPCustmoer() {  
		bounusRatio=0.05;
		salesRatio=0.1;
		customerGrade="VIP";
	}
	
	public int agentID() {
		return agentID;
	}
	
	

}
