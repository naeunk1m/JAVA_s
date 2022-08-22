package inheritance;

public class VariableTest {

	public static void main(String[] args) {
		Child child = new Child();
		child.jump();
		
		Parent p = new Parent();
		p.jump();
		
		Parent p1 = new Child(); //자동 형변환, 업캐스팅, 암시적, 묵시적 형변환
		p1.jump(); // 메모리에 올라간 점프를 실행한다.
		
		Child child2 = (Child)p1; // 수동 형변환, 다운캐스팅, 명시적 형변환
		
	}

}

class Parent{
	void jump() {
		System.out.println("1배 점프");
	}

	}


class Child extends Parent{
	@Override
	void jump() {
		System.out.println("2배 점프");
	}
}