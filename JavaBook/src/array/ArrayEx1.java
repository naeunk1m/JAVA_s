package array;

public class ArrayEx1 {

	public static void main(String[] args) {
		char [] ch = new char [10]; // ch[0], ch[1],... ch[9], ch.length=10
		
		for(int i = 0; i<ch.length; i++) {
			System.out.println("ch["+i+"]="+ch[i]);
		}
		 
		boolean [] b = new boolean [3];
		
		for(int i = 0; i<b.length; i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
//		char [] ch1 = new char [3]; //ch[0]=, ch[1], ch[2], ch.length=3
//		char [] ch1;
//		ch1= new char[3];
//		
//		char [] ch2 = new char [] {' ',' ',' '};
//		char [] ch2;
//		ch2 = new char [] {' ',' ',' '}
//		
//		char [] ch3 = {' ',' ',' '};
//		char [] ch3;
//		ch3= {' ',' ',' '}; //x
	}

}
