package javabook6;

public class CoffeeTest {

	public static void main(String[] args) {
				Person kim = new Person("kim");
				Person lee = new Person("lee");
				
				kim.setMenu("�Ƹ޸�ī��");
				kim.setMoney(4000);
				kim.goCoffeeshop(new CoffeeShop("���ٹ�"));
				
				lee.setMenu("��");
				lee.setMoney(4500);
				lee.goCoffeeshop(new CoffeeShop("��ٹ�"));
				
				System.out.println(kim.showInfo());
				System.out.println(lee.showInfo());

		}
	}

