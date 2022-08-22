package javabook12;

import java.util.Random;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		Random rand = new Random();
		TreeSet<Integer> set = new TreeSet<>();
		
		
		while(set.size()<6) {
		int num = rand.nextInt(45)+1;
		set.add(num);
		}
		
		
		for(int lottoNum : set) {
			System.out.println(lottoNum);
		}
		int num = rand.nextInt(45)+1;
		System.out.println("º¸³Ê½º"+num);
	}

}
