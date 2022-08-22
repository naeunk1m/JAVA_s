package javabook4;

public class ArrayEx1 {

	public static void main(String[] args) {
		char ch[] = new char[3];
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		
		for(int i=0; i<3; i++) {
			System.out.println("ch["+i+"]="+ch[i]);
			
			int[] arr = new int [3]; //arr[0], arr[1], arr[2], arr는 참조형 변수.
			System.out.println(arr); 
		}

	}

}
