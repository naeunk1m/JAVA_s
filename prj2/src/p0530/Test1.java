package p0530;

public class Test1 {

	public static void main(String[] args) {
		//���� : �����͸� �����ϴ� ��ġ - ���� ����
		int a = 0; //�ʱⰪ
		// a = 100;
		System.out.println(a);
		double b = a; //�ڵ� ����ȯ
		System.out.println(b);
		a=(int)b;// ���� ����ȯ

		char c = 'a';
		a = c; //�ڵ� ����ȯ
		System.out.println(a);
		System.out.println(c);
		System.out.println((char)a);// ���� ����ȯ
		
		int value1=100, value2=200;
		String result = value1 > value2 ? "value1�� ũ��." : "value2�� �� ũ����";
	}

}
