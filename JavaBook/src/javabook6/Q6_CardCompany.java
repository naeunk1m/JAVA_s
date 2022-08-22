package javabook6;

public class Q6_CardCompany {
	private static Q6_CardCompany cardCompany = new Q6_CardCompany();
	
	Q6_Card card;
	
	private Q6_CardCompany () {
		
	}

	public static Q6_CardCompany getInstance() {
		return cardCompany;
	}
	
	Q6_Card createCard() {
		return new Q6_Card();
	}
}
