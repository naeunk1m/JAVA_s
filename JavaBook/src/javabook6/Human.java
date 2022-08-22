package javabook6;

import cooperation.Bus;

public class Human {
	String name;
	int money;
	
	Human (String name, int money){
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.coffee1(4000);
		if(message != null) {
			this.money -= money;
			System.out.println(name + " " + money +" "  + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.coffee1(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + " " + money +" "  + message);
		}
	}
}


