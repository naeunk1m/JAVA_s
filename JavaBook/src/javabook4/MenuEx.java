package javabook4;

import java.util.Scanner;

public class MenuEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴시작");
		// boolean flag = true;
		int menuNum;
		do {
			System.out.println("<1>:1~10까지 합계, <2>:종료");
		menuNum = sc.nextInt();
			if (menuNum == 1) {
				int sum=0;
				for(int i=1; i<=10;i++) {
					sum+=i;
				}
				System.out.println("1~10까지의 합 :" +sum);
			}else if (menuNum !=2) {
				System.out.println("메뉴 번호를 정정하시오.");
			}
		}while(menuNum != 2);
		System.out.println("프로그램 종료");
	}

}
