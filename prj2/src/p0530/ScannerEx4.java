package p0530;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ʸ� �Է��ϼ���.");
		int time = sc.nextInt();
		
		
		int h=time/3600;
		int m=(time%3600)/60; //time -(hour*3600)
		int s=time%60;
		System.out.println(h+"�ð�"+m+"��"+s+"��");

	}

}
