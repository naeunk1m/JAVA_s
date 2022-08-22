package p0527;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("score>>>");
		int score = sc.nextInt();
		
		String result = (score>=90) ? "A":(score>=80)? "B":"C";
		System.out.println(result + "등급");

	}

}
