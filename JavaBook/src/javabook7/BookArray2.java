package javabook7;

import java.util.Scanner;

public class BookArray2 {

	public static void main(String[] args) {
		Book []libary = new Book[5];
		libary[0] = new Book("�¹���", "������");
		libary[1] = new Book("���̾�", "�츣�� �켼");
		libary[2] = new Book("��� �� ���ΰ�", "���ù�");
		libary[3] = new Book("����", "�ڰ渮");
		libary[4] = new Book("�����", "�����㺣��");
		
//		for(int i = 0; i<libary.length; i++) {
//			libary[i].showBookInfo();
//		}
//		for(int i = 0; i<libary.length; i++) {
//			System.out.println(libary[i]);
//		}
		

		boolean isBook = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻�>");
		String title = sc.nextLine();
		for(int i = 0; i<libary.length; i++) {
			if(title.equals(libary[i].getBookname())) {
				isBook = true;
				break;
//				System.out.println("å����");
//			else System.out.println("å����");
		}
		}
		if (isBook)System.out.println("å����");
		else System.out.println("å����");
		
	}

}
