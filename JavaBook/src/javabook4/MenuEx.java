package javabook4;

import java.util.Scanner;

public class MenuEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴�����");
		// boolean flag = true;
		int menuNum;
		do {
			System.out.println("<1>:1~10���� �հ�, <2>:����");
		menuNum = sc.nextInt();
			if (menuNum == 1) {
				int sum=0;
				for(int i=1; i<=10;i++) {
					sum+=i;
				}
				System.out.println("1~10������ �� :" +sum);
			}else if (menuNum !=2) {
				System.out.println("�޴� ��ȣ�� �����Ͻÿ�.");
			}
		}while(menuNum != 2);
		System.out.println("���α׷� ����");
	}

}
