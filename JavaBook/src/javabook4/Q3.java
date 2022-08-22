package javabook4;

public class Q3 {

	public static void main(String[] args) {
		for (int dan  =2; dan<=9; dan++) {
		
		for (int ii = 1; ii <=9; ii++) {
			if(ii>dan)break;
			System.out.println(dan+"*"+ii+"="+(dan*ii));
		}
		System.out.println();
		}
	}

}
