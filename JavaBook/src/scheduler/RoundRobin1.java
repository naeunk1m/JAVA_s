package scheduler;

public class RoundRobin1 implements Scheduler1{
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
		
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
		
	}
}
