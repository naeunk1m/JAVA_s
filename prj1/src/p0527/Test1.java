package p0527;

public class Test1 {

	public static void main(String[] args) {
		//蹂�������
		byte a ;
		a=100;
		// a=128; byte濡� 蹂��� �ㅼ������ 踰���(127~-128)瑜� 踰��대��硫� �ㅻ�
		
		long b = 10000000L; 
		
		float c = 0.1f;
		
		// ���� �� 蹂���
		c = b;
		b = (int)c;
		
		char d = 'a';
		System.out.println(d);
		
		boolean e ;
		e = true;
		
		String f = "abcdef@ 123";
		
		int g = 'a';
		System.out.println((char)g);
		
		byte i = 10;
		byte j = (byte)(i+100);
		b = b+1;
		g = g+'b';
		f = "abc"+g;
		System.out.println(g+""); 
		// ������ g媛� ���� 鍮� 臾몄���댁�� 媛��� 臾몄�����쇰� 蹂�寃쎈��.
		
		boolean bfood = true;
		boolean lfood = false;
		System.out.println(bfood & lfood);
		System.out.println(!bfood | lfood);
		
		int age = 15;
		System.out.println(age < 18);
	
		age=age+5; //age=age+5; age+=5;
		age++;
		age--;
		
		System.out.println(age++);
		System.out.println(age);
		
		String result = age >= 18 ? "�깆��":"誘몄�깅����";
		//臾몄�� : ���� 90�� �댁���대㈃ A, 80�� �댁���대㈃ B, ��癒몄��� C
		//d가나ㅏ다라마ㅏㄷ 
		
		int score = 75;
		result = score>=90 ? "A":(score>=80)? "B":"C";
		System.out.println(result);
		
		
		
	}

}
