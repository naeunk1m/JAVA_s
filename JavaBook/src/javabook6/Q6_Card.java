package javabook6;

public class Q6_Card {
	static int serialNum; // �ʱⰪ 0
	int CardID;
	
	Q6_Card(){
		serialNum++;
		CardID = serialNum;
	
	}
}			
