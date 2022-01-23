package ch16.Scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println(" 전화 상담원 할당 방식을 선택하시오 ");
		System.out.println("R : Order by");
		System.out.println("L: Low Wait");
		System.out.println("P : Priority");
		
		int ch =System.in.read();
		Scheduler scheduler=null;
		
		if(ch=='R'||ch=='r') {
			scheduler=new RounRobin();
		}
		else if(ch=='L'||ch=='l') {
			scheduler=new  LeastJob();
		}
		else if(ch=='P' || ch=='p') {
			scheduler=new PriorityAllocation();
			
		}
		else return;
		
		scheduler.getNextCall();
		scheduler.sendCallAgent();
		

	}

}
