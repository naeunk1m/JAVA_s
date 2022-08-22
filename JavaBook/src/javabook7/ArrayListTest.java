package javabook7;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList <Book> libary = new ArrayList<Book>();
		
		libary.add(new Book("�¹���", "������"));
		libary.add(new Book("���̾�", "�츣�� �켼"));
		libary.add(new Book("��� �� ���ΰ�", "���ù�"));
		libary.add(new Book("����", "�ڰ渮"));
		libary.add(new Book("�����", "�����㺣��"));
		
		for(int i = 0; i<libary.size(); i++) {
			Book book = libary.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("===����for�� ���===");
		for(Book book : libary) {
			book.showBookInfo();
		}
	}

}
