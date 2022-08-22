package javabook4;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		
		for(int i=0;i<3;i++) {
			System.out.print("이름을 입력하시오.>>>");
			name[i]=sc.next();
		}

		for(int i=0;i<3;i++)
		System.out.println("name["+i+"] = "+name[i]);
	}

}
