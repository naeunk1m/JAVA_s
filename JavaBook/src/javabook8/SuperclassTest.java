package javabook8;

public class SuperclassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		System.out.println(sub.valueSub+" , " + sub.valueSuper);
		sub.methodSub();
		sub.methodSuper();
		Super s1 = new Sub(); // �ڵ�����ȯ (��ĳ����)
		s1.valueSuper = 500;
//����Ÿ��	s1.valueSub = 600; X
		s1.methodSuper();
//����Ÿ��	s1.mehtodSub(); X
		
		sub = (Sub)s1; // ��������ȯ(�ٿ�ĳ����)
//		sub = s1; s1�� ����Ÿ������ subŸ���� sub���� �Ѱ��� �� ����.
//		Sub s2 = (Sub)(new Super()); // ��������ȯ, �ٿ�ĳ����
		// ���������δ� ������� ������ ������ �����Ű�� ������ �߻���.
		sub.methodSub();
		sub.methodSuper();
		
		if (sub instanceof Sub) {System.out.println("sub�� SubŸ��");}
		if (s1 instanceof Sub) {System.out.println("s1�� SubŸ��");}
		if (sub instanceof Super) {System.out.println("Sub�� SuperŸ��");}
		if (s1 instanceof Super) {System.out.println("s1�� SuperŸ��");}
		if (sub instanceof Object) {System.out.println("Sub�� ObjectŸ��");}
		
		
	
	}

}

class Super {
	Super(int valueSuper) {
		this.valueSuper = valueSuper;
	}
	Super(){System.out.println("���� ������");}
	int valueSuper = 200;
	void methodSuper() {
		System.out.println("���۸޼��� ����");
	}
}

class Sub extends Super {
	// Sub() {super();} ���� SuperŬ�������� �� �κ��� �����Ǿ� ����.
	int valueSub = 300;
	@Override
	void methodSuper() {
		
	}
	void methodSub() {
		System.out.println("����޼��� ����");
	}
}

