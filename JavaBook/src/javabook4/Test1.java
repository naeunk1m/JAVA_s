package javabook4;

public class Test1 {
	public static void main(String[ ] args) {
		String A = "2";
		
		switch(A) {
		case "1��":
			System.out.println("1�� �౹�Դϴ�.");
			break;
		case "2��":
			System.out.println("2�� �����ܰ��Դϴ�.");
			break;
		case "3��":
			System.out.println("3�� �Ǻΰ��Դϴ�.");
			break;
		case "4��":
			System.out.println("4�� ġ���Դϴ�.");
			break;
		case "5��":
			System.out.println("5�� �ｺŬ���Դϴ�.");
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


