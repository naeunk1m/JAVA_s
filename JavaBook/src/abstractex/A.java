package abstractex;

public abstract class A {
	
	abstract void methodA();

}

class B extends A{
	@Override
	void methodA() {
		System.out.println("������ �޼���A");
	}
}