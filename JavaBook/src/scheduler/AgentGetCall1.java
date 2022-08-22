package scheduler;

public class AgentGetCall1 implements Scheduler1 {
	@Override
	public void getNextCall() {
		System.out.println("상담원이 다음 전화 요청");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("상담원이 전화 상담을 가져갔습니다.");
		// TODO Auto-generated method stub
		
	}
}
