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
	System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
	
	// 200���� 300������ ��.
	int num1 = 200;
	int sum1 = 0;
	
	while(num1 >= 200 && num1 <=300){
		sum1 += num1;
		num1 ++;
	}
	System.out.println("200���� 300������ ����" + sum1 + "�Դϴ�.");

	
		int num2 = 200;
		int sum2 = 0;
		while(num2<=300){
		sum2+=num2;
		num2++;
		}
		System.out.println("200���� 300������ ����" + sum2);

	}
	

}
