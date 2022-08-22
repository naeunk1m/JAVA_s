package abstractex;

public class Test {

	public static void main(String[] args) {
//		A a ; // 추상클래스는 객체 생성할 수 없다. 
//			  // 추상클래스는 참조변수 타입은 될 수 있다. 
//		B b = new B();
//		b.methodA();
//		a = new B(); // 자동형변환
//		a.methodA();
		
		
//		Computer c1 = new Computer(); abstract클래스는 객체 생성할 수 없다
		DeskTop c2 = new DeskTop();
//		NoteBook c3 = new NoteBook();
		MyNoteBook c4 = new MyNoteBook ();
		c2.display();
		c2.typing();
//		c4

	}

}
