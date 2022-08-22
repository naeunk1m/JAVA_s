package javabook11;

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Circle circle = new Circle(10,20,30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}

}
