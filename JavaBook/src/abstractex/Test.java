package abstractex;

public class Test {

	public static void main(String[] args) {
//		A a ; // �߻�Ŭ������ ��ü ������ �� ����. 
//			  // �߻�Ŭ������ �������� Ÿ���� �� �� �ִ�. 
//		B b = new B();
//		b.methodA();
//		a = new B(); // �ڵ�����ȯ
//		a.methodA();
		
		
//		Computer c1 = new Computer(); abstractŬ������ ��ü ������ �� ����
		DeskTop c2 = new DeskTop();
//		NoteBook c3 = new NoteBook();
		MyNoteBook c4 = new MyNoteBook ();
		c2.display();
		c2.typing();
//		c4

	}

}
