package packageInterfaceEx;

public interface A {
		// ���  +�������
		// �߻�޼���  +default �޼���, static �޼���, private �޼���
	abstract void methodA(); //abstract ���� ����
}
interface B {
	void methodB(); // abstract ���� ����
}
class D {}
class C extends D  implements A,B { 
	
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}
}
