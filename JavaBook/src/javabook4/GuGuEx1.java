package javabook4;

public class GuGuEx1 {

	public static void main(String[] args) {
		// 구구단 5단을 계산하는 프로그램을 작성해보시오.
		
		for(int i=1; i<=9; i++) {
			System.out.println("5*"+i+"="+(5*i));
		}
		//3단의 구구단
		for(int i1=1; i1<=9; i1++) {
			System.out.println("3*"+i1+"="+(3*i1));
		}
		//4단의 구구단도
		for(int i2=1; i2<=9; i2++) {
			System.out.println("4*"+i2+"="+(4*i2));
		}
		//5단의 구구단		
		for(int i3=1; i3<=9; i3++) {
			System.out.println("5*"+i3+"="+(5*i3));
		}
		
		
		for (int dan  =3; dan<=5; dan++) {
			//5단의 구구단
		for (int ii = 1; ii <=9; ii++) {
			System.out.println(dan+"*"+ii+"="+(dan*ii));
		}
		}
		for (int dan  =3; dan<=7; dan++) {
			//5단의 구구단
		for (int ii = 1; ii <=9; ii++) {
			System.out.println(dan+"*"+ii+"="+(dan*ii));
		}
		}
	}
		
	

}
