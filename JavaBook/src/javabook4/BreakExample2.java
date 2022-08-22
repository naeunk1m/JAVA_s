package javabook4;

public class BreakExample2 {

	public static void main(String[] args) {
		int sum =0;
		int num =0;
		
		for (num =0; ; num++) {
			sum += num;
			if(sum>=100)
				break;
		}
		System.out.println("num : " +num);
		System.out.println("sum : " +sum);
		
		
		int sum1 =0;
		int num1 ;
		for (num1 =1; ; num1++) {
			sum1 += num1;
			if(sum1 >= 500)
				break;
		}
		System.out.println(sum1);
		System.out.println(num1);
		
	}

}
