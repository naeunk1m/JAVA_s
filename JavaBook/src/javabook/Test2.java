package javabook;

public class Test2 {

	public static void main(String[] args) {
		double dnum=1;
		
		for(int i=0; i<10000; i++) {
			dnum=dnum+0.1;
		}
		System.out.println(dnum);
		
		double d1 = 2.0;
		double d2 = 1.1;
		System.out.println(d1-d2);
	}

}
