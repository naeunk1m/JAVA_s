package javabook6;

public class Person {
	String menu;
	String name;
	int money;
	CoffeeShop coffeeshop;
	
	Person(String name) {
		super();
		this.name = name;
		
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void goCoffeeshop(CoffeeShop coffeeshop) {
		this.coffeeshop = coffeeshop;
	}
	
	String showInfo() {
		return name+" "+money+" "+menu+" "+coffeeshop.name;
	}
	
}
