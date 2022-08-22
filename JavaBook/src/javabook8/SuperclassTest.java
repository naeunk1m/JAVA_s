package javabook8;

public class SuperclassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		System.out.println(sub.valueSub+" , " + sub.valueSuper);
		sub.methodSub();
		sub.methodSuper();
		Super s1 = new Sub(); // 자동형변환 (업캐스팅)
		s1.valueSuper = 500;
//슈퍼타입	s1.valueSub = 600; X
		s1.methodSuper();
//슈퍼타입	s1.mehtodSub(); X
		
		sub = (Sub)s1; // 수동형변환(다운캐스팅)
//		sub = s1; s1은 슈퍼타입으로 sub타입인 sub에게 넘겨줄 수 없음.
//		Sub s2 = (Sub)(new Super()); // 수동형변환, 다운캐스팅
		// 문법적으로는 눈에띄는 문제가 없지만 실행시키면 오류가 발생함.
		sub.methodSub();
		sub.methodSuper();
		
		if (sub instanceof Sub) {System.out.println("sub는 Sub타입");}
		if (s1 instanceof Sub) {System.out.println("s1는 Sub타입");}
		if (sub instanceof Super) {System.out.println("Sub는 Super타입");}
		if (s1 instanceof Super) {System.out.println("s1는 Super타입");}
		if (sub instanceof Object) {System.out.println("Sub는 Object타입");}
		
		
	
	}

}

class Super {
	Super(int valueSuper) {
		this.valueSuper = valueSuper;
	}
	Super(){System.out.println("슈퍼 생성자");}
	int valueSuper = 200;
	void methodSuper() {
		System.out.println("슈퍼메서드 실행");
	}
}

class Sub extends Super {
	// Sub() {super();} 위의 Super클래스에도 이 부분이 생략되어 있음.
	int valueSub = 300;
	@Override
	void methodSuper() {
		
	}
	void methodSub() {
		System.out.println("서브메서드 실행");
	}
}

