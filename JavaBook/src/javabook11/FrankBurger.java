package javabook11;

public class FrankBurger {
	String name, burger, drink,sideMenu;
	
	public FrankBurger() {
		this("KIM", "프랭크버거셋뚜","밀솈","감튀");
	}
	
	
	
	public FrankBurger(String name, String burger, String drink, String sideMenu) {
		this.name = name;
		this.burger = burger;
		this.drink = drink;
		this.sideMenu = sideMenu;
	}

	public static void main(String[] args) {
		FrankBurger burger = new FrankBurger();
		
		System.out.println(burger.name);
		System.out.println(burger.burger);
		System.out.println(burger.drink);
		System.out.println(burger.sideMenu);

	}
}

