package packageInterfaceEx;

public class Customer implements Buy, Sell{
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("�����ϱ�");
		
	}
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("�Ǹ��ϱ�");
		
	}
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("�� �Ǹ� �ֹ�");
	}
}
