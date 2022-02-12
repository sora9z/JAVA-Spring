package ch16.Scheduler;

public class PriorityAllocation implements Scheduler {
	@Override
	public void getNextCall() {
		
		System.out.println("상담 전화를 고객 등급에 따라 대기열에서 가져온다 ");		
	}

	@Override
	public void sendCallAgent() {
		System.out.println("업무 능력이 우수한 상담원에게 배분한다 .");		
	}

}
