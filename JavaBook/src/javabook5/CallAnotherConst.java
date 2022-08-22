package javabook5;

class person {
	String name;
	int age;
	
	person() {
		this("이름 없음", 1);
		
	}
	
	person(String name, int age) {
		this.name=name;
		this.age=age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		person noName = new person();
		System.out.println(noName.name);
		System.out.println(noName.age);

	}

}
