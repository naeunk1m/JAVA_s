package polymorphism;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B(); // A 부모, B 자녀
		
//		a = b; // 자동형변환
//		b = (B)a; //a는 A의 타입. 선언한 것의 타입을 의미. 수동형변환
//		// 상속의 관계에서는 형변환 가능
//		// 자동형변환과 수동형변환
//		// 자동형변환 : 자녀의 값이 부모 타입으로 변환되어 질 때
//		// 수동형변환 : 부모가 자녀타입으로 변환하려고 할 때
//		
//		A c = new A();//A타입
//		b = (B)c; //수동형변환
		
		a.memberA = 100;
		b.memberA = 20;
		b.memberB = 30;
		
		a = b; //자동형변환
		System.out.println(a.memberA); //
		
		b=(B)b; //수동형변환
		System.out.println(b.memberA); //20
		System.out.println(b.memberB); //30
		
	}

}
