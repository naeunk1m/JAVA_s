package classpart;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1;//변수 선언. s1은 student 타입이라고 선언.
		s1=new Student();//객체생성
		s1.address = "부산";
		s1.grade=1;
		s1.sudentID=1;
		s1.studentName="홍길동";
		
		s1.printName(); //void형태로 호출하는 역할. 메서드 호출

		
		System.out.println(s1.studentName+" "+s1.address);
		
		
		
		Student s2;//변수 선언. s1은 student 타입이라고 선언.
		s2=new Student();//객체생성
		s2.address = "부산";
		s2.grade=1;
		s2.sudentID=1;
		s2.studentName="홍길동";
		
		s2.printName();
		
		System.out.println(s2.studentName+" "+s2.address);
		
		Person p1;
		p1=new Person();
		p1.gender ='F';
		p1.height=150;
		p1.name="이름";
		p1.weight=150;
		p1.married=false;
		
		System.out.println(p1.height+" "+p1.weight);
		
	}

}
