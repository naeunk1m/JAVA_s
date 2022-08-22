package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		Random rand = new Random();
		
		while (lotto.size()<7) {
			int num = rand.nextInt(45)+1;
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		for(int i=0; i<lotto.size();i++)
		System.out.println(lotto.get(i));
		
		Collections.sort(lotto);
		
		for(int data : lotto) {
			System.out.println(data);
			
		}
	}

}
