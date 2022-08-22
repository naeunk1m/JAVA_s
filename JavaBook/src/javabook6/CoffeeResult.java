package javabook6;

public class CoffeeResult {

	public static void main(String[] args) {
		Human kim = new Human ("±è¾¾",10000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, 4000);
		kim.buyBeanCoffee(beanCoffee, 4500);
		

	}

}
