package p0602;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=3; i++) {
			System.out.println("�����Է� >>>");
			int num = sc.nextInt();
			sum+=num; // sum=sum+num;
		}
		int avg = sum/3;
		//System.out.println(i); for�� �ȿ��� ����Ǿ����Ƿ� i�� �ν����� ����.
		//System.out.println(num); ���� ���� ������ �ν����� ����.
		System.out.println("�հ� :"+sum+" ��� :"+avg);
	
		

	}

}
