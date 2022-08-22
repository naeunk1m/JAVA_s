package packageInterfaceEx;

public interface A {
		// 상수  +멤버변수
		// 추상메서드  +default 메서드, static 메서드, private 메서드
	abstract void methodA(); //abstract 생략 가능
}
interface B {
	void methodB(); // abstract 생략 가능
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
