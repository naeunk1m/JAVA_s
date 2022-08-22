package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ� ");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ� ");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ� ");
		
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
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		
	}

}
