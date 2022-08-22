package javabook6;

public class BeanCoffee {
int money;
	
	public String coffee1(int money) {
		
		this.money += money;
		if(money == Menu.beanamericano) {
			return "아메리카노 나왔습니다.";
		}
		else if (money == Menu.beanlatte) {
			return "라떼 나왔습니다.";
		}
		else {
			return null;
		}
	}
}
