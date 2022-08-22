package p0602;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=3; i++) {
			System.out.println("정수입력 >>>");
			int num = sc.nextInt();
			sum+=num; // sum=sum+num;
		}
		int avg = sum/3;
		//System.out.println(i); for문 안에서 선언되었으므로 i를 인식하지 못함.
		//System.out.println(num); 위와 같은 이유로 인식하지 못함.
		System.out.println("합계 :"+sum+" 평균 :"+avg);
	
		

	}

}
