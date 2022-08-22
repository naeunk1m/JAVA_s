package p0602;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산자를 입력하세요(사칙연산만 가능)>>");
		String op = sc.next();
		System.out.println("1. 정수를 입력하세요>>");
		int A = sc.nextInt();
		System.out.println("2. 정수를 입력하세요>>");
		int B = sc.nextInt();
		
		
		
//		switch(op) {
//		case "+": System.out.println("결과 : "+(A+B));break;
//		case "-": System.out.println("결과 : "+(A-B));break;
//		case "*": System.out.println("결과 : "+(A*B));break;
//		case "/": System.out.println("결과 : "+(A/B));break;
//		default : System.out.println("연산자 잘못 입력");
//		}
//	

		
		if (op.equals ("+")){
			System.out.println("결과 : "+(A+B));
		}
		else if (op.equals("*")) {
			System.out.println("결과 : "+(A*B));	
		}
		else if (op.equals("-")) {
			System.out.println("결과 : "+(A-B));
		}
		else if (op.equals("/")) {
			System.out.println("결과 : "+(A/B));
		}
		else {
			System.out.println("연산자를 잘못 입력함.");
		}
	}
}
	




