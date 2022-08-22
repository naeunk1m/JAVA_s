package javabook7;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList <Book> libary = new ArrayList<Book>();
		
		libary.add(new Book("태백산맥", "조정래"));
		libary.add(new Book("데미안", "헤르만 헤세"));
		libary.add(new Book("어떻게 살 것인가", "유시민"));
		libary.add(new Book("토지", "박경리"));
		libary.add(new Book("어린왕자", "생택쥐베리"));
		
		for(int i = 0; i<libary.size(); i++) {
			Book book = libary.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("===향상된for문 사용===");
		for(Book book : libary) {
			book.showBookInfo();
		}
	}

}
