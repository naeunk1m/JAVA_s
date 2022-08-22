package scheduler;

import java.io.IOException;

public class SchedulerTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ� ");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ� ");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ� ");
		
		int ch = System.in.read();
		Scheduler1 scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin1();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob1();
		}
		else if(ch == 'P' || ch =='p') {
			scheduler = new PriorityAllocation1();
		}
		else if(ch == 'A' || ch =='a') {
			scheduler = new AgentGetCall1();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
