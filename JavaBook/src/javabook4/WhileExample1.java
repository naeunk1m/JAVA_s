package javabook4;

public class WhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num =1;
			int sum =0;
			
			while(num<=10) {
				sum += num;
				num ++;
			}
	System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	
	// 200부터 300까지의 합.
	int num1 = 200;
	int sum1 = 0;
	
	while(num1 >= 200 && num1 <=300){
		sum1 += num1;
		num1 ++;
	}
	System.out.println("200부터 300까지의 합은" + sum1 + "입니다.");

	
		int num2 = 200;
		int sum2 = 0;
		while(num2<=300){
		sum2+=num2;
		num2++;
		}
		System.out.println("200부터 300까지의 합은" + sum2);

	}
	

}
