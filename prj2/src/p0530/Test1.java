package p0530;

public class Test1 {

	public static void main(String[] args) {
		//변수 : 데이터를 저장하는 위치 - 변수 선언
		int a = 0; //초기값
		// a = 100;
		System.out.println(a);
		double b = a; //자동 형변환
		System.out.println(b);
		a=(int)b;// 수동 형변환

		char c = 'a';
		a = c; //자동 형변환
		System.out.println(a);
		System.out.println(c);
		System.out.println((char)a);// 수동 형변환
		
		int value1=100, value2=200;
		String result = value1 > value2 ? "value1이 크다." : "value2가 더 크지롱";
	}

}
