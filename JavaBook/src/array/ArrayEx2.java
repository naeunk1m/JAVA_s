package array;

import java.util.Scanner;

public class ArrayEx2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array1 = new int [3]; //array1[0], array1[1],array1[2]
		
		int sum = 0; //�ʱⰪ 0 ����.
		int max = Integer.MIN_VALUE; 
		// �ʱⰪ�� 0���� �����ϸ� ������ ���� �� �ִ밪���� ��Ȯ�� ���� ������ ����.
		// static ��������� ��ü�������� �ʾƵ� ����� �� ����. ���.
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i<array1.length; i++) {
			System.out.println("������ �Է��ϼ���.");
			array1[i] = sc.nextInt();
			sum += array1[i];// sum = sum+array1[i]
			if(max < array1[i]) {
				max=array1[i];}
			if(min > array1[i]) {
				min=array1[i];}
			
			
		}
		for(int i = 0; i<array1.length; i++) {
			System.out.println("array1["+i+"] ="+array1[i]);
		}
		
		System.out.println("�հ� :"+ sum);
		System.out.println("�ִ밪 :"+ max);
		System.out.println("�ּҰ� :"+ min);
			
	}
}
