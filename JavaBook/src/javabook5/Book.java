package javabook5;

public class Book {
	 String title;
	 String Author;
	 int price;
	
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return Author;
	}



	public void setAuthor(String author) {
		Author = author;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
//		b1.title = "ȫ�浿";
		b1.setTitle("ȫ�浿");
		b1.setAuthor("���");
		b1.setPrice(1000);
		b2.title = "�鼳����";
		b2.Author = "�۰� �̻�";
		b2.price = 1000;

		
System.out.println("������:"+b1.getTitle()+" ����:"+b1.getAuthor()+" ����:"+b1.getPrice());
System.out.println("������:"+b2.getTitle()+" ����:"+b2.getAuthor()+" ����:"+b2.getPrice());
	}

}
