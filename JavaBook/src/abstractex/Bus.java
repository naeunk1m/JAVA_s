package abstractex;

public class Bus extends Car {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������ �޸���.");
	}
	
	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("õ�������� �����մϴ�.");
	}
	
	public void takePassenger() {
		System.out.println("�°��� ������ �¿�ϴ�.");
	}
}
