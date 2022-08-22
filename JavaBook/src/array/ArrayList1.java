package array;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList<>();

		numbers.add(100);
		numbers.add(101);
		numbers.add(102);
		numbers.add(103);
		numbers.add(104);
		
		System.out.println(numbers.size());
		numbers.remove(2);
		
		for(int data : numbers) 
			System.out.println(data);
		
		if(numbers.contains(104)) System.out.println("있음");
		else System.out.println("없음");
		System.out.println(numbers.get(3));
		
		}
	}


