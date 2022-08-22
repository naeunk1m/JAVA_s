package javabook6;

public class StarCoffee {
	int money;
	
	public String coffee1(int money) {
		
		this.money += money;
		if(money == Menu.staramericano) {
			return "아메리카노 나왔습니다.";
		}
		else if (money == Menu.starlatte) {
			return "라떼";
		}
		else {
			return null;
		}
	}
}
