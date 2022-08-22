package javabook4;

public class Test1 {
	public static void main(String[ ] args) {
		String A = "2";
		
		switch(A) {
		case "1Ãş":
			System.out.println("1Ãş ¾à±¹ÀÔ´Ï´Ù.");
			break;
		case "2Ãş":
			System.out.println("2Ãş Á¤Çü¿Ü°úÀÔ´Ï´Ù.");
			break;
		case "3Ãş":
			System.out.println("3Ãş ÇÇºÎ°úÀÔ´Ï´Ù.");
			break;
		case "4Ãş":
			System.out.println("4Ãş Ä¡°úÀÔ´Ï´Ù.");
			break;
		case "5Ãş":
			System.out.println("5Ãş Çï½ºÅ¬·´ÀÔ´Ï´Ù.");
			break;
		}
		
		int num;
		
		for(num=1; num<=100; num++) {
			if (num%3!=0)
				continue;
			System.out.println(num);
		}
				
	}
}


