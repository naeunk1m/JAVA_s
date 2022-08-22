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
//		b1.title = "홍길동";
		b1.setTitle("홍길동");
		b1.setAuthor("허균");
		b1.setPrice(1000);
		b2.title = "백설공주";
		b2.Author = "작가 미상";
		b2.price = 1000;

		
System.out.println("도서명:"+b1.getTitle()+" 저자:"+b1.getAuthor()+" 가격:"+b1.getPrice());
System.out.println("도서명:"+b2.getTitle()+" 저자:"+b2.getAuthor()+" 가격:"+b2.getPrice());
	}

}
