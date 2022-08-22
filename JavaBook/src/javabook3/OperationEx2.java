package javabook3;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		// 1ºÐ º¹½À
		
		int num =5;
		int i = 10;
		
		boolean value = ((num = num*10) > 45) || ((i=i-5)<10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);

	}

}
