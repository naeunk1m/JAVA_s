package javabook6;

public class StarCoffee {
	int money;
	
	public String coffee1(int money) {
		
		this.money += money;
		if(money == Menu.staramericano) {
			return "�Ƹ޸�ī�� ���Խ��ϴ�.";
		}
		else if (money == Menu.starlatte) {
			return "��";
		}
		else {
			return null;
		}
	}
}
