package p0530;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("������ �Է��ϼ���>>>");
		int input = sc.nextInt();
		
		
		System.out.println("input : " + input);
		String result = input>=60 ? "���": "��.";
		System.out.println(result);
		

	}

}
