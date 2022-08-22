package array;

import java.util.Scanner;

public class ArrayEx2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array1 = new int [3]; //array1[0], array1[1],array1[2]
		
		int sum = 0; //초기값 0 설정.
		int max = Integer.MIN_VALUE; 
		// 초기값을 0으로 설정하면 음수를 기입 시 최대값에서 정확한 값이 나오지 않음.
		// static 멤버변수로 객체생성하지 않아도 사용할 수 있음. 상수.
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i<array1.length; i++) {
			System.out.println("정수를 입력하세요.");
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
		
		System.out.println("합계 :"+ sum);
		System.out.println("최대값 :"+ max);
		System.out.println("최소값 :"+ min);
			
	}
}
