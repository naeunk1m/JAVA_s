package p0602;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ڸ� �Է��ϼ���(��Ģ���길 ����)>>");
		String op = sc.next();
		System.out.println("1. ������ �Է��ϼ���>>");
		int A = sc.nextInt();
		System.out.println("2. ������ �Է��ϼ���>>");
		int B = sc.nextInt();
		
		
		
//		switch(op) {
//		case "+": System.out.println("��� : "+(A+B));break;
//		case "-": System.out.println("��� : "+(A-B));break;
//		case "*": System.out.println("��� : "+(A*B));break;
//		case "/": System.out.println("��� : "+(A/B));break;
//		default : System.out.println("������ �߸� �Է�");
//		}
//	

		
		if (op.equals ("+")){
			System.out.println("��� : "+(A+B));
		}
		else if (op.equals("*")) {
			System.out.println("��� : "+(A*B));	
		}
		else if (op.equals("-")) {
			System.out.println("��� : "+(A-B));
		}
		else if (op.equals("/")) {
			System.out.println("��� : "+(A/B));
		}
		else {
			System.out.println("�����ڸ� �߸� �Է���.");
		}
	}
}
	




