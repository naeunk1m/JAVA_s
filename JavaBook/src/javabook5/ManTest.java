package javabook5;

public class ManTest {

	public static void main(String[] args) {
		Man man = new Man();
		man.setAge(40);
		man.setName("man kim");
		man.setMarried(true);
		man.setChild(2);
		
		System.out.println("이름: "+man.getName()+","+" 나이: "+man.getAge());

	}

}
