package polymorphism;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B(); // A �θ�, B �ڳ�
		
//		a = b; // �ڵ�����ȯ
//		b = (B)a; //a�� A�� Ÿ��. ������ ���� Ÿ���� �ǹ�. ��������ȯ
//		// ����� ���迡���� ����ȯ ����
//		// �ڵ�����ȯ�� ��������ȯ
//		// �ڵ�����ȯ : �ڳ��� ���� �θ� Ÿ������ ��ȯ�Ǿ� �� ��
//		// ��������ȯ : �θ� �ڳ�Ÿ������ ��ȯ�Ϸ��� �� ��
//		
//		A c = new A();//AŸ��
//		b = (B)c; //��������ȯ
		
		a.memberA = 100;
		b.memberA = 20;
		b.memberB = 30;
		
		a = b; //�ڵ�����ȯ
		System.out.println(a.memberA); //
		
		b=(B)b; //��������ȯ
		System.out.println(b.memberA); //20
		System.out.println(b.memberB); //30
		
	}

}
