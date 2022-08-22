package javabook6;

public class Q6_Test {

	public static void main(String[] args) {
		Q6_CardCompany cc = Q6_CardCompany.getInstance();
		Q6_Card c1 = cc.createCard(); //serialNum++ --> 1
		Q6_Card c2 = cc.createCard(); //serialNum++ --> 2
		Q6_Card c3 = cc.createCard(); //serialNum++ --> 3
		
		System.out.println(c1.serialNum+" "
						  +c2.serialNum+" "
						  +c3.serialNum);
		
		System.out.println(c1.CardID+" "
						  +c2.CardID+" "
						  +c3.CardID);

	}

}
