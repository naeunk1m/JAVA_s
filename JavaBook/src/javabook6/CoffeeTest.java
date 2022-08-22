package javabook6;

public class CoffeeTest {

	public static void main(String[] args) {
				Person kim = new Person("kim");
				Person lee = new Person("lee");
				
				kim.setMenu("아메리카노");
				kim.setMoney(4000);
				kim.goCoffeeshop(new CoffeeShop("별다방"));
				
				lee.setMenu("라떼");
				lee.setMoney(4500);
				lee.goCoffeeshop(new CoffeeShop("콩다방"));
				
				System.out.println(kim.showInfo());
				System.out.println(lee.showInfo());

		}
	}

