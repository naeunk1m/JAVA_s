package javabook12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return (o1.compareTo(o2))*-1;
	}
}

public class ComparatorTest {
	public static void main(String[]args) {
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
	}
	
public class Test{
	public static void main(String[]args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(4);
		list.add(200);
		list.add(10);
		Collections.sort(list, new MyComparator());
		System.out.println(list);
	}
	
}

}
class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return (o1-o2)*-1;
	}
}
