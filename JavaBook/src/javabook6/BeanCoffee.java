package javabook6;

public class BeanCoffee {
int money;
	
	public String coffee1(int money) {
		
		this.money += money;
		if(money == Menu.beanamericano) {
			return "�Ƹ޸�ī�� ���Խ��ϴ�.";
		}
		else if (money == Menu.beanlatte) {
			return "�� ���Խ��ϴ�.";
		}
		else {
			return null;
		}
	}
}
