package p0530;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력");
		int radius  = sc.nextInt();
		
		final double PI = 3.141592;
		double area = radius*radius*PI;
	
		System.out.println("원의 면적은 "+area+"입니다");
	}

}
