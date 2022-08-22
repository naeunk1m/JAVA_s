package packageInterfaceEx;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass mClass = new Myclass();
		
		X xClass = mClass;
		xClass.x();
		
		Y yClass = mClass;
		yClass.y();
		
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();

	}

}
