package javabook11;

class Book{
	int bookNumber;
	String bookTitle;



Book(int bookNumber,String bookTitle) {
	this.bookNumber=bookNumber;
	this.bookTitle=bookTitle;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return bookTitle + ","+bookNumber;
}
}
public class ToStringEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bok1 = new Book(200,"°³¹Ì");
		
		System.out.println(bok1);
		System.out.println(bok1.toString());

	}

}
