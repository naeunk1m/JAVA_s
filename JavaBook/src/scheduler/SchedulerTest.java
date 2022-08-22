package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
		
		int ch = System.in.read();
		
		if(ch == 'R' || ch == 'r') {
			RoundRobin scheduler1 = new RoundRobin();
			scheduler1.getNextCall();
			scheduler1.sendCallToAgent();
		}
		else if(ch == 'L' || ch == 'l') {
			LeastJob scheduler2 = new LeastJob();
			scheduler2.getNextCall();
			scheduler2.sendCallToAgent();
		}
		else if(ch == 'P' || ch =='p') {
			PriorityAllocation scheduler3 = new PriorityAllocation();
			scheduler3.getNextCall();
			scheduler3.sendCallToAgent();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		
	}

}
