package inheritance;

public class VariableTest {

	public static void main(String[] args) {
		Child child = new Child();
		child.jump();
		
		Parent p = new Parent();
		p.jump();
		
		Parent p1 = new Child(); //�ڵ� ����ȯ, ��ĳ����, �Ͻ���, ������ ����ȯ
		p1.jump(); // �޸𸮿� �ö� ������ �����Ѵ�.
		
		Child child2 = (Child)p1; // ���� ����ȯ, �ٿ�ĳ����, ����� ����ȯ
		
	}

}

class Parent{
	void jump() {
		System.out.println("1�� ����");
	}

	}


class Child extends Parent{
	@Override
	void jump() {
		System.out.println("2�� ����");
	}
}