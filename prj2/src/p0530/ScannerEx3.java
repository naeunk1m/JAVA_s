package p0530;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �Է�");
		int radius  = sc.nextInt();
		
		final double PI = 3.141592;
		double area = radius*radius*PI;
	
		System.out.println("���� ������ "+area+"�Դϴ�");
	}

}
