package ch16.Scheduler;

public class RounRobin implements Scheduler
{

	@Override
	public void getNextCall() {
		
		System.out.println("상담 전화를 순대로 대기열에서 가져온다 ");		
	}

	@Override
	public void sendCallAgent() {
		System.out.println("다음 순서의 상담원에게 배분한다 .");		
	}

}
