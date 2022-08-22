package javabook7;

import java.util.Scanner;

public class BookArray2 {

	public static void main(String[] args) {
		Book []libary = new Book[5];
		libary[0] = new Book("태백산맥", "조정래");
		libary[1] = new Book("데미안", "헤르만 헤세");
		libary[2] = new Book("어떻게 살 것인가", "유시민");
		libary[3] = new Book("토지", "박경리");
		libary[4] = new Book("어린왕자", "생택쥐베리");
		
//		for(int i = 0; i<libary.length; i++) {
//			libary[i].showBookInfo();
//		}
//		for(int i = 0; i<libary.length; i++) {
//			System.out.println(libary[i]);
//		}
		

		boolean isBook = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("검색>");
		String title = sc.nextLine();
		for(int i = 0; i<libary.length; i++) {
			if(title.equals(libary[i].getBookname())) {
				isBook = true;
				break;
//				System.out.println("책있음");
//			else System.out.println("책없음");
		}
		}
		if (isBook)System.out.println("책있음");
		else System.out.println("책없음");
		
	}

}
